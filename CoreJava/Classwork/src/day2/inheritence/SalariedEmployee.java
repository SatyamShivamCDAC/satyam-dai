package day2.inheritence;

public class SalariedEmployee extends Employee{
    protected double basic;
    protected static double pf = 500;
    protected static int tax = 500;

    public SalariedEmployee(int empid, String name, double basic) {
        super(empid, name);
        this.basic = basic;
    }

    public double calculateGross(){
        double hra = basic * 0.4;
        double da = basic *0.15;
        return basic+hra+da;
    }

    public double calculateNet(){
        return calculateGross()-(pf+tax);
    }
}
