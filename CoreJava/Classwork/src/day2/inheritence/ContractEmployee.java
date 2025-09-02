package day2.inheritence;

public class ContractEmployee extends Employee{
    public ContractEmployee(int empid, String name) {
        super(empid, name);
    }

    @Override
    public double calculateGross() {
        return 0;
    }
}
