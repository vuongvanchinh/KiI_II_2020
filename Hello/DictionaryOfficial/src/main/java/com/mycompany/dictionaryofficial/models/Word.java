package com.mycompany.dictionaryofficial.models;

public class Word {
   private String wordTarget;
   private String wordExplain;
   private String pronunciation;
   private String partOfSpeech;
   private String description;
   private String synonym;

   private static final String WORD_FORMAT = "<div style = 'padding-left:10px;'> " +
                                                "<h2 style = 'font-size:28px; color:#1d2a57;'>%s</h2>" + // word 
                                                "<span style = 'font-size:18px; font-weight:200;'>%s</span>" + // pronunciation 
                                                "<span style = 'font-size:18px; font-weight:500;'><b> :))) </b>%s</span> <br/>" + // part of speech
                                                "<p style = 'font-size:24px;'>%s</p>" + // mean
                                                "<p style = 'font-size:16px;  color:#1d2a57;'><b>%s</b></p>" +
                                                "<ul>" +
                                                   "<li style ='font-size:14px; '>%s</li>" +
                                                   "<li style ='font-size:14px;'>%s</li>" +
                                                   "<li style ='font-size:14px;'>%s</li>" +
                                                "</ul>" +
                                             "</div>";


   public Word() {
      this.setWordTarget("undefined");
      this.setWordExplain("undefined");
      this.setPronunciation("undefined");
      this.setPartOfSpeech("undefined");
      this.setDescription("undefined");
      this.setSynonym("");
   }

   public Word(String wTg, String wEx) {
      this.setWordTarget(wTg);
      this.setWordExplain(wEx);
      this.setPronunciation("undefined");
      this.setDescription("undefined");
      this.setPartOfSpeech("undefined");
   }

   public Word(String wTg, String wEx, String pro, String partOfSpeech, String description) {
      this.setWordTarget(wTg);
      this.setWordExplain(wEx);
      this.setPronunciation(pro);
      this.setPartOfSpeech(partOfSpeech);
      this.setDescription(description);
   }

   public Word(String wTg, String wEx, String pro,String partOfSpeech, String description, String synonym) {
      this.setWordTarget(wTg);
      this.setWordExplain(wEx);
      this.setPronunciation(pro);
      this.setPartOfSpeech(partOfSpeech);
      this.setDescription(description);
      this.setSynonym(synonym);
   }

   public void update(String[] data) {
      this.setWordTarget(data[0]);
      this.setWordExplain(data[1]);
      this.setPronunciation(data[2]);
      this.setPartOfSpeech(data[3]);
      this.setDescription(data[4]);
      this.setSynonym(data[5]);
   }

   public String getPartOfSpeech() {
      return partOfSpeech;
   }

   public void setPartOfSpeech(String partOfSpeech) {
      this.partOfSpeech = partOfSpeech;
   }

   public String getSynonym() {
      return synonym;
   }

   public void setSynonym(String synonym) {
      this.synonym = synonym;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getPronunciation() {
      return pronunciation;
   }

   public void setPronunciation(String pronunciation) {
      this.pronunciation = pronunciation;
   }

   public String getWordExplain() {
      return wordExplain;
   }

   public void setWordExplain(String wordExplain) {
      this.wordExplain = wordExplain;
   }

   public String getWordTarget() {
      return wordTarget;
   }

   public void setWordTarget(String wordTarget) {
      this.wordTarget = wordTarget.toLowerCase().trim();
   }

   public String getHTMLFormat() {
      String output;
      String[] des;
      des = this.description.split("\t", 4);
      output = String.format(WORD_FORMAT, this.wordTarget, this.pronunciation,
      this.partOfSpeech, this.wordExplain, des[0], des[1],des[2], des[3]);
      return output;
   }
}