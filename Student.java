public class Student {
        String name;
        int srn;
        double marks;

        public Student(String name, int srn, double marks){
         this.name = name;
         this.srn = srn;
         this.marks= marks;

        }
        public void displayInfo(){
         System.out.println("Student srn :"+srn);
         System.out.println("Employee Name: "+name);
         System.out.println("Marks $"+marks);
        
        }
        public static void main(String[] args) {
         Student stud1 = new Student("XYZ", 101, 89.00);
        stud1.displayInfo();
        }
 }
 

