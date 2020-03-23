package com.sclad;

import java.util.Scanner;

public class PriemTovara {
    public static void main(String[] args) {
//        Take take = new Take("иванов", "сент", "стол", 2, 500.23);
//        Take take1 = new Take("петров", "сент", "стул", 10, 30.24);
//        Take take2 = new Take("сидоров", "сент", "диван", 5, 670.50);
        Tovar tele = new Tovar("телевизор", "10 октября", "черный", 5, 12000);

      Tovar[] tovary = new Tovar[10];
      Take[] takes = new Take[7];
      int i=0, j=0;

          Scanner scanner = new Scanner(System.in);
          System.out.println("Введите поступление товара:  ");
          String fio = scanner.nextLine();
          i=i+1;
        System.out.println("Введите дату:  ");
        String date = scanner.nextLine();
        System.out.println("Введите название товара:  ");
        String tova = scanner.nextLine();
        System.out.println("Введите колличество:  ");
        int coll = scanner.nextInt();
        System.out.println("Введите цену:  ");
        double summa = scanner.nextDouble();
        Take take = new Take(fio, date, tova, coll, summa);
        take.display();
        System.out.println(take.getInfo());

          tovary[j]=tele;

        System.out.println("принял "+take.fio+" дата "+take.date+" "+take.tova+" "+take.coll+" по цене "+take.summa);
        System.out.println(tovary[j].getInfo());
    }
}
