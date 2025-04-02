import java.util.HashMap;
import java.util.Map;

public class Character {
    private int intelligence;
    private int strength;
    private int sense;
    private int ability;
    private int durability;

   public Character(int intelligence,int strength,int sense,
   int ability,int durability){
       this.intelligence = intelligence;
       this.strength = strength;
       this.sense = sense;
       this.ability = ability;
       this.durability = durability;
   }
    public int getIntelligence(){
       return intelligence;
    }
    public void setIntelligence(int intelligence){
       this.intelligence = intelligence;
    }
    public int getStrength(){
        return strength;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }
    public int getSense(){
        return sense;
    }
    public void setSense(int sense){
        this.sense = sense;
    }
    public int getAbility(){
        return ability;
    }
    public void setAbility(int ability){
        this.ability = ability;
    }
    public int getDurability(){
        return durability;
    }
    public void setDurability(int durability){
        this.durability = durability;
    }
}
