package org.lessons.java.bank;

import java.util.Random;

public class Conto {

    int conto;
    String name;

    float countMoney;

    public Conto ( String name) {
        Random randomNumber = new Random();
        conto = randomNumber.nextInt(1, 1000); ;
        this.name=name;
        countMoney=0;

    }

    public int getConto() {
        return conto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCountMoney() {
        return countMoney;
    }

    public void addMoney(float moneyAdd) {
        countMoney +=  moneyAdd;
    }

    public void lessMoney(float moneyLess) {
        countMoney -=  moneyLess;
    }

    public String information() {
         return "Il suo codice di conto è:" + conto + "Il proprietario è :" + name + " Il saldo disponibile è: " + countMoney + "Euro";
    }
}
