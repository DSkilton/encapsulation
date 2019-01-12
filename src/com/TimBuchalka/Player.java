package com.TimBuchalka;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");

        }
    } //end of loseHealth

    public int healthRemaining(){
        return this.health;
    } //end of healthRemaining


}//end of class

