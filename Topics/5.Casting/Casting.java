public class Casting{
    public static void main(String[] args){
        /*Casting:type conversion:
        There are 2 types of casting in java:implicit casting and explicit casting.*/
        double price=100.00;//capacity-8 bytes
        double finalprice=price+18;
        System.out.println("Final price: "+finalprice);
        int p=100;
        //int fp=p+18.0;error came,capacity-4 bytes
        //small container to big container casting is known as implicit casting.
        //Explicit casting:
        int ep=p+(int)18.999999;
        System.out.println("Final price:"+ep);
    }
}