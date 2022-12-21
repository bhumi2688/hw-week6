
   //Different String methods
public class String_Method {     //Declare class

       public static void main(String[] args) {

           String name = "Priarl";//String Declaration
           String name1 = "Patel";

           //Print  length of String
           System.out.println("The length of String is :" + name.length());

           // returns a char value at given index number
           System.out.println("The char value of index 3 is :" + name.charAt(3));

           // combines specified string at the end of this string
           System.out.println("The name is : " + name.concat(name));

           //returns true if characters are found in the string
           System.out.println("The Contain is : " + name.contains(name));

           //Check if this string start with given prefix
           System.out.println("The String start with : " + name.startsWith("P"));

           //Check if this string ends with given suffix
           System.out.println("The String ends with : " + name.endsWith("l"));

           // Compares the content of two given strings
           System.out.println("Equal is :" +name.equals(name1));

           //Returns index of given character value or string
           System.out.println("Index of value :" + name.indexOf('a'));

           //checks if the string is empty
           System.out.println("String is empty : " + name.isEmpty());

           //returns a string replacing all gthe old char to new char
           System.out.println("Replace String is : " + name.replace('i','e'));

           //returns a part of string
          System.out.println("The substring is :" + name.substring(3));

           //convert this string into character array
           System.out.println("String to Array : " + name.toCharArray());

           //Returns the string to lowercase
           System.out.println("Lowercase is :" + name.toLowerCase());

           //Returns the string in uppercase letter
           System.out.println("Uppercase letter is :" + name.toUpperCase());

           //eliminates leading and trialing spaces
           System.out.println("Trim is : " + name.trim());

           //reverse string
           System.out.println("Reverse string is :" +name1.replace("Patel","letaP"));


       }
   }