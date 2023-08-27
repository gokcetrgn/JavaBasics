package Classes.EmployeeInfoSystem;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.hireYear = hireYear;
        this.salary = salary;
        this.workHours = workHours;
    }

    public double tax() {
        if (this.salary <= 1000) {
            return 0;
        } else {
            return this.salary * 0.03;

        }
    }
    public double bonus(){
        // çalışma saatine göre bonus
        if((this.workHours) > 40){
            int extraHours = this.workHours - 40;
            return extraHours * 30;
        }else{
            return 0;
        }
    }
    public double raiseSalary(){
        // 2021'e göre
        int work = 2021 - hireYear;
        if(work < 10){
            return this.salary * 0.05;
        }else if(9 <= work && work < 20){
            return this.salary *0.10;
        }else if(work >19){
            return this.salary * 0.15;
        }else{
            return 0;
        }
    }
    public String print(){
        double totalSalary = this.salary + bonus() - tax() + raiseSalary();
        return "Adi: " + name +
                "\nMaaşi: " + salary +
                "\nÇalişma Saati: " + workHours +
                "\nBaşlangic yili: " + hireYear +
                "\nVergi: " + tax() +
                "\nBonus: " + bonus() +
                "\nMaaş Artisi: " + raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş: " + totalSalary +
                "\nToplam Maaş: " + (totalSalary + salary - raiseSalary());

    }
} 
