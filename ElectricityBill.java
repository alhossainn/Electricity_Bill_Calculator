import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter How Much Unit You Consumed This Month: ");
        int unit = input.nextInt();
        System.out.println();
        double bill = 0;
        double baseMonthlyCharge = 120.0;

        if (unit<0) {
            System.out.println("Error!! You Gave Wrong Value :-(");
        }

        else if (unit<75){
            bill = bill + unit * 5;
        }

        else if (unit>=75) {
            unit = unit-75;
            bill = bill + 75*5;

            if (unit>=125) {
                unit = unit-125;
                bill = bill + 125*6;

                if (unit>=200) {
                    unit = unit-200;
                    bill = bill + 200*6.5;

                    if (unit>=300) {
                        unit = unit-300;
                        bill = bill + 300*7.9;

                        if (unit>0) {
                            bill = bill + unit * 10;
                        }
                        else
                            bill = bill + unit * 10;
                    }
                    else
                        bill = bill + unit * 7.9;
                }
                else
                    bill = bill + unit * 6.5;
            }
            else
                bill = bill + unit * 6;
        }

        if (bill>0) {
            System.out.println("Your Bill: " + (bill + baseMonthlyCharge));
            System.out.println("Pay the bill within the last date of bill submission!");
            System.out.println("Thank You :-)");
        }

        else if (unit==0) {
            System.out.println("Your Bill: " + baseMonthlyCharge);
            System.out.println("Pay the bill within the last date of bill submission!");
            System.out.println("Thank You :-)");
        }

        else
            System.out.print(" ");

    }
}
