class Student {

    private String name;
    private int rollNo;
    private int marks;

    // Constructor
    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public void calculateGrade() {

        if (marks >= 90)
            System.out.println("Grade: A");

        else if (marks >= 75)
            System.out.println("Grade: B");

        else if (marks >= 50)
            System.out.println("Grade: C");

        else
            System.out.println("Grade: Fail");
    }
}

public class StudentMain {

    public static void main(String[] args) {

        Student s1 = new Student("Aman", 21, 82);

        s1.showDetails();
        s1.calculateGrade();

    }
}