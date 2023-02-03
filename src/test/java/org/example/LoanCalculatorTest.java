package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoanCalculatorTest {
    //Tests for method LoanCalculator.CalculateLoan()
    @Test
    void ShouldReturnOneThousandFiveHundredEightyPointTwoThreeFiveEight() {
        Loan loan = new Loan(1, "Emily Davis", 250000, 6.5, 30);
        assertEquals(1580.2358, LoanCalculator.CalculateLoan(loan), 0.1);
    }
    @Test
    void ShouldReturnThreeHundredSixteenPointFiveNineOneZero() {
        Loan loan = new Loan(2, "Peter Davis", 7000, 8, 2);
        assertEquals(316.5910, LoanCalculator.CalculateLoan(loan), 0.1);
    }

    //Tests for method LoanCalculator.CalculateExponent()
    @Test
    void ShouldReturnSixtyFour()
    {
        assertEquals(64, LoanCalculator.GetPowerOf(2,6));
    }
    @Test
    void ShouldReturnFifteenPointSixTwoFive()
    {
        assertEquals(15.625, LoanCalculator.GetPowerOf(2.5,3));
    }
}