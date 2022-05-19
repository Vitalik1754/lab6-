package com.company;
import java.util.Scanner;
 class Arena {

   private double width;//ширина
   private double length;//довжина
   private double seats;// місця
   private double fans;//фанати


    public Arena(double width, double length, double seats, double fans) {
        this.width = width;
        this.length = length;

        this.seats = seats;
        this.fans = fans;
    }

    void startfans() {
        Scanner num = new Scanner(System.in);
        int a = 10000;
        int q = 10000;
        int d;
        System.out.println("Скільки фанатів прийшло на матч?  ");
        q = num.nextInt();
        d = a - q;
        System.out.println("Залишилось вільних місць " + d);


    }

    int startseats(int length, int width) {
        int startseats = length * width;
        return startseats;
    }

    double startseats() {// перевизначиний метод
        double startseats = length * width;
        return startseats;
    }

    static void court (int width, int length, int square){
        System.out.println("Розміри баскетбольно майданчика : Довжина  " + length + " ,Ширина  " + width + " ,Площа  "  + square  );
    }
    Arena(){
         width = 0;
         length = 0;
    }
    Arena(int goodd){
        width = length  = goodd;

    }
    double volume(){
      return  width * length;
    }

     public double getWidth() {
         return width;
     }

     public void setWidth(double width) {
         this.width = width;
     }

     public double getLength() {
         return length;
     }

     public void setLength(double length) {
         this.length = length;
     }

     public double getSeats() {
         return seats;
     }

     public void setSeats(double seats) {
         this.seats = seats;
     }

     public double getFans() {
         return fans;
     }

     public void setFans(double fans) {
         this.fans = fans;
     }

 void q(){
        System.out.println("Арена відкрита ");
        System.out.println("Параметри арени");
 }
     }


