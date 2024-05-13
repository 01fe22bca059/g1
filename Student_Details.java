package G1;
public class Student_Details {
   public static void main(String[] args) {
     
}

      public String[] courseCodes = { "SOFTWARE TESTING", "C#\t\t", "MACHINE LEARNING ", "DEVOPS\t\t", "MINOR PROJECT\t" };
      public int[] marks = { 80, 85, 90, 95, 87 };
 
     public void displayStudentMarks() {
         System.out.println("Course Codes \t Marks Obtained");
 
         // The code `for (int i = 0; i < courseCodes.length; i++)` is a for loop that iterates over
         // the elements of the `courseCodes` array.
         for (int i = 0; i < courseCodes.length; i++) {
            
                 System.out.println(courseCodes[i] + "\t" + marks[i]);
         }
     }
 
 
}