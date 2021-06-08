import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRaet=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập số tiền gửi: ");
        money=scanner.nextDouble();
        System.out.println("nhập số tháng gửi :");
        month=scanner.nextInt();
        System.out.println("nhập tỉ lệ lãi xuất :");
        interestRaet=scanner.nextDouble();
        double totalInterest=0;
        for (int i=0;i<month; i++){
            totalInterest +=money*(interestRaet/100)/12*month;

        }
        System.out.println(totalInterest);
    }
}
