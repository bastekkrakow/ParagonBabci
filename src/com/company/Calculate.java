package com.company;

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
        String[] theSame = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products.length; j++) {
                if ((products[i].name.equals(products[j].name) && products[i].price != products[j].price) && theSame[i] != products[i].name)
                    theSame[i] = products[i].name;
            }
        }
        System.out.println("Te same produkty o różnej cenie to: " + theSame[0] + " " + theSame[1]);
    }

    public int theRest(double coinNumber) {
        int coinsCount = 0;
        double[] nominals = {5, 2, 0.2, 0.1, 0.05, 0.01};

        for (double n : nominals) {
            coinsCount += (coinNumber / n);
            coinNumber -= (int) (coinNumber / n) * n;
        }
        return coinsCount;
    }
}