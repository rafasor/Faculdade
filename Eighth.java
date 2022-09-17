import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter how many ages do you need:");
        int num = input.nextInt();
        int[] arr = new int[num];
        for (int b = 0; b < arr.length; b++) {
            System.out.print("age number." + (b + 1) + "=");
            arr[b] = input.nextInt();
            if (arr[b] > 18) {
                arr[b]++;
                System.out.println("They are : " + (b + 1) + " Peaplo more than 18 ");
            }
        }
    }
}
