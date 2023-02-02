package org.example;

public class Loan {

    private String name;

    private double totalLoan;

    private double interest;

    private int years;

    public Loan(String name, double totalLoan, double interest, int years){
        this.name = name;
        this.totalLoan = totalLoan;
        this.interest = interest;
        this.years = years;
    }

    public void testPrint() {
        System.out.println("Name: " + name + " Total Loan: " + totalLoan + " interest: " + interest + " years: " + years);
    }

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