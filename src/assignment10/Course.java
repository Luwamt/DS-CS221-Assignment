package assignment10;

public class Course {
   private String cID;
   private String cNam;
   private int creditHours;


   public Course(String cID, String cNam, int creditHours) {
      this.cID = cID;
      this.cNam = cNam;
      this.creditHours = creditHours;
   }

   public String getcID() {
      return cID;
   }

   public void setcID(String cID) {
      this.cID = cID;
   }

   public String getcNam() {
      return cNam;
   }

   public void setcNam(String cNam) {
      this.cNam = cNam;
   }

   public int getCreditHours() {
      return creditHours;
   }

   public void setCreditHours(int creditHours) {
      this.creditHours = creditHours;
   }

   @Override
   public String toString() {
      return "=> " + cNam  ;
             // ", creditHours=" + creditHours ;
   }
}
