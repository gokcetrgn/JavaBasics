package Classes.DataSystem;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ahmet", "111111111", "ELT");

        Course course = new Course("Edebiyat", "101", "ELT", teacher);

        course.addTeacher(teacher);

        teacher.print();
    }
}
