package com.mycompany.dictionaryofficial;

import com.mycompany.dictionaryofficial.controller.DictionaryManagement;
import com.mycompany.dictionaryofficial.view.HomeView;
import java.awt.EventQueue;


public class DictionaryApplication {
   public static void runApplication() {
      HomeView homeView = new HomeView();
      DictionaryManagement controller = new DictionaryManagement(homeView);
      controller.showHomeView();
   }
   
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            runApplication();
         }
     });
   }
}
