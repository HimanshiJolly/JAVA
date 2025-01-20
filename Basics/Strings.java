public class Strings {
    public static void main(String[] args) {
        System.out.println("CONCATENATION:");
        //concatenation:joining of 2 strings
        String name1="Himanshi";
        String name2="Jolly";
        String name3=name1+" "+name2;
        System.out.println(name3);
        System.out.println("\nCHAR AT:");
        //charAt
        String name="Himanshi";
        System.out.println("Character at position 0:"+name.charAt(0));
        System.out.println("Character at position 3:"+name.charAt(3));
        System.out.println("Character at position 7:"+name.charAt(7));
        System.out.println("Character at position 1:"+name.charAt(1));
        System.out.println("\nLENGTH:");
        //length
        String department="mechanical";
        System.out.println("Department name:"+department);
        System.out.println("Department length:"+department.length());
        //replace
        System.out.println(  "\nREPLACE:");
        String girlname="Amisha";
        String replaced=girlname.replace('a','e');
        System.out.println("Before replace:"+girlname);
        System.out.println("After replace:"+replaced);
    
    //strings are immutable in java.if we want to make some changes in string then we have to create new string.
    //SUBSTRING
    System.out.println("\nSUBSTRING:");
    String boy="Aman and Akku";
    System.out.println("Before substring:"+boy);
    System.out.println("After substring:"+boy.substring(9,13));
    }
}
