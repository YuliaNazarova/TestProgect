package com.sclad;

public class Tovar {
    String name;
    String date;
    String color;
    int kollich;
    int cost;
//    public static void main(String[] args) {
//
//     //   Tovar tele = new Tovar("телек", "октя", "цвет", 5, 12000);
//    }

    public Tovar(String name, String date, String color, int kollich, int cost){
        this.name = name;
        this.date = date;
        this.color = color;
        this.kollich = kollich;
        this.cost = cost;
        System.out.println("Товар: "+this.name);
        System.out.println("Дата: "+this.date);
        System.out.println("Цвет: "+this.color);
        System.out.println("количество: "+this.kollich);
        System.out.println("цена: "+this.cost);
    }
    public String getInfo() {
        return name+" " +date+" "+color+" "+kollich+ ""+cost;
    }
}
