package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String suma = "Śliwki:30:2.5/Masło:20:6.20/Kapusta:2:3/Margaryna:10:20/Śliwki:10:2.5/Majonez:8:4/Jabłka:10:4/Kapusta:5:3/Śliwki:20:3.20/Masło:2:3.33/Kiełbasa:2:4.44/Ciasto:4:2.22";
        String[] stringArray = suma.split("/");

        Product[] products = new Product[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            String foo = stringArray[i];
            String[] tnij = foo.split(":");

            products[i] = new Product(tnij[0],
                    Integer.valueOf(tnij[1]),
                    Double.parseDouble(tnij[2]));
        }
        Calculate oblicz = new Calculate();

        double monety = oblicz.sumaAll(products);

        oblicz.mostExpensiwe(products);
        oblicz.wypisz(products);
        oblicz.showFraud(products);
        System.out.println("Liczba niezbędnych monet to: " + oblicz.theRest(monety));
    }
}



