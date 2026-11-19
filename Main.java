import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[]args) {
        System.out.println("we are creating a new acount for you");
        Scanner scanner = new Scanner(System.in);
        System.out.print("how do you want us to call you? ");
        String name = scanner.nextLine();
        System.out.println(name+"thank you for creating your bank account with us.");
        System.out.print("please give us your name and surname: ");
        String nam=scanner.nextLine();
        System.out.print("please give us your email: ");
        String em=scanner.nextLine();
        System.out.print("please give us the accout number that we sent you ");
        int num=scanner.nextInt();
        System.out.print("how much will you like to put inside your account ? ");
        int mon=scanner.nextInt();
        System.out.print("how much will you like to withdraw the first time with this account?  ");
        int mr=scanner.nextInt();
        System.out.print("please give us your phone number: ");
        int phon=scanner.nextInt();
        Bankaccount n = new Bankaccount();
        Bankaccount ali = new Bankaccount(num, mon, nam, em, phon);
        n.depositFunds(mon);
        n.withdrawal(mr);
    }
}