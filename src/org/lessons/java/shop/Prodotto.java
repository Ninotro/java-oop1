package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
   private int code;
   private String name;
    private String description;
    private  float  price;
    private  int iva;

    public Prodotto( String name, String  description, float price,int  iva) {


        code = generateRandomCode();
        this.name = name;
        this.description= description;
        this.price = price;
        this.iva = iva;

    }



    public int getCode() {




        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float  getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public float entirePrice() {
      return    price + (price * iva / 100 );

    }

    public String getFullName() {
        return code+name ;
    }

  private int  generateRandomCode() {

      Random randomGenerator = new Random();
      int randomNumber = randomGenerator.nextInt(0, 99999999);







      return randomNumber;
  }



};

