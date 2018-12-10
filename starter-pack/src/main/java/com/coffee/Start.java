package com.coffee;

import com.coffee.model.Sale;
import com.coffee.reader.Reader;

import java.io.*;
import java.util.ArrayList;

class Start {
    public static void main(String args[]) throws IOException {
        task1();
        task2();
    }

    // TASK 1: Calculate the total sales
    public static void task1() throws IOException {
        ArrayList<Sale> sales = Reader.getShopSales();

        double totalSales = 0.0;
        // Your code goes here

        //This will print your result
        System.out.println("The total sales for the day is " + totalSales);
    }

    // TASK 2: Calculate the most popular items based on the sales and print them in order
    public static void task2() throws IOException {
        ArrayList<Sale> sales = Reader.getShopSales();

        String[] orderedItems = {"cheese", "milk", "bacon"};
        //YOUR CODE GOES HERE

        // This will print the list
        int index = 1;
        for(String s: orderedItems){
            System.out.println(index + " " + s);
            index++;
        }
    }
}