package Classes.DataSystem;

public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        this.note = 0;
    }
    void addTeacher(Teacher teacher){

        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else{
            System.out.println("Atama yapilamaz.");
        }
    }

    void printTeachInfo(){
        this.teacher.print();
    }

}