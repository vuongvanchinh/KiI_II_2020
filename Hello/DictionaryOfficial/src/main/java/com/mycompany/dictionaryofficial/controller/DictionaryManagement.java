package com.mycompany.dictionaryofficial.controller;

import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import com.mycompany.dictionaryofficial.models.*;
import com.mycompany.dictionaryofficial.view.CrudView;
import com.mycompany.dictionaryofficial.view.GoogleView;
import com.mycompany.dictionaryofficial.view.HomeView;
import com.mycompany.dictionaryofficial.view.MainFrame;
import javax.swing.SwingUtilities;

public class DictionaryManagement {
   private MainFrame mainFrame;
   private CrudView crudView;
   private Dictionary dictionary;
   private GoogleView googleView;
   private HomeView homeView;
   
   
   // format output
   private static final String HTML_FORMAT = "<html><body>%s</body></html>";
   // private static final String H1 = "<h1 style = '%s'>%s</h1>";
   // private static final String H2 = "<h2 style = '%s'>%s</h2>";
   // private static final String UL = "<ul style = '%s'>%s</ul>";
   // private static final String LI = "<li style = '%s'>%s</li>";
   // private static final String DIV = "<div style = '%s'></div>";
   private static final String P =  "<p style = '%s'>%s</p>";
   


   public DictionaryManagement(HomeView view) {
      this.homeView = view;
      view.addTranslateTextBtnListener(new GoogleTranslateListener());
      view.addLookupBtnListener(new LookupListener());

      mainFrame = new MainFrame();
      crudView = new CrudView();
      googleView = new GoogleView();
      googleView.addHomeBtnListener(new HomeBtnListener());

      dictionary = new Dictionary();
      dictionary.insertFromFile();
      mainFrame.addListViewListener(new ListViewListener());
      mainFrame.addHistoryViewListener(new HistoryViewListener());
      mainFrame.addAddBtnListener(new AddBtnListener());
      mainFrame.addEditBtnListener(new EditBtnListener());
      mainFrame.addDeleteBtnListener(new DeleteListener());
      mainFrame.addSearchBtnListener(new SearchListener());
      mainFrame.addSearchBoxFocusListener(new SearchBoxFocusListener());
      mainFrame.addListSelectionListener(new ListWordSelectionListener());
      mainFrame.addSearchBoxListener(new SearchBoxSuggestionListener());
      mainFrame.addSuggestionListener(new SuggestionListener());
      mainFrame.addHomeBtnListener(new HomeBtnListener());
      crudView.addCrudBtnListener(new CreateEditListener());
      crudView.addBackListener(new BackBtnListener());
   }

   public void showMainView() {
      homeView.setVisible(false);
      crudView.setVisible(false);
      mainFrame.setVisible(true);
      mainFrame.showList(dictionary.getWordTargets(0));  
   }

   public void showCrudView() {
      mainFrame.setVisible(false);
      crudView.setVisible(true);
   }

   public void showHomeView() {
      homeView.setVisible(true);
      mainFrame.setVisible(false);
      googleView.setVisible(false);
   }

   public void showGoogleView() {
      googleView.setVisible(true);
      homeView.setVisible(false);
   }

   
   public  void showResultSearch(List<Word> result) {
      if(result.isEmpty()) {
         mainFrame.showDetailContent(String.format(HTML_FORMAT,"<h2>There is no result.</h2>"));
      } else {
         StringBuilder sb = new StringBuilder();
         sb.append(String.format(P,"font-size:18px;", "There are " + result.size() + " results."));
         for (Word word : result) {
            sb.append(word.getHTMLFormat());
         }
         mainFrame.showDetailContent(sb.toString());
      }
   }

   /**
    * class ListViewListener.
    */
   class ListViewListener implements ActionListener {
      static final int GET_IN_WORDS = 0;

      public void actionPerformed(ActionEvent e) {
         mainFrame.showList(dictionary.getWordTargets(GET_IN_WORDS));
      }
   }

   class HistoryViewListener implements ActionListener {
      static final int GET_IN_HISTORY = 1;
      public void actionPerformed(ActionEvent e) {
         mainFrame.showList(dictionary.getWordTargets(GET_IN_HISTORY));
      }
   }

