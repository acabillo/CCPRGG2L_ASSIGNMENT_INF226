public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMyStrength();
        knight.sayMyAgility();
        knight.sayMyIntelligence();
        knight.attack();

        

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMyStrength();
        mage.sayMyAgility();
        mage.sayMyIntelligence();
        mage.attack();


        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.sayMyStrength();
        thief.sayMyAgility();
        thief.sayMyIntelligence();
        thief.attack();


        Weapon sword = new Weapon();

        sword.name = "Katana";
        sword.damage = 3000;
        sword.rarity = "Common";
        System.out.println(sword.info());
        sword.sayMyDamage();

        sword.addDamage(20); 
        sword.addDamage(5000);

        Weapon gun = new Weapon();
        gun.name = "M24 SWS";
        gun.damage = 5000;
        gun.rarity = "Rare";
        System.out.println(gun.info());
        gun.sayMyDamage();
    
        gun.addDamage(5000);
       
    }

}
