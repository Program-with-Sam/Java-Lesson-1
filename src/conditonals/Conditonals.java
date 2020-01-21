package conditonals;

public class Conditonals {
    Conditonals(){}

    private void testIf() {
        // Declare variables
        int a = 10, b = 5;

        // If a equals b
        if(a == b){

            // Write message
            System.out.println("A is equal to B");

        }

        // If a is less than b
        if(a < b) {

            // Write message
            System.out.println("A is less than B");

        }

        // If a is greater than b
        if(a > b) {

            // Write message
            System.out.println("A is greater than B");

            // If a is equal to 10
            if(a == 10) {

                // Write message
                System.out.println("A is equal to 10");

            }
        }

    }

    public void testElse() {
        // Declare variables
        int a = 10, b = 10;

        // If a is equal to b
        if(a == b) {

            // Write message
            System.out.println("A is equal to B");

        }
        // Else (Otherwise)
        else {

            // Write message
            System.out.println("A does not equal B");

        }

    }

    public void testElseIf() {
        // Declare variables
        int a = 10, b = 5, c = 5;

        // If b equals a
        if(b == a) {

            // Write message
            System.out.println("B is equal to A");

        }
        // Else if (Otherwise if)
        else if(b == c) {

            // Write message
            System.out.println("B is equal to C");

        }
        // Else (Otherwise)
        else {

            // Write message
            System.out.println("B is not equal to anything");

        }
    }

    public void testSwitch() {
        // Declare variable
        int a = 5;

        // Switch on a
        switch(a) {
            // If a equals 5
            case 5:
                // Write message
                System.out.println("A is equal to 5");
                // Break
                break;
            // If a equals 10
            case 10:
                // Write message
                System.out.println("A is equal to 10");
                // Break
                break;
            // If all cases fail
            default:
                // Write message
                System.out.println("A is not equal to 5 or 10");
                // Break
                break;
        }
    }

    public static void main(String args[]) {
        // Create object
        Conditonals c = new Conditonals();
        // Call one of the tests
        c.testSwitch();
    }
}
