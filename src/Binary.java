
// 16. Write a Java program to add two binary numbers.

public class Binary {     //Declare class


    void m1()           //Instance Variable
    {
        byte a = 0b10;   // declare as byte
        byte b = 0b11;   // declare as byte
        int result ;
        result = a+b;

        // print statement
        System.out.println("Binary number is : " +(Integer.toBinaryString(result))+"."); //method for binary
    }



    public static void main(String[] args) {
        Binary t = new Binary();
        t.m1();


    }

}
