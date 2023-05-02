public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;


    Fighter(String name, int damage, int health, int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }
    public int hit(Fighter foe){

        if(foe.isDodge()){
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }

        if(foe.health - this.damage <= 0){
            return 0;
        }
        return foe.health - this.damage;

    }
    boolean isDodge(){
        double probDodge = Math.random()*100;
        return probDodge <= this.dodge;

    }




}
