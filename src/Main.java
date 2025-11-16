//Duy Nguyen n186@umbc.edu


public class Main {
    public static void main(String[] args) {
        System.out.println("---Student 1---");

        StudentData student1 = new StudentData();


        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());

        System.out.println("\n---Student 2---");
        StudentData student2 = new StudentData(101, "Bob Burgers", 21);
        student2.printStudentInfo();

        System.out.println("\n---Updating Student 1's data---");
        student1.setStudentId(102);
        student1.setName("Bob Burgers");
        student1.setAge(20);


        System.out.println("Student 1's new date:");
        student1.printStudentInfo();
    }

}