
/*10. Write a Java program that takes a number as input and prints its
*multiplication table up to 10.*/
public class Timestable {      //Declare class

    public static void main(String[] args) {      //Main method or pre defined method


        int a = 8;      // Local variable number
        for (int i = 1; i <= 10; i++)//declared i as 1 than condition i less than equal 10 and increment by 1 each time

            /*value of a will remain same than it will fulfill the condition and it is true than it will go to increment
            * and each time it will increase by 1 number each, than again it will go to increment and thn fulfill
            * condition */

            System.out.println(a + "*" + i + "=" + a * i);  //print statement


    }
}
