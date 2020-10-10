package com.mycompany.dictionaryofficial;

import com.mycompany.dictionaryofficial.controller.DictionaryManagement;
import com.mycompany.dictionaryofficial.view.MainFrame;
import java.awt.EventQueue;


public class DictionaryApplication {
   public static void runApplication() {
      MainFrame mainFrame = new MainFrame();
      DictionaryManagement controller = new DictionaryManagement(mainFrame);
      controller.showMainView();
   }
   
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            runApplication();
         }
     });
   }
}
