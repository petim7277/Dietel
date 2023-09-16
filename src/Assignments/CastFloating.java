package Assignments;

public class CastFloating {
    public void print (String topic){
        System.out.println(topic);
    }

    public void loopMethod(){
        for (int i = 1; i < 6; i++) {
            int counter= i+1 ;
            System.out.println(i +"        "+counter+ "        "+Math.pow(i,counter));

        }


    }
    public void prints (int number){
        System.out.println(number);
    }
    public static void main(String[] args) {
        CastFloating floating = new CastFloating();
        floating.print("a        b        pow(a, b)");
        floating.loopMethod();


    }
}
