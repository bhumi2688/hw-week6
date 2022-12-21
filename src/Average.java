
 /*13. Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.*/
public class Average {  //Declare Class

     public static void main(String[] args) {      //Main method
         int a= 10;    //Local variable
         int b = 20;   //Local variable
         int c= 30;   //Local variable

         //Declare as float as it will be in decimal
         float total,average;
          total = a + b + c;
         System.out.println("Total : " + total);    //Will print total

         //Declare average
         average =(total/3);
         System.out.println("Average : " + average);  //Will print average

     }


}
