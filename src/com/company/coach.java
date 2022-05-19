package com.company;
import java.util.Scanner;
    class coach {
   private double weight; // вага
   private double height; // висота
   private int age; // вік
   private int players; // гравці
   private int level; // левел
   private int number = 2;
    Scanner q =  new Scanner(System.in);
    public coach(double weight, double height, int age, int players, int level) {
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.players = players;
        this.level = level;
    }

    void startplayers() {
        int w = (int) (0 * number+1);
        System.out.println("Проводиться два матчі і після кожного переможного навики  тренера збільшується і  енегрія гравця зменшується");
        System.out.println("Введіть число від 1 до "+number);
        int e = q.nextInt();
        if (e == w) {
            System.out.println("перемога");
            level += 1;
        } else if (e != w) {
            System.out.println("промах");
        }
        System.out.println("Навики тренера:"+level);

    }

    void indexxx() {
        double index;    // індекс маси тіла
        index = weight / (height * height);
        System.out.println("Індекс маси тіла тренера : " + index);

    }

    double indexxx(double height, double weight) { //превизначений метод
        double index;
        index = weight / (height * height);
        System.out.println("Індекс маси тіла тренера 2: " + index);
        return index;
    }
    static void training(int workout, int friction){
        System.out.println("Час тренерування: Розминка " + workout + "хв" +  " , Загальний час тренерування " + friction + " години" );
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

        public int getPlayers() {
            return players;
        }

        public void setPlayers(int players) {
            this.players = players;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }

