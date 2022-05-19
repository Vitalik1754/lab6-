package com.company;

import java.util.Scanner;
 class player {

   private double weight; // вага
   private double height; // висота
   private int age; // вік
   private int energy; // енергія
    Scanner i = new Scanner(System.in);

    public player(double weight, double height, int age, int energy) {
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.energy = energy;

    }

    void startenergy() {
        int y = (int) (1);

        System.out.println("Матч завершено");
        energy -= 21;
        System.out.println("Залишилось енергії у гравця  " + energy + "%");
    }

    void indexx() {
        double index;    // індекс маси тіла
        index = weight / (height * height);
        System.out.println("Індекс маси тіла гравця : " + index);

    }

    double indexx(double height, double weight) { //превизначений метод
        double index;
        index = weight / (height * height);
        System.out.println("Індекс маси тіла гравця 2: " + index);
        return index;
    }
    static void team(int total,int who_play){
        System.out.println("Склад команди : Всього гравців " + total + " .Гравців на полі під час матчу  " + who_play);
    }

     public double getWeight() {
         return weight;
     }

     public void setWeight(double weight) {
         this.weight = weight;
     }

     public double getHeight() {
         return height;
     }

     public void setHeight(double height) {
         this.height = height;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public int getEnergy() {
         return energy;
     }

     public void setEnergy(int energy) {
         this.energy = energy;
     }
 }



