package com.sclad;

//import java.time.LocalDate;

public class Take {
    String fio;
    String date;
    String tova;
    int coll;
    double summa;

    public Take(String fio, String date, String tova, int coll, double summa) {
        this.fio = fio;
        this.date = date;
        this.tova = tova;
        this.coll = coll;
        this.summa = summa;
    }
    public void display(){System.out.println("fio"+fio);}

    public String getInfo() {
        return fio+" "+date+" "+tova+" "+coll+" "+summa;
    }
}



