package org.example;

import java.util.Scanner;

public class LaonProvider {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Loan homeLoan = new HomeLoan();
        InterestCalculator calculator1 = new InterestCalculator(homeLoan);
        double d;
        System.out.println("Enter amount need for home loan ");
        d = in.nextDouble();
        System.out.println("Emi for your home loan is "+calculator1.calculateEMI(100000));

        System.out.println("Enter amount need for Car loan");
        d = in.nextDouble();
        Loan carLoan = new CarLoan();
        InterestCalculator calculator2 = new InterestCalculator(carLoan);

        System.out.println("Emi for your Car loan is "+calculator2.calculateEMI(50000));
    }
}
