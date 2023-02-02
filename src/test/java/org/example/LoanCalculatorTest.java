package org.example;

import org.junit.jupiter.api.Test;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LoanCalculatorTest {

    //Test for method LoanCalculator.CalculateLoan() 1580,2358243739930836098516767312
    @Test
    void TestLoanCalculator() {
        ArrayList<Loan> loans = new ArrayList<Loan>();
        loans.add(new Loan("Emily Davis", 250000, 6.5, 30));
        assertEquals();

    }

    //Test for method LoanCalculator.CalculateExponent()
    @Test
    void ShouldReturnSixtyFour() {

        assertEquals(64, LoanCalculator.TestCalculatePowerOf(2,6));
    }

    //Test for method LoanCalculator.CalculateExponent()
    @Test
    void ShouldReturnFifteenPointSixTwoFive() {

        assertEquals(15.625, LoanCalculator.TestCalculatePowerOf(2.5,3));
    }
}