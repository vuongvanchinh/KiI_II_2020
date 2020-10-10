/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dictionaryofficial.view;

import javax.swing.*;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.mycompany.dictionaryofficial.models.*;
import java.util.List;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener ;
import java.awt.event.MouseEvent;
import java.awt.*;
import  java.lang.Thread; 
/**
 *
 * @author Dell
 */
public class MainFrame extends javax.swing.JFrame implements ActionListener, ListSelectionListener{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topBar = new javax.swing.JPanel();
        listViewBtn = new javax.swing.JButton();
        historyViewBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        engNamTitle = new javax.swing.JLabel();
        searchBox = new javax.swing.JTextField();
        listContainer = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        container = new javax.swing.JLayeredPane();
        rightBar = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        aboutUsBtn = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        speakBtn = new javax.swing.JButton();
        suggestionContainer = new javax.swing.JPanel();
        suggestionSwap = new javax.swing.JScrollPane();
        suggestionList = new javax.swing.JList<>();
        mainScrollPane = new javax.swing.JScrollPane();
        mainDisplay = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        topBar.setBackground(new java.awt.Color(51, 133, 169));

        listViewBtn.setBackground(new java.awt.Color(32, 209, 147));
        listViewBtn.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        listViewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dictionaryofficial/images/list.png"))); // NOI18N
        listViewBtn.setText("List");

        historyViewBtn.setBackground(new java.awt.Color(98, 161, 169));
        historyViewBtn.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        historyViewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dictionaryofficial/images/history.png"))); // NOI18N
        historyViewBtn.setText("History");

