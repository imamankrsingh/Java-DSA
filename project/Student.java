class Student {
    int id ;
    String name ;
    Double marks ;

    Student(int id , String name , Double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display(){
        System.out.println("ID: " + id + " Name: " + name + ", Marks: "+ marks);
        
    }
}