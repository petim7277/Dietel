package PersonalProgress;

import java.time.LocalDateTime;

public class Methods {
    public void print(int age ,String address){
        System.out.println(age + address);
    }
    public void print(String name,double weight){
        System.out.println(name+weight);
    }
    public int sum(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
    public String  name(String name){
        return "my name is   "+name;
    }
    public boolean ifNameHasZ(String name){

        if (name.contains("Z"))return true;
        return false;
    }
    public String yearOfBirth(int year){
       int age = LocalDateTime.now().getYear() - year;
   return "you are  "+age+" year old";
    }


    public static void main(String[] args) {
      Methods myMethod = new Methods();
//       myMethod.print(45,"18 FFF street Alara");
//        myMethod.print("john",46.5);
//        System.out.println(myMethod.sum(5, 5));
//        System.out.println(myMethod.name("cynthia"));
        System.out.println(myMethod.yearOfBirth(2002));

    }
}
