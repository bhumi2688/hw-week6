
/*7. Write a program to insert any temperature value in degree Fahrenheit and
      *  convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/

public class Fahrenheit_Celsius {     // main method

    public static void main(String[] args) {  //Main method or pre defined method


        float Fahrenhite, Celsius;

        Fahrenhite = 49;   // given value

        Celsius = ((Fahrenhite - 32) * 5 / 9);  //Formula for Celsius

        System.out.println("Fahrenhite is : " + Celsius);


    }
}
