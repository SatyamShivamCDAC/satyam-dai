package day2.inheritence;

public class Manager extends SalariedEmployee{

    protected double allowance;

    public Manager(int empid, String name, double basic, double allowance) {
        super(empid, name, basic);
        this.allowance = allowance;
    }

    public double calculateGross(){
        return super.calculateGross() + allowance;
    }

}
