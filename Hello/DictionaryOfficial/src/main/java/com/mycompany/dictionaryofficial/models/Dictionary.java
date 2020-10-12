package com.mycompany.dictionaryofficial.models;

import java.util.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class Dictionary {
   private List<Word> words;
   private List<Word> history;
   private static final int LIMIT_HISTORY = 20;

   public Dictionary() {
      words = new ArrayList<>();
      history = new ArrayList<>();
   }

   public List<Word> getHistory() {
      return history;
   }

   public void addToHistory(Word word) {
      if(history.size() > LIMIT_HISTORY ) {
         history.remove(LIMIT_HISTORY -1);
      }
      this.history.add(word);
   }

   public List<Word> getWords() {
      return words;
   }

   public void insertFromFile() {
      try {
         File myFile = new File("C:/Users/Dell/Desktop/Hello/DictionaryOfficial/src/main/java/com/mycompany/dictionaryofficial/file/dictionary.txt");
         
         /**
          * file" wordTarget   mean  pronunciation  partOfSpeech  Uses  ex1   ex2   ex3
          *             0        1           2           3        4    5      6     7
         */
         Scanner sc = new Scanner(myFile);
         String[] data = new String[5];
         while (sc.hasNextLine()) {
            data = sc.nextLine().split("\t", 5);
				Word newWord = new Word(data[0], data[1], data[2], data[3], data[4]);
				this.addNewWord(newWord);
			}
         sc.close();
      } catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }
   }

   public void dictionaryExportToFile() {
      try {
         FileWriter myWriter = new FileWriter("C:/Users/Dell/Desktop/Hello/DictionaryOfficial/src/main/java/com/mycompany/dictionaryofficial/file/dictionaryExportFile.txt");
         for (Word word : words) {
            myWriter.write(word.getWordTarget() + "\t" + word.getWordExplain() + "\n");
         }
         myWriter.close();
         System.out.println("Successfully wrote to the file.");
       } catch (IOException e) {
         System.out.println("An error occurred when trying to write file.");
         e.printStackTrace();
       }
   }

   // make sure that the word is unique.
   public int addNewWord(Word newWord) {
      String key = newWord.getWordTarget();
      int index = binarySearch(key);
      if (index == -1) {
         int i = 0;
         for (Word word : words) {
            if (word.getWordTarget().compareTo(key) > 0) {
               this.words.add(i, newWord);
               return i;
            }
            i ++;
         }
         this.words.add(newWord);
         return words.size();
      }
      return - index - 1;
   }

   // search with absolute precision.
   public int binarySearch(String wordTarget) {
      int left = 0;
      int right = this.words.size() -1;
      int mid;
      while (left <= right) {
         mid = left + (right - left) / 2;
         if (words.get(mid).getWordTarget().equals(wordTarget)) {
            return mid;
         }
         if (words.get(mid).getWordTarget().compareTo(wordTarget) < 0) {
            left = mid + 1;
         } else {
            right = mid -1;
         }
      }
      return -1;
   }

   public int relativeBinarySearch(String key) {
      int left = 0;
      int right = this.words.size() - 1;
      int mid;
      while (left <= right) {
         mid = left + (right -left) / 2;
         if (this.words.get(mid).getWordTarget().startsWith(key)) {
            return mid; 
         }
         if (words.get(mid).getWordTarget().compareTo(key) < 0) {
            left = mid + 1;
         } else {
            right = mid - 1;
         }
      }
      return -1;
   }

   public List<Word> dictionarySearcher(String key) {
      System.out.println("key in searcher " + key);
      List<Word> result = new ArrayList<>();
      if (key.equals("")) return result;
      int index = relativeBinarySearch(key);
      System.out.println("relativeBinarySearch result " + index);
      if (index == - 1) return result;
      while (index > 0 && this.words.get(index - 1).getWordTarget().startsWith(key)) {
         index --;
      }
      while (index < this.words.size() && this.words.get(index).getWordTarget().startsWith(key)) {
         result.add(this.words.get(index));
         System.out.println("add " + this.words.get(index).getWordTarget() + " to the result");
         index ++;
      }
      System.out.println("Size of found list word: " + result.size());
      return result;
   }

   /**
    * 
    * @param key
    * @return data in words list else return data in history list.
    */
   public String[] getWordTargets(int key) {
      ArrayList<String> result = new ArrayList<>();
      if (key == 0) {
         for (Word word : words) {
            result.add(word.getWordTarget());
         }
      } else {
         for (Word word : history) {
            result.add(word.getWordTarget());
         }
      }
      return result.toArray(new String[words.size()]);
   }

   public int getWordsSize() {
      return this.words.size();
   }

   public Word getWordAt(int index) {
      if (index <= this.getWordsSize() -1) {
         System.out.println(words.size());
         return this.words.get(index);
      }
      return new Word();
   }

   public void editWordAt(String[] data, int index) {
      this.words.get(index).update(data);
      while(index > 0 && this.words.get(index).getWordTarget().compareTo(this.words.get(index - 1).getWordTarget()) < 0) {
         Collections.swap(this.words, index, index - 1);
         index --;
      }
      while(index < this.getWordsSize() -1 && this.words.get(index).getWordTarget().compareTo(this.words.get(index + 1).getWordTarget()) > 0) {
         Collections.swap(this.words, index, index + 1);
         index ++;
      }
   }

   public boolean removeWordAt(int index) {
      try {
         this.words.remove(index);
         return true;
      } catch (Exception e) {
         System.out.println("Error occured when try to delete word at" + index);
      }
      return false;
   }
}
