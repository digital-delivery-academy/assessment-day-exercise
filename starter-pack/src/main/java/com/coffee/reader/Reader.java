package com.coffee.reader;

import com.coffee.model.Item;
import com.coffee.model.Sale;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {

    public static ArrayList<Sale> getShopSales() throws IOException {
        ArrayList<Item> items = getPriceList();

        ArrayList<Sale> sales = new ArrayList<>();
        BufferedReader salesReader = new BufferedReader(new FileReader("../coffee shop Monday sales"));

        String sale;
        salesReader.readLine();
        while ((sale = salesReader.readLine()) != null) {
            String[] saleParts = sale.split(",");
            Item item = items.stream().filter(i -> i.getName().equals(saleParts[0].trim())).findFirst().get();
            sales.add(new Sale(item, saleParts[1].trim(), Integer.parseInt(saleParts[2].trim()), stringOrNull(saleParts[3].trim())));
        }

        return sales;
    }

    private static ArrayList<Item> getPriceList() throws IOException {
        ArrayList<Item> items = new ArrayList<>();
        BufferedReader priceReader = new BufferedReader(new FileReader("../Coffee shop price list"));

        String item;
        priceReader.readLine();
        while ((item = priceReader.readLine()) != null) {
            String[] itemParts = item.split(",");
            items.add(new Item(itemParts[0].trim(), Double.parseDouble(itemParts[1].trim())));
        }

        return items;
    }

    private static String stringOrNull(String string) {
        if (string.equals("null"))
            return null;
        else
            return string;
    }
}
