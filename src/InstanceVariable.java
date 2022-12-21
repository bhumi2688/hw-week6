//1.Write a Java programme using the following steps.

public class InstanceVariable {   //Declare Class

    int a = 10;   //Instance Variable
    int b =20;   //Instance Variable

    void m1(){   //Instance Method
        System.out.println(a);  //Called Instance Variable Directly
        System.out.println(b);  //Called Instance Variable Directly

    }



    public static void main(String[] args)    //Main Method or Pre defined method
    {
        InstanceVariable a = new InstanceVariable();  //Created Object
        //InstanceVariable b = new InstanceVariable();  //Created object
        a.m1(); //Called Instance Variable to Static method using object name


    }


}
