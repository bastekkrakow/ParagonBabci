package com.company;

import java.util.*;

public class Calculate {

    public double sumaAll(Product[] products) {
        double productSum = 0;
        for (int i = 0; i < products.length; i++)
            productSum = productSum + (products[i].price * products[i].quantity);
        return productSum;
    }


    public double mostExpensiwe(Product[] products) {
        double maxPrice = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].price > maxPrice) maxPrice = products[i].price;
        }
        return maxPrice;
    }


    public void wypisz(Product[] products) {
        System.out.println("Wartość wszystkich zakupów to: " + sumaAll(products) + " zł");
        System.out.println("Najdroższy produkt kosztuje: " + mostExpensiwe(products) + " zł");
    }

    public void showFraud(Product[] products) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products.length; j++) {
                if ((products[i].name.equals(products[j].name) && products[i].price != products[j].price))
                    set.add(products[i].name);
            }
        }
        System.out.println("Te same produkty o różnej cenie to: " + set + " Uwaga! Kasjerka oszukała!");
    }

    public int theRest(double coinNumber) {
        int coinsCount = 0;
        double[] nominals = {5, 2, 0.2, 0.1, 0.05, 0.01};
        for (int i = 0; i < nominals.length; i++) {
            coinsCount += (coinNumber / nominals[i]);
            coinNumber -= (int) (coinNumber / nominals[i]) * nominals[i];
        }
        return coinsCount;


    }
}