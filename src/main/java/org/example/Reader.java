package org.example;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    public static void readFile() {

        InputStream input = Reader.class.getResourceAsStream("/prospects.txt");
        if(input != null)
        {
            ArrayList<String> lines = new ArrayList<String>();
            Scanner sc = new Scanner(input);

            sc.nextLine();
            while (sc.hasNextLine())
            {
                String line = sc.nextLine();
                if(line.equals("")){
                    break;
                }
                lines.add(line);
            }
            sc.close();
            Extractor.extractData(lines);
        }
        else
        {
            System.out.println("File not found");
        }
    }
}