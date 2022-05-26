package com.solvd.multithreads;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Backpack {
    public static void main(String[] args) {
        Map<String, Integer> products = new HashMap<>();
        products.put("coffee", 100);
        products.put("cake", 125);
        products.put("popcorn", 200);
        int coins = 400;
        for (Entry<String, Integer> entry: products.entrySet()) {
            if (entry.getValue() <= 400) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
        List<String> names = new ArrayList<>();
        names.add("coffee");
        names.add("cake");
        names.add("popcorn");
        for (String productName: names) {
            int sum = 0;
            String productNames = "";
            Map<String, Integer> tempProducts = new HashMap<>(products);
            tempProducts.remove(productName);
            for (Entry<String, Integer> entry: tempProducts.entrySet()) {
                sum = sum + entry.getValue();
                productNames = productNames + entry.getKey() + " ";
            }
            if (sum <= coins) {
                System.out.println(productNames + " " + sum);
            }
        }
    }
}


