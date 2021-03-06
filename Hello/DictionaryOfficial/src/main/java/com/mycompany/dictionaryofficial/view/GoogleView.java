/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dictionaryofficial.view;

import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.SwingUtilities;
import com.darkprograms.speech.translator.GoogleTranslate;

/**
 *
 * @author Dell
 */
public class GoogleView extends javax.swing.JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form GoogleView
     */
    public GoogleView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        vietnamText = new javax.swing.JTextArea();
        vietnameLabel = new javax.swing.JLabel();
        englishLabel = new javax.swing.JLabel();
        speakBtn = new javax.swing.JButton();
        copyBtn = new javax.swing.JButton();
        header = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        englishText = new javax.swing.JTextArea();
        homeBtn = new javax.swing.JButton();
        translateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 51));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(null);

        vietnamText.setEditable(false);
        vietnamText.setColumns(20);
        vietnamText.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        vietnamText.setForeground(new java.awt.Color(51, 51, 51));
        vietnamText.setRows(5);
        vietnamText.setWrapStyleWord(true);
        vietnamText.setBorder(null);
        jScrollPane2.setViewportView(vietnamText);

        jLayeredPane1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 510, 240));

        vietnameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vietnameLabel.setForeground(new java.awt.Color(0, 204, 204));
        vietnameLabel.setText("Tiếng Việt");
        jLayeredPane1.add(vietnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, -1));

        englishLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        englishLabel.setForeground(new java.awt.Color(0, 204, 204));
        englishLabel.setText("Tiếng Anh");
        jLayeredPane1.add(englishLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        speakBtn.setText("Speak");
        speakBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speakBtnActionPerformed(evt);
            }
        });
        jLayeredPane1.add(speakBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        copyBtn.setText("Copy");
        copyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyBtnActionPerformed(evt);
            }
        });
        jLayeredPane1.add(copyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 320, -1, -1));

        header.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        header.setForeground(new java.awt.Color(51, 204, 255));
        header.setText("Translate English to Vietnamese");
        jLayeredPane1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 330, 40));

        jScrollPane3.setBorder(null);

        englishText.setColumns(20);
        englishText.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        englishText.setForeground(new java.awt.Color(51, 51, 51));
        englishText.setRows(5);
        englishText.setWrapStyleWord(true);
        englishText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(204, 204, 204)));
        //englishText.getDocument().addDocumentListener(new TranslateListener());
        jScrollPane3.setViewportView(englishText);

        jLayeredPane1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 510, 240));

        homeBtn.setText("Home");
        jLayeredPane1.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, -1, -1));

        translateBtn.setText("Dịch");
        translateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                translateBtnActionPerformed(evt);
            }
        });
        jLayeredPane1.add(translateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 100, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void translateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_translateBtnActionPerformed
        // TODO add your handling code here:
        try {
            String result = GoogleTranslate.translate("vi", englishText.getText());
            vietnamText.setText(result);
        } catch (IOException e) {
            // TO DO Auto-generated catch block
            e.printStackTrace();
        }
    }//GEN-LAST:event_translateBtnActionPerformed
    public void addHomeBtnListener(ActionListener listener) {
        homeBtn.addActionListener(listener);
    }
    private void speakBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_speakBtnActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_speakBtnActionPerformed

    private void copyBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_copyBtnActionPerformed
        // TO DO add your handling code here:

    }// GEN-LAST:event_copyBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GoogleView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GoogleView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GoogleView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GoogleView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GoogleView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton copyBtn;
    private javax.swing.JLabel englishLabel;
    private javax.swing.JTextArea englishText;
    private javax.swing.JLabel header;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton speakBtn;
    private javax.swing.JButton translateBtn;
    private javax.swing.JTextArea vietnamText;
    private javax.swing.JLabel vietnameLabel;
    // End of variables declaration//GEN-END:variables
    class TranslateListener implements DocumentListener {
        public void changedUpdate(DocumentEvent e) {
            changed();
        }

        public void removeUpdate(DocumentEvent e) {
            changed();
        }

        public void insertUpdate(DocumentEvent e) {
            changed();
        }

        public void changed() {
            Runnable changed = new Runnable() {
                @Override
                public void run() {
                try {
                    String result = GoogleTranslate.translate("vi", englishText.getText());
                    vietnamText.setText(result);
                } catch (IOException e) {
                    // TO DO Auto-generated catch block
                    e.printStackTrace();
                }
                }
            };       
            SwingUtilities.invokeLater(changed);
        }
    }
}
