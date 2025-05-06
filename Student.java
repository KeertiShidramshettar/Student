public class Student {
        String name;
        int srn;
        double marks;
        int age;

        public Student(String name, int srn, double marks, int age){
         this.name = name;
         this.srn = srn;
         this.marks= marks;
         this.age = age;

        }
        public void displayInfo(){
         System.out.println("Student srn :"+srn);
         System.out.println("Employee Name: "+name);
         System.out.println("Marks $"+marks);
        System.out.println("Age ;"+age);
        
        }
        public static void main(String[] args) {
         Student stud1 = new Student("XYZ", 101, 89.00,25);
        stud1.displayInfo();
        }
 }
 

