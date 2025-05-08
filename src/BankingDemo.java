import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}

@Data
@AllArgsConstructor
class Account {
    private String owner;
    private int balance;
    private String accountNumber;

    public void executeTransfer(int amount) throws NotEnoughMoneyException {
        if (amount > balance) {
            throw new NotEnoughMoneyException("Insufficient funds: Requested transfer amount $" +
                    amount + " exceeds available balance $" + balance);
        }
        balance -= amount;
        System.out.println("Transfer successful. $" + amount + " transferred.");
    }
}


public class BankingDemo {
    public static void main(String[] args) {
        Account myAccount = new Account("John Doe", 100, "ACC123456");

        try {
            System.out.println("Transfer of 100");
            myAccount.executeTransfer(100);

            System.out.println("\nTransfer of 200");
            myAccount.executeTransfer(200);

        } catch (NotEnoughMoneyException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("\nFinally clause: Current account balance is $" + myAccount.getBalance());
        }
    }
}