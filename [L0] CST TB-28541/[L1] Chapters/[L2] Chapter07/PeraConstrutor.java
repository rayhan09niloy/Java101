class Student {
    String name;
    int rollNo;
    int gradeStanderd;
    int age;
    String address;
    static String school;

    Student(String name, int rollNo, int gradeStanderd, int age, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.gradeStanderd = gradeStanderd;
        this.age = age;
        this.address = address;
    }

    public void studentInfo(String x) {
        System.out.println("\nThere is the info for " + x);
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Grade Standerd: " + gradeStanderd);
    }
}

public class PeraConstrutor {
    public static void main(String[] args) {
        Student s1 = new Student("Fahim",28, 10, 15, "Dhaka");
        s1.studentInfo("s1");
    }
}