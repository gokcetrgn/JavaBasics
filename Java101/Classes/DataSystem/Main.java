package Classes.DataSystem;

public class Main {
    public static void main(String[] args) {
        

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        Course mat = new Course("Matematik", "MATH101", "MATH", t1, 70);
        Course fizik = new Course("Fizik", "FZK101", "FZK", t2, 80);
        Course kimya = new Course("Kimya", "KMY101", "KMY", t3, 60);

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "140144015",3, mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);

        Student s2 = new Student("Güdük Necmi","2211133", 3, mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);

        Student s3 = new Student("Hayta İsmail", "221121312", 3,  mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);

    }
}
