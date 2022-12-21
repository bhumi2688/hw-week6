
//15. Write a Java program to swap two variables.

public class SwaptwoNumbers {     //Declare Class


    public static void main(String[] args) {    //Main method

        //Local Variable
        int a=7;
        int b =4;
        int temp = a;        //Declare temp variable to store value of a
        a=b;
        b=temp;     //Here value of b will be swop to a as its declared as temp

        System.out.println("a : " +a);      //will print the swop number
        System.out.println("b : " +b);    // will print swop numbers



    }



}
