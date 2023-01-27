public class Car {
    String name;
    String color;
    Person owner;
    Car(String myCar, String carColor, Person myOwner){
        this.name = myCar;
        this.color = carColor;
        this.owner = myOwner;

    }

     void showOwner(){
        System.out.println(this.color + " " + this.name + " is owned by " + owner.name);
    }
}