   class AddBtnListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         crudView.initFormCreate();
         showCrudView();
      }
   }

   class EditBtnListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         int index = mainFrame.getListSelectedIndex();
         if (index < 0) {
            JOptionPane.showMessageDialog(mainFrame, "You have to select an word before!");
            return;
         }
         crudView.initFormEdit(dictionary.getWordAt(index));
         showCrudView();
      }
   }

   class AboutUsListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         
      }
   }

   class DeleteListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         int index = mainFrame.getListSelectedIndex();
         if (index < 0) {
            JOptionPane.showMessageDialog(mainFrame, "You have to select the word that you want to delete!");
            return;
         }
         int result = JOptionPane.showConfirmDialog(mainFrame,"Sure? You want to delete this word?", "Confirm",
                     JOptionPane.YES_NO_OPTION,
                     JOptionPane.QUESTION_MESSAGE);
         if(result == JOptionPane.YES_OPTION){
            if (dictionary.removeWordAt(index)) {
               mainFrame.showList(dictionary.getWordTargets(0));
               mainFrame.setListSelectionIndex(index - 1);
               JOptionPane.showMessageDialog(mainFrame, "Deleted successfully!");
            } else {
               JOptionPane.showMessageDialog(mainFrame, "Fail to delete!");
            }   
         }
         
      }
   }

   class LookupListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         showMainView();
      }
   }

   class GoogleTranslateListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         showGoogleView();
      }
   }


   class HomeBtnListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         showHomeView();
      }
   }

   class ListWordSelectionListener implements ListSelectionListener {
      public void valueChanged(ListSelectionEvent e) {
         int index = mainFrame.getListSelectedIndex();
         if (index >= 0) {
            Word selectWord = dictionary.getWordAt(index);
            System.out.println(selectWord.getWordTarget());
            String output = String.format(HTML_FORMAT, selectWord.getHTMLFormat());
            //System.out.println(output);
            mainFrame.showDetailContent(output);
           
         } else {
            mainFrame.showDetailContent("");
         }
      }
  }

   class SearchListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         String key = mainFrame.getSearchBoxValue();
         List<Word> result = dictionary.dictionarySearcher(key);
         mainFrame.hideSuggestion();
         showResultSearch(result);
      }
   }

   class SuggestionListener implements ListSelectionListener {
      public void valueChanged(ListSelectionEvent e) {
         String key = mainFrame.getSelectionSuggestionValue();
         List<Word> result = dictionary.dictionarySearcher(key);
         mainFrame.hideSuggestion();
         showResultSearch(result);
      }
   }

   class SearchBoxFocusListener implements FocusListener {

      public void focusGained(FocusEvent e) {
         // TO DO Auto-generated method stub
         

      }

      public void focusLost(FocusEvent e) {
         // TO DO Auto-generated method stub

      }

   }

   class BackBtnListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         showMainView();
         mainFrame.setListSelectionIndex(0);

      }
   }

   class SearchBoxSuggestionListener implements DocumentListener {
		public void changedUpdate(DocumentEvent e) {
        changed();
      }
		public void removeUpdate(DocumentEvent e) {
         changed();
		}
		public void insertUpdate(DocumentEvent e) {
			changed();
      }
      
		private void changed() {
         Runnable changed = new Runnable() {
            @Override
            public void run() {
               String key = mainFrame.getSearchBoxValue();
               System.out.println("key: " + key);
               if (key.equals("")) {
                  mainFrame.hideSuggestion();
                  return;
               }
               List<Word> words = dictionary.dictionarySearcher(mainFrame.getSearchBoxValue());
               String[] data  = new String[words.size()];
               if (words.isEmpty()) {
                  mainFrame.hideSuggestion();
                  return;
               } 
               int i = 0;
               for (Word word : words) {
                  data[i] = word.getWordTarget(); 
                  i++;
               }
               mainFrame.showSuggestionList(data);
            }
        };       
        SwingUtilities.invokeLater(changed);
		}
	}

   
   /**
    * Event create or edit word in the dictionary.
    */
   class CreateEditListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         String[] data = crudView.getData();
         int index = dictionary.binarySearch(data[0]);
         int selectionIndex = mainFrame.getListSelectedIndex();   
         if (e.getActionCommand().equals("create")) {
            if (index == -1) {
               dictionary.addNewWord(new Word(data[0], data[1], data[2], data[3], data[4], data[5]));
               JOptionPane.showMessageDialog(crudView,"Successfully created!");
               crudView.initFormCreate();
            } else {
               int result = JOptionPane.showConfirmDialog(mainFrame,
                                 "This word already exists? Do you want to replace it?",
                                 "Confirm",
                                 JOptionPane.YES_NO_OPTION,
                                 JOptionPane.QUESTION_MESSAGE);
               if(result == JOptionPane.YES_OPTION) {
                  dictionary.editWordAt(data, index);
                  JOptionPane.showMessageDialog(crudView,"Replaced successfully!");
                  crudView.initFormCreate();
               }
            }

         } else { // edit command 
            if (index == selectionIndex) {
               dictionary.getWordAt(selectionIndex).update(data);
               JOptionPane.showMessageDialog(crudView,"Successfully edited!");
               showMainView();
               mainFrame.setListSelectionIndex(index);
            } else if (index == -1) {
               dictionary.editWordAt(data,  selectionIndex);
            } else {
               int result = JOptionPane.showConfirmDialog(mainFrame,
                  "This word is the same as another word that exist in the dictionary. Do you want to replace it?",
                  "Confirm",
                  JOptionPane.YES_NO_OPTION,
                  JOptionPane.QUESTION_MESSAGE);
               if(result == JOptionPane.YES_OPTION) {
                  dictionary.removeWordAt(selectionIndex);
                  dictionary.getWordAt(index).update(data);
                  JOptionPane.showMessageDialog(crudView,"Successfully replaced!");
                  showMainView();
                  mainFrame.setListSelectionIndex(index);
               } 
            }
         }
      }
   }
}