        searchBtn.setBackground(new java.awt.Color(87, 207, 155));
        searchBtn.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dictionaryofficial/images/search.png"))); // NOI18N
        searchBtn.setText("Search");
        searchBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));

        homeBtn.setBackground(new java.awt.Color(255, 204, 204));
        homeBtn.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dictionaryofficial/images/home.png"))); // NOI18N
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        engNamTitle.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        engNamTitle.setForeground(new java.awt.Color(255, 128, 0));
        engNamTitle.setText(" English - Vietnamese");

        searchBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchBox.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(0, 255, 255)));

        javax.swing.GroupLayout topBarLayout = new javax.swing.GroupLayout(topBar);
        topBar.setLayout(topBarLayout);
        topBarLayout.setHorizontalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addComponent(listViewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(historyViewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(engNamTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBox)
                .addGap(0, 0, 0)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        topBarLayout.setVerticalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(historyViewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(engNamTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(listViewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        list.setBackground(new java.awt.Color(0, 140, 186));
        list.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(51, 255, 255))); // NOI18N
        list.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        list.setModel(new DefaultListModel<>());
        list.setFixedCellHeight(35);
        listContainer.setViewportView(list);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rightBar.setBackground(new java.awt.Color(153, 204, 255));

        addBtn.setBackground(new java.awt.Color(0, 178, 226));
        addBtn.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dictionaryofficial/images/add.png"))); // NOI18N
        addBtn.setText("Add");

        deleteBtn.setBackground(new java.awt.Color(255, 102, 102));
        deleteBtn.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dictionaryofficial/images/delete.png"))); // NOI18N
        deleteBtn.setText("Delete");

        editBtn.setBackground(new java.awt.Color(153, 255, 204));
        editBtn.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dictionaryofficial/images/edit.png"))); // NOI18N
        editBtn.setText("Edit");

        aboutUsBtn.setBackground(new java.awt.Color(5, 188, 122));
        aboutUsBtn.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        aboutUsBtn.setText("About us");
        aboutUsBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        aboutUsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightBarLayout = new javax.swing.GroupLayout(rightBar);
        rightBar.setLayout(rightBarLayout);
        rightBarLayout.setHorizontalGroup(
            rightBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightBarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(aboutUsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        rightBarLayout.setVerticalGroup(
            rightBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightBarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(rightBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(aboutUsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        container.setLayer(rightBar, javax.swing.JLayeredPane.PALETTE_LAYER);
        container.add(rightBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 840, 0));

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dictionaryofficial/images/up.png"))); // NOI18N
        menu.setActionCommand("show");
        menu.setBorderPainted(false);
        menu.setContentAreaFilled(false);
        menu.setPreferredSize(new java.awt.Dimension(50, 50));
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        container.setLayer(menu, javax.swing.JLayeredPane.PALETTE_LAYER);
        container.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, 30, 30));

        speakBtn.setBackground(new java.awt.Color(204, 235, 255));
        speakBtn.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        speakBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dictionaryofficial/images/loa.png"))); // NOI18N
        speakBtn.setContentAreaFilled(false);
        speakBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speakBtnActionPerformed(evt);
            }
        });
        container.setLayer(speakBtn, javax.swing.JLayeredPane.PALETTE_LAYER);
        container.add(speakBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 30, -1));

        suggestionContainer.setBackground(new java.awt.Color(204, 255, 255));

        suggestionList.setBackground(new java.awt.Color(204, 255, 255));
        suggestionList.setModel(new DefaultListModel<>()
        );
        suggestionList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        suggestionList.setFixedCellHeight(30);
        suggestionList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                suggestionListValueChanged(evt);
            }
        });
        suggestionSwap.setViewportView(suggestionList);

        suggestionContainer.setVisible(false);

        javax.swing.GroupLayout suggestionContainerLayout = new javax.swing.GroupLayout(suggestionContainer);
        suggestionContainer.setLayout(suggestionContainerLayout);
        suggestionContainerLayout.setHorizontalGroup(
            suggestionContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(suggestionSwap, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        suggestionContainerLayout.setVerticalGroup(
            suggestionContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(suggestionSwap, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        container.setLayer(suggestionContainer, javax.swing.JLayeredPane.PALETTE_LAYER);
        container.add(suggestionContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 500, 90));

        mainScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        mainScrollPane.setBorder(null);

        mainDisplay.setEditable(false);
        mainDisplay.setContentType("text/html"); // NOI18N
        mainDisplay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mainDisplay.setForeground(new java.awt.Color(29, 42, 87));
        mainDisplay.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0; font-size:14px;\">\r\n      \rHere is my text;\n      noun\tused when meeting or greeting someone:\tHello, Paul. I haven't seen you for ages.\tI know her vaguely - we 've exchanged hellos a few times.\tI just thought I'd call by and say hello.\n    </p>\n\t<a href=\"google.com\">google.com</a>\n<button>Hello</button>\n    <p>Hello</p>\r\n  </body>\r\n</html>\r\n");
        mainScrollPane.setViewportView(mainDisplay);

        container.add(mainScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(listContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listContainer)
                    .addComponent(container)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TO DO add your handling code here:
    }//GEN-LAST:event_homeBtnActionPerformed

    private void aboutUsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsBtnActionPerformed
        // TO DO add your handling code here:
    }//GEN-LAST:event_aboutUsBtnActionPerformed

    private void speakBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speakBtnActionPerformed
        // TO DO add your handling code here:
    }//GEN-LAST:event_speakBtnActionPerformed
    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TO DO add your handling code here:
        if (menu.getActionCommand().equals("show")) {
            showMenu();
        } else {
            hideMenu();
        }
    }//GEN-LAST:event_menuActionPerformed

    private void suggestionListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_suggestionListValueChanged
        // TO DO add your handling code here:
        System.out.println(searchBox.getText() + " at " + suggestionList.getSelectedIndex());
        // System.out.println(suggestionList.getSelectedValue());
        //searchBox.setText(suggestionList.getSelectedValue());
        searchBtn.doClick();
        searchBox.setText(suggestionList.getSelectedValue());
        System.out.println(suggestionList.getSelectedValue());
    }//GEN-LAST:event_suggestionListValueChanged

    public void hideMenu() {
        Thread d = new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 1; i <= 30; i++) {
                        menu.setBounds(790, 420 + i, 32, 32);
                        rightBar.setBounds(0,450 + i,840, 30- i);
                        menu.setActionCommand("show");
                        Thread.sleep(1);
                    }
                    menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dictionaryofficial/images/up.png")));
                } catch (Exception e) {
                    
                }
            }
        };
        d.start();
    }

    public void showMenu() {
        Thread d = new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 1; i <= 30; i++) {
                        menu.setBounds(790, 450 - i, 30, 30);
                        //menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dictionaryofficial/images/exit.png")));
                        rightBar.setBounds(0,480 - i,840,i);
                        menu.setActionCommand("hide");
                        Thread.sleep(1);
                    }
                    menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dictionaryofficial/images/down.png")));
                } catch (Exception e) {
                    
                }
            }
        };
        d.start();
    }
    // public void showMenu(boolean flag) {

    // }

    public void setListSelectionIndex(int index) {
        if (index <= 0) {
            index = 0;
        }
        this.list.setSelectedIndex(index);
        this.list.ensureIndexIsVisible(index);
    }

    public void showDetailContent(String data) {
        mainDisplay.setText(data);        
    }

    public void showList(String[] data) {
        list.setListData(data);
        System.out.println(list.getSize());
    }
    
     public void showSuggestionList(String[] data)   {
        suggestionList.setListData(data);
        suggestionContainer.setVisible(true);
    }
    
    public int getSelectionSuggestionIndex() {
        return suggestionList.getSelectedIndex();
    }
    
    public void hideSuggestion() {
        suggestionContainer.setVisible(false);
        System.out.println("hided suggestion!");
    }

    public void valueChanged(ListSelectionEvent e) {
        // TO DO Auto-generated method stub
    }

    public void actionPerformed(ActionEvent e) {
    }
    

    public void addListViewListener(ActionListener listener) {
        listViewBtn.addActionListener(listener);
    }

    public void addSearchBoxFocusListener(FocusListener listener) {
        searchBox.addFocusListener(listener);
    }

    public void addHistoryViewListener(ActionListener listener) {
        historyViewBtn.addActionListener(listener);
    }

    public void addSearchBtnListener(ActionListener listener) {
        searchBtn.addActionListener(listener);
    }
    public void addHomeBtnListener(ActionListener listener) {
        homeBtn.addActionListener(listener);
    }

    public void addSpeakBtnListener(ActionListener listener) {
        speakBtn.addActionListener(listener);
    }

    public void addAddBtnListener(ActionListener listener) {
        addBtn.addActionListener(listener);
    }

    public void addEditBtnListener(ActionListener listener) {
        editBtn.addActionListener(listener);
    }

    public void addDeleteBtnListener(ActionListener listener) {
        deleteBtn.addActionListener(listener);
    }

    public void addAboutUsBtnListener(ActionListener listener) {
        aboutUsBtn.addActionListener(listener);
    }

    public void addListSelectionListener(ListSelectionListener listener) {
        list.addListSelectionListener(listener);
    }

    public void addSearchBoxListener(DocumentListener listener) {
        searchBox.getDocument().addDocumentListener(listener);
    }
    
    public int getListSelectedIndex() {
        return this.list.getSelectedIndex();
    }

    public String getSearchBoxValue() {
        return searchBox.getText().trim().toLowerCase();
    }    
    
    public void setSelectionSuggestionIndex(int index) {
        suggestionList.setSelectedIndex(index);
        suggestionList.ensureIndexIsVisible(index);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutUsBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JLayeredPane container;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel engNamTitle;
    private javax.swing.JButton historyViewBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JList<String> list;
    private javax.swing.JScrollPane listContainer;
    private javax.swing.JButton listViewBtn;
    private javax.swing.JTextPane mainDisplay;
    private javax.swing.JScrollPane mainScrollPane;
    private javax.swing.JButton menu;
    private javax.swing.JPanel rightBar;
    private javax.swing.JTextField searchBox;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton speakBtn;
    private javax.swing.JPanel suggestionContainer;
    private javax.swing.JList<String> suggestionList;
    private javax.swing.JScrollPane suggestionSwap;
    private javax.swing.JPanel topBar;
    // End of variables declaration//GEN-END:variables
}