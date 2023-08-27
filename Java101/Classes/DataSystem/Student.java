package Classes.DataSystem;

public class Student {
    String name,stuNo;
    int classes;
    Course math;
    Course physics;
    Course chemistry;
    double avarage;
    boolean isPass;

    public Student(){

    }

    public Student(String name, String stuNo, int classes, Course math, Course physics, Course chemistry){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    void addBulkExamNote(){

    }
    void isPass(){

    }
    void calcAvarage(){

    }
    void printNote(){
        
    }
}
