package ChapterThreeExercises;

public class PetrolPurchaseTest {
    public static void main(String[] args) {
        PetrolPurchase myPetrol = new PetrolPurchase("Lagos","Oando Oil",50,55.6,0.5);
myPetrol.setLocation(" London");
myPetrol.setTypeOfPetrol(" Mobil Oil");
myPetrol.setQuantity(70);
myPetrol.setPrice(79.5);
myPetrol.setDiscount(0.5);
//        myPetrol.print("Discount:%f\n",myPetrol.getDiscount());
//        myPetrol.prints("Location:%s\n",myPetrol.getLocation());
//        myPetrol.print("Price:%f\n",myPetrol.getPrice());
//        myPetrol.print("Quantity:%d\n",myPetrol.getQuantity());
//        myPetrol.prints("Type of petrol:\n",myPetrol.getTypeOfPetrol());
//        myPetrol.print("gd", myPetrol.getPurchaseAmount());

        System.out.printf("enter number: ");
        int number = myPetrol.intInput();


        System.out.println("enter number: ");
        int num = myPetrol.intInput();
    }
}