package org.lessons.java.shop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




        Prodotto prodotto2 = new Prodotto("Patatine","Salatissime",10.00F, 30);
        Prodotto prodotto3 = new Prodotto("Iphone","14",1000.00F, 14);
        Prodotto prodotto4 = new Prodotto("Pallone","Da calcio",2.99F, 22);

        System.out.println(prodotto2.getFullName() + "-" + prodotto2.entirePrice() + "---" +
                prodotto3.getFullName() + "-" + prodotto3.entirePrice() + "----" + prodotto4.getFullName() + "-" + prodotto4.entirePrice())  ;





    }
}
