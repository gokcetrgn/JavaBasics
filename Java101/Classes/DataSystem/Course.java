package Classes.DataSystem;

public class Course {
        
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.courseTeacher = teacher;
        this.
        note = 0;
    }
    void addTeacher(Teacher teacher){

        this.courseTeacher = teacher;
    }

    void printTeachInfo(){
        this.courseTeacher.print();
    }

}
