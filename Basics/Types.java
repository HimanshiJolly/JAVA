public class Types {
    public static void main(String[] args) {
        //there are 2 types of variables in java:primitive and non primitive.
        /*primitive:used to store simple values
         primitive data types are:
         byte:1 byte(-128-127)
         short:2 bytes
         int:4 bytes(1,2,3,4 etc)
         long: 8 bytes
         float: 4 bytes(2.3 etc)
         double: 8 bytes
         char:2 bytes (a,b,c etc)
         boolean:1 byte(t/f)
        */
        System.out.println("Primitive types:");
        byte age=30;
        int phone=1234567890;
        long phone2=12345678900L;
        float pi=3.14F;
        char letter='a';
        boolean isAdult=true;
        System.out.println("age:"+age);
        System.out.println("phone:"+phone);
        System.out.println("phone2:"+phone2);
        System.out.println("pi:"+pi);
        System.out.println("letter:"+letter);
        System.out.println("isAdult:"+isAdult);
        //non primitive:used to store complex values
        System.out.println("Non primitive:");
        String name="Govind";
        System.out.println("Number of characters in name:"+name.length());
        //primitive types have a fixed limit but non primitive types have variabel length.
        //new
    }
    
}
