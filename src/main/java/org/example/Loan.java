package org.example;

public class Loan {

    public Loan(String name, double totalLoan, double interest, int years){
        this.name = name;
        this.totalLoan = totalLoan;
        this.interest = interest;
        this.years = years;
    }
    private String name;

    private double totalLoan;

    private double interest;

    private int years;

    public void testPrint() {
        System.out.println("Name: " + name + " Total Loan: " + totalLoan + " interest: " + interest + " years: " + years);
    }

}