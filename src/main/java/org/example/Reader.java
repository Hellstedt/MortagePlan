package org.example;

import java.io.*;
import java.util.Scanner;

public class Reader {
    public static void readFile() {

        InputStream input = Reader.class.getResourceAsStream("/prospects.txt");
        if(input != null)
        {
            Scanner sc = new Scanner(input);

            sc.nextLine();
            while (sc.hasNextLine())
            {
                String line = sc.nextLine();
                if(line.equals("")){
                    break;
                }
                Extractor.extractData(line);
            }
            sc.close();
        }
        else
        {
            System.out.println("File not found");
        }
    }
}