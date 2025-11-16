public class StudentData {
    private int studentId;
    private String name;
    private int age;


    public StudentData() {
        this.studentId = 0;
        this.name = "Not known";
        this.age = 0;
    }


    public StudentData(int studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    //getter

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //setter

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //print data
    public void printStudentInfo() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);

    }
}
