
/* 5. Write a program for a calculator with addition, subtraction, multiplication
*and division methods all with parameters and use string concatenation
 methods.(Note: Two static and Two instance methods.)*/

public class Calculator {       //Declare Class name

      int a = 30;   //Instance Variable
      int b = 20;   //Instance variable


     void addition (int a, int b)             //Instance Method
    {
        System.out.println("Addition is : " +(a+b));

    }
    void multiplication(int a,int b)        //Instance Method
    {
        System.out.println("multiplication is " + (a*b));
    }

    static void subtraction(int a,int b)       //Static Method
    {
        System.out.println("subtraction is : " +(a-b));
    }

    static void division (int a,int b)      //Static Method
    {
        System.out.println("division is : " +(a/b));
    }

    public static void main(String[] args) {    //Main method or pre defined method
         Calculator t = new Calculator();    //Created object
        t.addition(30,20);   //Called instance method using object
        t.multiplication(30,20); //called instance method using object
        Calculator.subtraction(30,20);  //called static method via class name
        division(30,20); //called static method directly




    }


}
