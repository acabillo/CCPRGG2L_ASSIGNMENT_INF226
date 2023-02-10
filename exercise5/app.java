public class app {
    public static void main(String[] args) throws Exception {

        person Me = new person();

        // The name property cannot be accessed outside of the Person class.
        // Me.name;

        Me.setName("Maycee");

        String myName = Me.getName();

        System.out.println("My name is " + myName);

        daughter me = new daughter();
        System.out.println(me.surname);
        me.showSurname();
    }
}
