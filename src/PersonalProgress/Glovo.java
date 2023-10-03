package PersonalProgress;

public class Glovo {

    private String name;
    private String foodOrder;
    private int numberofwater;
    private int numberOfFoodOrdered;
    private String address;

    public String customerOrderInfo(String name, String foodOrder,String location) {
        System.out.println("""
                           Dear customer please note that beef can be in the range of (Goat,Cow and Ram meat)
                           1. Jollof rice with(Beef,Chicken,Turkey)
                           2. Fried rice with (Beef, Chicken, Turkey)
                           3. 'Ofensala' (White soup) with [Beef,Chicken,Turkey]
                           4. 'Ofeakwu' (Banga soup) with [Beef,Chicken,Turkey]
                           5. Yamarita with (Beef,Chicken,Turkey)
                           6. Spaghetti Bolongonees with (Beef,Chicken,Turkey)
                           """);
        this.name = name;
        this.address = location;
            this.foodOrder = foodOrder;

        return "";
    }
    public int customerBill(int numberofwater,int numberOfFoodOrdered){

     this.numberOfFoodOrdered = numberOfFoodOrdered;
    return numberofwater;
    }
}
