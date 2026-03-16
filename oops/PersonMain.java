class Person {

    String name;
    int age;

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {

    int rollNo;

    void showStudentDetails() {
        showDetails();
        System.out.println("Roll No: " + rollNo);
    }
}

class Teacher extends Person {

    String subject;

    void showTeacherDetails() {
        showDetails();
        System.out.println("Subject: " + subject);
    }
}

public class PersonMain {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 21;
        s1.rollNo = 101;

        s1.showStudentDetails();

        System.out.println();

        Teacher t1 = new Teacher();
        t1.name = "Sharma Sir";
        t1.age = 40;
        t1.subject = "Java";

        t1.showTeacherDetails();

    }
}