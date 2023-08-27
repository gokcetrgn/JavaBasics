package Classes.DataSystem;

public class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(){

    }
    public Teacher(String name, String mpno, String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
    public void print(){
        System.out.println("Adi: " + this.name);
        System.out.println("Telefonu: " + this.mpno);
        System.out.println("Bolumu: " + this.branch);
    }
}
