package digitalBank;
import java.util.Scanner;

public class Main {

    public static float value;
            public static void main(String[] args) {
            Account account = new account();
            Scanner read = new Scanner(System.in);

            String name;
            int numberMenu, operation;
            float balance, limit, value;
            do {
                System.out.println("                  Home Menu            ");
                System.out.println("1- Insert data: ");
                System.out.println("2- Show data: ");
                System.out.println("3- Deposit value: ");
                System.out.println("4-Withdraw value: ");
                System.out.println("5-Show balance: ");
                System.out.println("6-Transfer value: ");
                System.out.println("7-Show savings account: ");
                System.out.println("8- Exit");
                read.nextLine();
                operation = read.nextInt();
                switch (operation) {

                    case 1:
                        System.out.println("Insert a name: ");
                        name = read.nextLine();

                        System.out.println("Insert a number: ");
                        numberMenu = read.nextInt();

                        System.out.println("Balance: ");
                        balance = read.nextFloat();

                        System.out.println("Limit: ");
                        limit = read.nextFloat();

                        account.insertData(name, numberMenu, balance, limit);
                        break;

                    case 2:
                        account.showData();
                        break;

                    case 3:
                        System.out.println("Insert the deposite value: ");
                        value = read.nextFloat();
                        account.deposite(value);

                        break;

                    case 4:
                        account.showBalance();
                        System.out.println("Insert the deposite withdraw: ");
                        value = read.nextFloat();
                        account.withdraw(value);
                        break;

                    case 5:
                        account.showBalance();
                        break;
                }
            }
            while (operation != 0);

        }
    }
