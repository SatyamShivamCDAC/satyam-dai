package day2.inheritence;

public class Payroll {
    public static void main(String[] args) {
        Manager m1 = new Manager(1,"Satyam",120000,30000);
        System.out.println(m1.calculateGross());
        System.out.println(m1.calculateNet());

        SalariedEmployee m2 = new SalariedEmployee(2,"Shivam",130000);

        System.out.println(Manager.pf);
        System.out.println(Manager.tax);
    }
}
