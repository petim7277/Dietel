package ChapterThreeExercises;

public class CarApplication {
 private String model ;
 private  double price;
 private  String year;

 public CarApplication(String model,String year,double price){
     this.model= model;
     this.year = year;
     if (price > 0){
     this.price=price;
     }else
         System.out.println("Negative value cannot be considered as an amount or price");
 }



    public void setModel(String model){
     this.model= model;
 }
 public void setPrice(double price){
     if (price >0) {
         this.price = price;
     }
     System.out.println("Negative value cannot be considered as an amount or price");
 }

 public void fivePercentDiscount(){
    double result =  5 * 100 / 100 - price;
    this.price = price;
 }
 public void setYear(String year){
     this.year=year;
 }
 public String getModel(){
     return model;
 }
 public  String getYear(){
     return year;
 }
 public double getPrice(){
     return price;
 }
}
