package loops;

public class Loops {
    Loops() {}

    private void forLoopDemo() {
        // For 15 iterations
        for(int i = 0; i < 15; i++){
            // Write out the iteration number
            System.out.println("Iteration number: " + (i+1));
        }
    }

    private void whileLoopDemo() {
        // Set a boolean
        boolean flag = true;
        // Create a counter
        int i = 0;
        // While the boolean is true
        while(flag) {
            // Increment the counter
            i++;
            // Write out the iteration number
            System.out.println("Iteration Number: " + i);
            // If the iteration number is 5
            if(i == 5) {
                // Change the flag
                flag = false;
                /*
                This will then cause the loop to stop, as at the start of the loop the condition will evaluate to false
                 */
            }
        }
    }

    private void doWhileLoopDemo() {
        // Declare a boolean
        boolean flag = true;
        // Declare a counter
        int i = 0;
        // Do this
        do {
            // Increment the counter
            i++;
            // Write out the iteration number
            System.out.println("Iteration Number: " + i);
            // If the iteration number is 5
            if(i == 5) {
                // Increment the iteration number
                i++;
                // Change the flag
                flag = false;
                /*
                This will stop the loop
                 */
            }
        // While the boolean is true
        }while(flag);
    }

    public static void main(String args[]) {
        // Create an object
        Loops l = new Loops();
        // Call one of the demo functions
        l.doWhileLoopDemo();
    }
}
