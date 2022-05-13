import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner lanScan = new Scanner(System.in);
        System.out.println("Выберите язык обслуживанние \n     Choose maintenance language \n1)Русский        " +
                "2)English");
        Integer language = 0;
        while (true){
            language = lanScan.nextInt();
            if (language >= 3) {
                System.out.println("Ошибка!! \nМожно выбрать только (1) или (2)");
            }else {
                break;
            }
        }
            if (language == 1) {
                BankAccount bankAccount = new BankAccount();
                Scanner monScan = new Scanner(System.in);
                System.out.print("Введите сумму для пополнение: ");
                Integer money = monScan.nextInt();
                try {
                    bankAccount.Deposit(money);
                } catch (LimitException e) {
                    e.printStackTrace();
                }
                Scanner scanner = new Scanner(System.in);

                while (true) {
                    try {
                        System.out.print("Напишите сумму вывода: ");
                        bankAccount.withDraw(scanner.nextInt());

                    } catch (LimitException limitException) {
                        System.out.println(limitException.getMessage());
                        try {
                            bankAccount.withDraw((int) limitException.getRemainingAmmount());
                        } catch (LimitException e) {
                            e.printStackTrace();
                        }
                        break;
                    }
                }
            } else if (language == 2) {

                BankAccount bankAccount = new BankAccount();
                Scanner monScan = new Scanner(System.in);
                System.out.print("Enter the amount to top up: ");
                Integer money = monScan.nextInt();
                try {
                    bankAccount.Deposit(money);
                } catch (LimitException e) {
                    e.printStackTrace();
                }
                Scanner scanner = new Scanner(System.in);

                while (true) {
                    try {
                        System.out.print("Write the withdrawal amount: ");
                        bankAccount.withDraw(scanner.nextInt());

                    } catch (LimitException limitException) {
                        System.out.println(limitException.getMessage());
                        try {
                            bankAccount.withDraw((int) limitException.getRemainingAmmount());
                        } catch (LimitException e) {
                            e.printStackTrace();
                        }
                        break;
                    }
                }
            }
        }
    }


