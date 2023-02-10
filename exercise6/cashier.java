public class cashier {
    void checkOut(groceryItem item){
        System.out.println("You have purchased " + item.name);
    }
    void showItemPrice(groceryItem item){
        System.out.println(item.name + " P"+ item.price);
    }
    
}
