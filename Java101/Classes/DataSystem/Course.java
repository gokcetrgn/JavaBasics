package Classes.DataSystem;

public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;
    
    
    double total = 0;


    public Course(String name, String code, String prefix, Teacher teacher, int verbalNote) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        this.note = 0;
        this.verbalNote = verbalNote;


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

    double average(){
         total = (note * 0.8 + verbalNote * 0.2);
         return total;
    }

}
