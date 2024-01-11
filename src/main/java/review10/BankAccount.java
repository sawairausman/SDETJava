package review10;

public class BankAccount {
    private double balance;
    private String userName;
    private String Password;

    BankAccount(double balance, String userName, String password) {
        this.userName = userName;
        this.Password = password;
        setBalance(balance);

    }


    void setBalance(double balance) {

        if (balance < 0) {
            System.out.println("Wrong Balance amount");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }
    void setUserName(String userName){

        if(userName.length()<4){
            System.out.println("UserName should be more than 4 characters");
        }else{
            this.userName=userName;
        }
    }

    void setPassword(String password){
        this.Password=password;
    }

    void transferFunds(double amountToTransfer) {
        balance = balance - amountToTransfer;
    }

    double getBalance(){
        return balance;
    }

}

