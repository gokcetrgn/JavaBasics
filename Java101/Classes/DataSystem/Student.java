package Classes.DataSystem;

public class Student {
    String name;
    String stuNo;
    int classes;
    Course courseOne;
    Course courseTwo;
    Course courseThree;
    double avarage;
    boolean isPass;

    public Student(){

    }

    public Student(String name, String stuNo, int classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.courseOne = c1;
        this.courseTwo = c2;
        this.courseThree = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int courseOne, int courseTwo, int courseThree){
        if (courseOne >= 0 && courseOne <= 100) {
            this.courseOne.note = courseOne;
        }

        if (courseTwo >= 0 && courseTwo <= 100) {
            this.courseTwo.note = courseTwo;
        }

        if (courseThree >= 0 && courseThree <= 100) {
            this.courseThree.note = courseThree;
        }
        
    }
    public void calcAvarage() {
        this.avarage = (this.courseOne.average() + this.courseTwo.average() + this.courseThree.average()) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void isPass() {
        if (this.courseOne.note == 0 || this.courseTwo.note == 0 || this.courseThree.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sinifi Geçti. ");
            } else {
                System.out.println("Sinifta Kaldi.");
            }
        }
    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.courseOne.note);
        System.out.println("Fizik Notu : " + this.courseTwo.note);
        System.out.println("Kimya Notu : " + this.courseThree.note);
    }
}
