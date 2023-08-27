package Classes.Boxing;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        if (firstToAttack()) {
            this.f1 = f1;
            this.f2 = f2;
        } else {
            this.f1 = f2;
            this.f2 = f1;
        }
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if(isCheck()){
            while(this.f1.health>0 && this.f2.health >0){
                System.out.println("- Yeni Raund - ");
                this.f2.health = this.f1.hit(this.f2);

                if(isWin()){
                    break;
                }

                this.f1.health = this.f2.hit(this.f1);

                if(isWin()){
                    break;
                }
            }
        }else{
            System.out.println("Musabakaya giremezler.");
        }
    }
    public boolean isCheck(){

        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
    public boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println("Maçi Kazanan : " + this.f2.name);
            return true;
        } else if (this.f2.health == 0){
            System.out.println("Maçi Kazanan : " + this.f2.name);
            return true;
        }

        return false;
    }

    public boolean firstToAttack(){
        double randomValue = Math.random() * 1;
        if(randomValue < 0.5){
            return true;
        }else{
            return false;
        }
    }
}
