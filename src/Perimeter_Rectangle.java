
// 14. Write a Java program to print the area and perimeter of a rectangle.
public class Perimeter_Rectangle {    //Declare class name

    public static void main(String[] args) {    //Main method

        // declare variable as float as in decimal
        float width = 5.6f;
        float height = 8.5f;
        float area = width * height;
        float perimeter = 2 * (width + height); //formula for perimeter

        //Will print statement
        System.out.println("Area is : " +width+ "*" +height+ "=" +area); //used concantination
        System.out.println("perimeter is " +2+ "*" +(width+ "+" +height)+ "=" +perimeter);   //used concantination

    }
}
