import java.util.Scanner;

public class Menu {

    private int menuOption;
    Scanner menuInput = new Scanner(System.in);
    private int balance;
    private int deposit;
    private int withdraw;

    Account account1 = new Account(1,"Dawid","Kulikowski" , 1000);


    public int showMenu() {


        System.out.println("1. Check your balance");
        System.out.println("2. Withdraw ");
        System.out.println("3. Deposit ");
        menuOption = menuInput.nextInt();

        switch (menuOption) {
            case 1:
                balance = account1.balance;
                System.out.println("Your balance is: " + account1.balance);
                showMenu();
                break;
            case 2:
                System.out.println("How much do you want to withdraw? ");
                withdraw = menuInput.nextInt();
                account1.withdraw(withdraw);
                System.out.println("You withdraw: " + withdraw);
                System.out.println("Now your balance is: " + account1.balance);
                showMenu();
                break;
            case 3:
                System.out.println("How much do you want to deposit? ");
                deposit = menuInput.nextInt();
                account1.deposit(deposit);
                System.out.println("You deposited: " + deposit);
                System.out.println("Now your balance is: " + account1.balance);
                showMenu();
                break;

        }

        return menuOption;
    }
}
