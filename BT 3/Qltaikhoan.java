package quanlytaikhoan;

// Lớp trừu tượng Account
abstract class Account {
    protected double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void withdraw(double amount);
}

// Lớp cụ thể SavingsAccount
class SavingsAccount extends Account {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= 100) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Rut tien khong thanh cong! So du sau rut phai lon hon hoac bang 100.");
        }
    }
}

// Lớp trừu tượng Factory
abstract class AccountFactory {
    public abstract Account createAccount(double initialBalance);
}

// Lớp cụ thể Factory cho SavingsAccount
class SavingsAccountFactory extends AccountFactory {
    @Override
    public Account createAccount(double initialBalance) {
        return new SavingsAccount(initialBalance);
    }
}

// Lớp chính để chạy chương trình
public class Qltaikhoan {
    public static void main(String[] args) {
        // Sử dụng Factory để tạo SavingsAccount
        AccountFactory factory = new SavingsAccountFactory();
        Account account = factory.createAccount(500);

        // Thử rút 300 lần 1
        System.out.println("So du ban đau: " + account.getBalance());
        account.withdraw(300);
        System.out.println("So du sau lan rut 300 đau tien: " + account.getBalance());

        // Thử rút 300 lần 2
        account.withdraw(300);
        System.out.println("So du sau lan rut 300 thu hai: " + account.getBalance());
    }
}