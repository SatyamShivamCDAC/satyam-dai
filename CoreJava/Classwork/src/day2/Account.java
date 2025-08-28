package day2;

public class Account {
    private static float intrate = 6.5f;
    private int acccid;
    private String name;
    private double balance;

    public Account(String name, int acccid, double balance) {
        this.name = name;
        this.acccid = acccid;
        this.balance = balance;
    }

    public double calculateInterest(){
        return (balance*intrate*0.4)/100;
    }

    public static void displayInterestRate(){
        System.out.println("Current Rate of Interest : "+ intrate);;
    }
}
