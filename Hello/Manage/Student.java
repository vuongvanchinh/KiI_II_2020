public class Student {
   private String name;
   private String id;
   private String group;
   private String email;
//==============setter===================
   public void setEmail(String email) {
      this.email = email;
   }
   public void setGroup(String group) {
      this.group = group;
   }
   public void setId(String id) {
      this.id = id;
   }
   public void setName(String name) {
      this.name = name;
   }
   //=====================getter===============
   public String getEmail() {
      return email;
   }
   public String getGroup() {
      return group;
   }
   public String getId() {
      return id;
   }
   public String getName() {
      return name;
   }
   //contructors 

   public Student(){
      this.name ="Student";
      this.id="000";
      this.group ="K62CB";
      this.email ="uet@vnu.edu.vn";
   }
   public Student(String name, String id, String email){
      this.name = name;
      this.id=id;
      this.group ="K62CB";
      this.email =email;
   }
   public Student(Student s){
      this.name= s.name;
      this.id = s.id;
      this.group = s.group;
      this.email = s.email;
   }
   // ============= method ================
   public String getInfo(){
      StringBuilder sb = new StringBuilder();
      sb.append(this.name).append(" - ").append(this.id)
         .append(" - ").append(this.group).append(" - ")
         .append(this.email);
      return sb.toString();
   }

   
}
