package org.example;

public class InterestCalculator {

    private Loan loan;


    public InterestCalculator(Loan loan) {
        this.loan = loan;
    }

    public double calculateEMI(double amount) {
        return amount * loan.loanInterest() / 100;
    }
}
