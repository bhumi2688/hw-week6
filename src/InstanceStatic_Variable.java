
// 4. Write a Java programme using the following steps.
public class InstanceStatic_Variable {   // Declare Class name

      int a =20;      //Instance Variable
      int b = 40;     //Instance Variable

    static String  name = "Pearl";          //Static Variable
    static String name1 = "Prisha";        //Static variable



    void m1()    // Declare Instance method
    {
        System.out.println(a);          //Print Statement
        System.out.println(b);         //Print Statement
    }

    static void m2()     //Declare Static Metho
    {
        System.out.println(name);       //Print Statement
        System.out.println(name1);     //Print Statement
    }


    public static void main(String[] args) {      //Main method or pre defined method
        InstanceStatic_Variable a = new InstanceStatic_Variable();  //Created Object
        a.m1();    //Called Instance method to main method by object
        InstanceStatic_Variable.m2();  //Called static method to static method by class name



    }



}
