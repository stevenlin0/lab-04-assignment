public class HelloWorld {
    static void printHelloWorld(int n) {
        // If n is less than or equal to  0, stop the recursion
        if (n <=  0) {
            return;
        }
        // Print "Hello World" and then call the method with n -  1
        System.out.println("Hello World!");
        printHelloWorld(n -  1);
    }
    // The main method to test the recursive method
    public static void main(String[] args) {
        // Call the printHelloWorld method with the desired number of times
        printHelloWorld(5); // Replace 5 with the desired number of times
    }
}
