public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    public void run(){
        if(isCheck()){
            if(isStart()){
                while(f1.health>0 && f2.health>0){

                    f2.health = f1.hit(f2);
                    System.out.println(f2.name + " Sağlık: " + f2.health);
                    if(isWin())
                        break;
                    f1.health = f2.hit(f1);
                    System.out.println(f1.name + " Sağlık: " + f1.health);
                    if(isWin())
                        break;
                }
            }else{
                while(f2.health>0 && f1.health>0){
                    f1.health = f2.hit(f1);
                    System.out.println(f1.name + " Sağlık: " + f1.health);
                    if(isWin())
                        break;
                    f2.health = f1.hit(f2);
                    System.out.println(f2.name + " Sağlık: " + f2.health);
                    if(isWin())
                        break;
                    }


            }


        }else{
            System.out.println("Boksörlerin ağırlıkları uymuyor.");
        }



    }
    boolean isCheck(){
        return (this.f1.weight >= this.minWeight && f1.weight <= maxWeight)&&(this.f2.weight >= this.minWeight && f2.weight <= maxWeight);

    }

    boolean isWin(){
        if(f2.health <= 0){
            System.out.println("Maçı kazanan: " + f1.name);
            return true;
        }
        else if(f1.health <= 0){
            System.out.println("Maçı kazanan: " + f2.name);
            return true;
        }
        return false;
    }
    boolean isStart(){
        double randomValue = Math.random()*100;
        return randomValue <= 50;
    }
}
