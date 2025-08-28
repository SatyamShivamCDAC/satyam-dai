package day3.vehicle;

public class Policy {

    public static void displayInsurance(Vehicle vehicle){

        System.out.format("\nInsurance amount for %s %s is %.2f\n",vehicle.getCompany(),vehicle.getModel(),vehicle.calculateInsurance());

    }


}
