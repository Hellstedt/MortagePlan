package org.example;

import java.util.ArrayList;

public class Extractor {

    public static void extractData(String line){

        if(line.startsWith("\"")) {
            line = line.replaceAll("\"", "").replaceFirst(",", " ");
        }


        String[] variableData = line.split(",");

        Loan loan = new Loan(
                variableData[0],
                Double.parseDouble(variableData[1]),
                Double.parseDouble(variableData[2]),
                Integer.parseInt(variableData[3])
        );
        loan.testPrint();
    }
}
