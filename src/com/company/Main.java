package com.company;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String path = "product handphone.csv";
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            int i = 1;
            while ((line=br.readLine())!=null){
                String values[] = line.split(",");
                System.out.println("================");
                System.out.println(i++);
                System.out.println("Name of product: "+values[4] + "\n");
                System.out.println("price of product :"+values[5] + "\n");
                System.out.println("description of product: "+values[6] + "\n");
                System.out.println("rating of product: "+values[7] + "\n");
                System.out.println("Image url of product :"+values[8] + "\n");

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
