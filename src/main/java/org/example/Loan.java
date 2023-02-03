package org.example;

public class Loan {

    private int prospectNumber;
    private String name;
    private double totalLoan;
    private double interest;
    private int years;

    public Loan(int prospectNumber, String name, double totalLoan, double interest, int years) {
        this.prospectNumber = prospectNumber;
        this.name = name;
        this.totalLoan = totalLoan;
        this.interest = interest;
        this.years = years;
    }

    public void testPrint() {
        System.out.println("Name: " + name + " Total Loan: " + totalLoan + " interest: " + interest + " years: " + years);
    }

    public int GetProspectNumber() { return prospectNumber; }
    public String GetName(){
        return name;
    }
    public double GetTotalLoan(){
        return totalLoan;
    }
    public double GetInterest(){
        return interest;
    }
    public int GetYears(){
        return years;
    }
}