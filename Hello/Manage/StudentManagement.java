
public class StudentManagement {
   Student[] students= new Student[100];
   int index=0;
   public static boolean sameGroup(Student s1, Student s2){
      return s1.getGroup().equals(s2.getGroup());
   }
   public void addStudent(Student newStudent){
      students[index]= newStudent;
      index++;
   }
   public static int yet(boolean[] visited){
      for(int i=0; i<visited.length; i++){
         if(!visited[i]) return i;
      }
      return -1;
   }
   public String studentsByGroup(){
      StringBuilder sb = new StringBuilder();
      boolean[] visited = new boolean[index];
      
      while(yet(visited) != -1){
         int start = yet(visited);
         //System.out.println(start);
         visited[start]= true;
         sb.append(students[start].getGroup()).append("\n");
        
         for(int i=start; i<index; i++){
            if(sameGroup(students[start], students[i])){
               sb.append(students[i].getInfo()).append("\n");
               visited[i]=true;
            }
         }

      }
      
      return sb.toString();
   }
   public void removeStudent(String id){
      for(int i=0; i<index; i++){
         if(students[i].getId().equals(id)){
             
            for(int j= i; j<index; j++){
               students[j]= students[j+1];
            }
            students[--index] = null;
            break;
            
         }
      }
   }
   public static void main(String[] args) {

      Student testStudent = new Student("Nguyen Van An", "17020001", " 17020001@vnu.edu.vn");
      Student testStudent0 = new Student("EmVanChinh", "005", "vuongvanchinh20011@gmail.com");
      Student testStudent1 = new Student("AnhVanChinh1", "002", "vuongvanchinh20012@gmail.com");
      Student testStudent2 = new Student("AnhVanChinh2", "003", "vuongvanchinh20013@gmail.com");
      Student testStudent3 = new Student("AnhVanChinh3", "004", "vuongvanchinh20014@gmail.com");
      testStudent1.setGroup("K64CB");
      StudentManagement  manage = new StudentManagement();
      manage.addStudent(testStudent);
      manage.addStudent(testStudent0);
      manage.addStudent(testStudent1);
      manage.addStudent(testStudent2);
      manage.addStudent(testStudent3);
      manage.removeStudent("004");
      System.out.println(manage.studentsByGroup());
   }
}
