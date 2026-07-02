package task16;

import java.util.HashSet;
import java.util.Set;

public class Bank {
    private Set<Account> accounts;

    public Bank() {
        this.accounts = new HashSet<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Счёт добавлен: " + account.getAccountNumber());
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    // Метод для поиска счёта по номеру
    public Account findAccountByNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
    }
        return null;
    }

    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) {

        Account accountFrom = findAccountByNumber(accountNumberFrom);
        Account accountTo = findAccountByNumber(accountNumberTo);

        // если нет счёта
        if (accountFrom == null || accountTo == null) {
            throw new AccountNotFoundException(
                    "Няма такого счёта (счетов)",
                    "not.found.account"
            );
        }
        
        // если нет денег
        if (accountFrom.getAmount() < amount) {
            throw new NotEnoughMoneyException(
                    "Нет столько денег. Есть только " + accountFrom.getAmount(),
                    "not.enough.money"
            );
        }

        // деньги минус
        Double newBalanceFrom = accountFrom.getAmount() - amount;
        accountFrom.setAmount(newBalanceFrom);

        // деньги плюс
        Double newBalanceTo = accountTo.getAmount() + amount;
        accountTo.setAmount(newBalanceTo);

        System.out.println("Перевод выполнен успешно!");
        System.out.println("Со счёта " + accountNumberFrom + " переведено: " + amount);
        System.out.println("На счёт " + accountNumberTo + " зачислено: " + amount);
    }

    public void printAllAccounts() {
        System.out.println("СОСТОЯНИЕ СЧЕТОВ");
        for (Account account : accounts) {
            System.out.println(account);
        }
        System.out.println("================================");
    }
}