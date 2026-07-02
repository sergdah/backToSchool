package task16;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account(1, "001", "BYN", 500.0);
        Account account2 = new Account(2, "002", "BYN", 300.0);
        Account account3 = new Account(3, "003", "BYN", 150.0);
        Account account4 = new Account(4, "004", "BYN", 700.0);
        Account account5 = new Account(5, "005", "BYN", 200.0);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);
        bank.addAccount(account5);

        // счт до изм
        bank.printAllAccounts();

        // перевод
        try {
            // Успешно
             System.out.println("Выполняем перевод...");
             bank.transferMoney("001", "002", 100.0);

            // Нет счёта
//            System.out.println("Выполняем перевод...");
//            bank.transferMoney("001", "999", 500.0);

            // Нет денег
            System.out.println("Выполняем перевод...");
             bank.transferMoney("003", "001", 500.0);

        } catch (AccountNotFoundException e) {
            // Обработка исключения AccountNotFoundException
            System.out.println("ERROR : AccountNotFoundException");
            System.out.println("Откройте счёт");
            System.out.println(e.getMessage());
            System.out.println("Код ошибки: " + e.getErrorCode());
        } catch (NotEnoughMoneyException e) {
            System.out.println("ERROR : NotEnoughMoneyException");
            System.out.println("Недостаточно средств для перевода");
            System.out.println(e.getMessage());
            System.out.println("Код ошибки: " + e.getErrorCode());
        } finally {
            System.out.println("Спасибо, что вопользовались услугами банка!!!");
        }
        // счт после изм
        bank.printAllAccounts();
    }
}