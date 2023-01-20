

public class Weapon {
    String name;
    int damage;
    String rarity;

    String info() {
        return name + " " + rarity;
    }
    public void sayMyDamage() {
        System.out.println("Damage: " + damage);
    }
    void addDamage(int addDamage){
        addDamage = (damage + addDamage);
        System.out.println("New damage: from " + damage + " to " + addDamage);
        
        this.damage = addDamage;
       
    } 

}
