public class Main {
    public static void main (String[] args) throws Exception{
        System.out.println("Hello");
        Person Me = new Person("Maycee", 18);
        Person Friend = new Person("Kazumi", 18);
        Me.addFriend(Friend);

        //PET OBJECT
        Pet Cat = new Pet("Chopper", 3, Friend);
        Cat.showOwner();

        System.out.println(" ");
        
        //PERSON OBJECT
        Person Cm1 = new Person("Jewel", 18);
        Person Cm2 = new Person("Dhan ", 25);
        Person Cm3 = new Person("Kiko", 20);
        Me.addClassmate(Cm1);
        Me.addClassmate(Cm2);
        Me.addClassmate(Cm3);

        //COMPOSITION
        System.out.println(" ");
        Car SportsCar = new Car("Mercedes Benz","Black", Me);
        SportsCar.showOwner();

    }
}
