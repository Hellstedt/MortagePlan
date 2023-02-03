package org.example;

import java.util.ArrayList;

public class Extractor {
    public static ArrayList<Loan> extractData(ArrayList<String> lines) {
        ArrayList<Loan> loans = new ArrayList<Loan>();
        int prospectNumber = 1;

        for (String line : lines) {
            if(line.startsWith("\"")) {
                line = line.replaceAll("\"", "").replaceFirst(",", " ");
            }

            String[] variableData = line.split(",");

            Loan loan = new Loan(
                    prospectNumber,
                    variableData[0],
                    Double.parseDouble(variableData[1]),
                    Double.parseDouble(variableData[2]),
                    Integer.parseInt(variableData[3])
            );
            loans.add(loan);
            prospectNumber++;
        }
        return loans;
    }
}
