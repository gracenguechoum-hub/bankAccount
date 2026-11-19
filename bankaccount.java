public class Bankaccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;
    public Bankaccount(){
        this(52,5600,"defaultName","defaultaddress",596325418);
        System.out.println("this account is empty");
    }
    public Bankaccount(int accountNumber,double balance,String customerName,String emailAccount,long phoneN){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        emailAccount=email;
        phoneN=phoneNumber;
    }

    public  void depositFunds(double depositAmount){
        balance+=depositAmount;
        System.out.println("the deposit of "+depositAmount+" made. New balance is "+balance+" €");
    }
    public void withdrawal(double withdrawalAmount){
        if(balance-withdrawalAmount<0){
            System.out.println("balance is insufficient. Your balance is "+balance+" €");
        }else{
            balance-=withdrawalAmount;
            System.out.println("your new balance is "+balance+" €");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        if (balance <0) System.out.println("invalid amount");
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email=email;

    }

    public void setPhoneNumber(long phoneNumber) {
        if (phoneNumber<0 ) {
            System.out.println("invalid number");
        }else{
            this.phoneNumber = phoneNumber;
        }

    }

}
