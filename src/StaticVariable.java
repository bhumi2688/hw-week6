
//2. Write a Java programme using the following steps.


public class StaticVariable {   //Declare  Class

    static int a=10;     //Static Variable
    static String name = "Prisha";   //Static variable

     static void m1(){       // Declared Static method
        System.out.println(a);      // Called Static variable to static Method directly
      // System.out.println(name);   //Called Static variable to statiic method directly
    }

    public static void main(String[] args) {    //Main method or predefined method
        StaticVariable a = new StaticVariable();  //Called static variable to main method by class name
        a.m1();
        System.out.println(name); // called static variable to main  method directly




    }





}
