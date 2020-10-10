public class StandardString {
   public static String standard(String s) {
      return s.trim().replaceAll("\\s+", " ");
   }

   public static void main(String[] args) {
      String s = "   vuong   van     chinh";
      System.out.println(standard(s));
   }
}
