/*
 * variables are like containers used for storing data values 
 * int age = 20; 
 * datatype var_name = value; 
 * RAM has reserved memory for variable
 * DATA TYPES: 
            size        default value         type of val stored
    byte    1 byte      0                     Integral
    short   2 byte      0                     Integral
    int     4 byte      0                     Integral
    long    8 byte      0L                    Integral
    char    2 byte      '\u0000'              Character
    float   4 byte      0.0f                  Decimal
    double  8 byte      0.0d                  Decimal
    boolean 1 bit       false                 True or False 
  
  * all the above data types are primitive data types 
  * Non primitive data types are: strings, arrays, objects, etc. 
  * Escape sequences: 
    \t : Insert a tab in text at this point
    \b : Insert a backspace in text at this point
    \n : Insert a newline in text at this point
    \' : Insert a single quote in text at this point
    \" : Insert a double quote in text at this point
    \\ : Insert a backslash character in text at this point
 */
public class variables {
    public static void main(String[] args){
        System.out.println("variables module");
        int var_Num = 20; 
        System.out.println(var_Num);

        boolean isSmart = true; 
        System.err.println(isSmart);
        
        float myDecimal = 5.9f; 
        System.out.println(myDecimal); 

        double myDouble = 7.87654; 
        System.out.println(myDouble);

        String message = "Mangalam here";
        System.out.println(message); 

        char char1 = 'g';
        System.out.println(char1); 

        // using escape sequence
        System.out.println("My name is \"Slim Shady\" ");

    }
}
