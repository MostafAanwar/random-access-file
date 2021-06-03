package com.company;

public class Product {

    private int id;
    private int price ;
    private int quantity;
    public int setId(int id){
        return this.id=id;
    }
    public int getId(){
        return this.id;
    }
    public int setPrice(int price){
        return this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
    public int setQuantity(int quantity){
        return this.quantity=quantity;
    }
    public int getQuantity(){
        return this.quantity;
    }



}