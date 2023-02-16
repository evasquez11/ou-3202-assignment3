import java.util.Scanner;

public class math {
// THIS IS PART-10 BRANCH
    public static void main(String[] args) {
        int size;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of elements in array");

            size = sc.nextInt();

            int[] array = new int[size];

            System.out.println("Enter elements of the array: ");

            for (int i = 0; i < size; i++) {
                // reading array elements from the user
                array[i] = sc.nextInt();
            }

            int sum = getSum(size, array);
            int product = getProduct(size, array);

            System.out.println("Sum of given array is " + sum);
            System.out.println("Product of given array is " + product);

        }

    }

    public static int getProduct(int size, int[] array){
        int product = 1;
        int i = 0;
        int j = size - 1;
        while(i < j){
            product *= array[i] * array[j];
            i++;
            j--;
        }

        if (i == j) {
            product *= array[i];
        }
        return product;

    }


    public static int getSum(int size, int[] array) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        return sum;
    }

}
