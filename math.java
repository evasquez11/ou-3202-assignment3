import java.util.Scanner;

public class math {

    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of elements in array");

            n = sc.nextInt();

            int[] array = new int[n];

            System.out.println("Enter elements of the array: ");

            for (int i = 0; i < n; i++) {
                // reading array elements from the user
                array[i] = sc.nextInt();
            }

            int sum = getSum(n, array);

            System.out.println("Sum of given array is " + sum);

        }

    }


    public static int getSum(int n, int[] array) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        return sum;
    }

}
