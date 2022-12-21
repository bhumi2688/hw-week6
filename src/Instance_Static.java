
//3. Write a Java programme using the following steps.

public class Instance_Static {     //Declare class

    int a= 10;            //Instance Variable
    static int b = 30;    //Static Variable


    void m1()               //Instance Method
    {
        System.out.println(a);     //Will print statement
    }

    static void m2()       //Static Method
    {
        System.out.println(b);   //Print Statement
    }

    public static void main(String[] args) {     //Main Method or pre-defined Method
        Instance_Static a = new Instance_Static();   //Created object
        a.m1();  //Called Instance method to main method using object
        Instance_Static.m2();   //Called Static method to Static method via class name


    }


}
