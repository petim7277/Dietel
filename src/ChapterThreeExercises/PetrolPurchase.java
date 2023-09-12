package ChapterThreeExercises;

import java.util.Scanner;

public class PetrolPurchase {
    private Scanner scanner = new Scanner(System.in);
    public String location;
    public String typeOfPetrol;
    public  int quantity;
    public  double price;
    public double discount;
    public double purchaseAmount;

    public PetrolPurchase(String location,String typeOfPetrol, int quantity,double price,double discount) {
        this.location=location;
        this.typeOfPetrol=typeOfPetrol;
        this.quantity=quantity;
        this.price=price;
        this.discount=discount;
    }

    public void setLocation(String location){
       this.location=location;
}
    public void setTypeOfPetrol(String typeOfPetrol){
        this.typeOfPetrol=typeOfPetrol;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setDiscount(double discount){
        this.discount=discount;
    }
    public void newPurchaseAmount(double purchaseAmount){
        this.purchaseAmount= quantity * price - discount;
    }
    public String getLocation(){
       return location;
    }
    public String getTypeOfPetrol(){
        return typeOfPetrol;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }
    public double getDiscount(){
        return discount;
    }
    public void print(String word, int number){
        System.out.printf(" %d",number);
    }
    public int intInput(){
        return scanner.nextInt();
    }
    public void prints(String location){
        System.out.printf("%s",location);
    }
public double getPurchaseAmount(){
        return purchaseAmount;
}









}
