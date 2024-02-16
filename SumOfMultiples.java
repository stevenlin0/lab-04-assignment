public class SumOfMultiples {

    public static int sumOfMultiples(int n1, int n2) {
        // If n1 is greater than n2, return  0
        if (n1 > n2) {
            return  0;
        }

        // Check if n1 is a multiple of  7
        int sum = (n1 %  7 ==  0) ? n1 :  0;

        // Recursive call with n1 +  1
        return sum + sumOfMultiples(n1 +  1, n2);
    }

    public static void main(String[] args) {
        int n1 =  1;
        int n2 =  20;
        int sum = sumOfMultiples(n1, n2);
        System.out.println("The sum of multiples of  7 between " + n1 + " and " + n2 + " is: " + sum);
    }
}