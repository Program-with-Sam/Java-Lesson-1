package variables;

public class Primitives {

    // This is 8-bits in size which can represent an integer in the range of -128 to 127
    byte exampleByte = 60;

    // This is 16-bits in size which can take a minimum value of 0 and a maximum of 65,535 and is used to represent any Unicode character
    char exampleChar = 'a';

    // This is 16-bits in size that represents integers in the range -32,768 to 32,768
    short exampleShort = 32000;

    // This is 32-bits in size that represents integers in the range -2,147,483,648 to 2,147,483,647
    int exampleInt = 10;

    // This is 64-bits in size that represents integers in the range -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
    long exampleLong = 65L;

    // This is 32-bits in size and represents a single precision floating point (decimal) number. This means it can represent decimal numbers in the range 3.402,823,5 E+38 to 1.4 E-45
    float exampleFloat = 26.5f;

    // This is 64-bits in size and represents a double precision floating point (decimal) number. This means it can represent decimal numbers in the range 1.797,693,134,862,315,7 E+308 to 4.9 E-324
    double exampleDouble = 65.5;

    // This is a simple flag variable that can take the value true or false
    boolean exampleBoolean = true;

    Primitives() {

    }

    public static void main(String args[]) {
        /*
        Create the Primitives object
         */
        Primitives p = new Primitives();

        // Write out the byte
        System.out.println("The byte is: " + p.exampleByte);

        // Write out the char
        System.out.println("The char is: " + p.exampleChar);
        // Create a new number using the char, this proves it is technically an integer
        int newNum = 5 + p.exampleChar;
        // Output the number
        System.out.println("The new num is: " + newNum);

        // Write out the short
        System.out.println("The short is: " + p.exampleShort);
        // Write out max value for short
        System.out.println("Maximum value for short is: " + Short.MAX_VALUE);
        // Write out min value for short
        System.out.println("Minimum value for short is: " + Short.MIN_VALUE);

        // Write out int
        System.out.println("The int is: " + p.exampleInt);
        // Write out max value for int
        System.out.println("Maximum value for int is: " + Integer.MAX_VALUE);
        // Write out min value for int
        System.out.println("Minimum value for int is: " + Integer.MIN_VALUE);

        // Write out long
        System.out.println("The long is: " + p.exampleLong);
        // Write out max value for long
        System.out.println("Maximum value for long is: " + Long.MAX_VALUE);
        // Write out min value for long
        System.out.println("Minimum value for long is: " + Long.MIN_VALUE);

        // Write out float
        System.out.println("The float is: " + p.exampleFloat);
        // Write out max value for float
        System.out.println("Maximum value for float is: " + Float.MAX_VALUE);
        // Write out min value for float
        System.out.println("Minimum value for float is: " + Float.MIN_VALUE);

        // Write out double
        System.out.println("The double is: " + p.exampleDouble);
        // Write out max value for double
        System.out.println("Maximum value for int is: " + Double.MAX_VALUE);
        // Write out min value for double
        System.out.println("Minimum value for int is: " + Double.MIN_VALUE);

        // Write out boolean
        System.out.println("The boolean is: " + p.exampleBoolean);
    }
}
