package org.example;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        CallReader();
    }

     //Calls the Reader-class that is responsible for reading the .txt file and return each line.
    private static void CallReader() {
        try {
            ArrayList<String> fileText = Reader.readFile();
            Main.CallExtractor(fileText);
        }
        catch (FileNotFoundException ex)
        {
            ex.getMessage();
            ex.getStackTrace();
        }
    }

     //Calls the Extractor-class that is responsible for splitting each line into individual pieces of usable data.
    private static void CallExtractor(ArrayList<String> fileText) {
        ArrayList<Loan> loans = Extractor.extractData(fileText);
        CallLoanCalculator(loans);
    }

    //Calls the LoanCalculator-class that is responsible for calculating the fixed monthly payment.
    private static void CallLoanCalculator(ArrayList<Loan> loans) {

        for (Loan loan : loans) {

            double fixedMonthlyPayment = LoanCalculator.CalculateLoan(loan);
            Main.CallPrintDetails(loan.GetProspectNumber(), loan.GetName(), loan.GetTotalLoan(), fixedMonthlyPayment, loan.GetYears());
        }
    }

    //Calls the print method in the LoanCalculator-class that prints the result in the console.
    private static void CallPrintDetails(int prospectNumber, String name, double totalLoan, double fixedMonthlyPayment, int years) {
        LoanCalculator.PrintLoanDetails(prospectNumber, name, totalLoan, fixedMonthlyPayment, years);
    }
}