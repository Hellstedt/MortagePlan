package org.example;

public class LoanCalculator {

public static double CalculateLoan(Loan loan) {

        double loanTotalLoan = loan.GetTotalLoan();
        double loanMonthlyInterest = (loan.GetInterest() / 100) / 12 ;
        int loanYearsInMonths = loan.GetYears() * 12;

        double parentheses = CalculatePowerOf((1+loanMonthlyInterest), loanYearsInMonths);
        double fixedMonthlyPayment = loanTotalLoan * (loanMonthlyInterest * parentheses) / (parentheses - 1);

    return fixedMonthlyPayment;
}

    private static double CalculatePowerOf(double base, int exponent) {
        double power = base;
        if (exponent == 0)
            return 1;
        for (int i = 1; i < exponent; i++) {
            power *= base;
        }
        return power;
    }

    //Getter-method for Unit test
    public static double GetPowerOf(double base, int exponent)
    {
        return CalculatePowerOf(base, exponent);
    }

public static void PrintLoanDetails(int prospectNumber, String prospectName, double totalLoan, double fixedMonthlyPayment, int years) {
    System.out.println("****************************************************************************************************");
    System.out.println("Prospect " + prospectNumber + ": " + prospectName + " wants to borrow " + totalLoan + " € for a period of " + years + " years and pay " + String.format("%.2f",fixedMonthlyPayment) + " € each month");
    System.out.println("****************************************************************************************************");
}
}
