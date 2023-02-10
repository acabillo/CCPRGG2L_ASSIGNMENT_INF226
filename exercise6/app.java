public class app {
     public static void main(String[] args) {

        //polymorphic variable
        groceryItem item1 = new milk();
        item1.name = "Full Milk";
        item1.price = 150;
        item1.showItemName(); 
    
        groceryItem item2 = new coffee();
        item2.name = "Greatest White";
        item2.price = 99;
        item2.showItemName();

        

        cashier c1 = new cashier();
        //polymorphic parameter
        System.out.println("");
        c1.checkOut(item1);
        c1.showItemPrice(item1);
        System.out.println("");

        c1.checkOut(item2);
        c1.showItemPrice(item2);
        System.out.println("");


        groceryItem[] itemArray = new groceryItem[2];

        itemArray[0] = item1;
        itemArray[1] = item2;
        double totalAmount = 0.00;
    
        for (int i = 0; i < itemArray.length; i++) {
           itemArray[i].showItemName();
           System.out.println(itemArray[i].price);

           //same as totalAmount = totalAmount + itemArray[i].price;
           totalAmount  += itemArray[i].price;
    
        }
        System.out.println();

        System.out.println("Total Amount: " + totalAmount);
        
        bird myBird = new bird();
        myBird.eat();
    }
}
