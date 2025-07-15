import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter your basic details ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.println("Please enter your roll no: ");
        Long roll_no = sc.nextLong();
        System.out.println(roll_no);
        System.out.println(sc.nextLine());

        System.out.println("Please enter your university email: ");
        String email = sc.nextLine();
        System.out.println(email);
    }
}