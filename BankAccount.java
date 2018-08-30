public class BankAccount
{
    private String accountHolder;
    private int accountNum;
    private double balance;
    private String password;
    private boolean loggedIn;
    
    public BankAccount(String accountHolder, int accountNum, double balance, String password)
    {
       this.balance = balance;
       this.accountHolder = accountHolder;
       this.password = password;
       this.accountNum = accountNum;
       loggedIn = false;
    }
     
    public boolean logIn(String name, String password)
    {
        if (accountHolder.equals(name) && this.password.equals(password))
        {
            loggedIn = true;
        }
        return loggedIn;
    }
    
    public void logOut()
    {
       loggedIn = false; 
    }
    
    public void deposit(double amount)
    {
        if (loggedIn)
        {
            balance = balance + amount;
        }
        
    }
    
    public void withdraw(double amount)
    {
        if (loggedIn && amount <= balance)
        {
            balance = balance - amount;
        }
        else
        {
            throw new IllegalArgumentException();
        }        
    }
    
    public double getBalance()
    {
        if (loggedIn)
        {
            return balance;
        }
        else
        {
            throw new IllegalArgumentException();
        }
    }
    
    public String toString()
    {
        String s = "[Account #: " + accountNum + ", Balance: " + balance +"]";
        return s;
    }
}