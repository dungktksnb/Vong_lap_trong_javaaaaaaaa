import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numbers;
        Scanner sc = new Scanner(System.in);
        System.out.println("số lượng số nguyên tố bạn muốn in ra là: ");
        numbers = sc.nextInt();
        int count = 0;
        int number = 2;
        while (count < numbers) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
}

