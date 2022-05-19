package com.company;

public class Main {

    public static void main(String[] args) {

        Arena stadium = new Arena(80,160,10000,0);
        coach petro = new coach(88,188,26,6,1);
        player man = new player(98,198,39,100);
        stadium.setWidth(81);stadium.setLength(161);stadium.setSeats(10000);stadium.setFans(0);
        petro.setWeight(89);petro.setHeight(189);petro.setAge(27);petro.setPlayers(5);petro.setLevel(1);
        man.setWeight(99);man.setHeight(199);man.setAge(38);man.setEnergy(100);
 ///////////////////////////////////////////////////////////////////////////////////
        stadium.q();
        System.out.println("Арена: " + " Ширина; " + stadium.getWidth() + " , Довжина; " + stadium.getLength() +   " , Місць для сидіння вільних "+ stadium.getSeats());
        System.out.println("Площа поля " + stadium.startseats(160,80));
        System.out.println("Площа поля 2 "+stadium.startseats());//перевизначений метод
        stadium.startfans();
        System.out.println();
        Arena.court(15,28,420);
        Arena fnsvjn = new Arena(80,160,10000,0);
        Arena dsc = new Arena();
        Arena SCA = new Arena(17);
        System.out.println(fnsvjn.volume());
        System.out.println(dsc.volume());
        System.out.println(SCA.volume());


////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Гравець: " + " Вага; " + man.getWeight() + " , Ріст; " + man.getHeight() + " , Вік; " + man.getAge() + ", Eнергія " + man.getEnergy() + "%");
        petro.startplayers();
        man.startenergy();
        man.indexx();
         man.indexx(198,98);
        System.out.println();
        player.team(12,5);

//////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Тренер: " + " Вага; " + petro.getWeight() + " , Ріст; " + petro.getHeight() + " , Вік; " + petro.getAge() + " , Навики  тренера " + petro.getLevel());
        petro.startplayers();
        System.out.println();
        man.startenergy();
        petro.indexxx();
        petro.indexxx(188,88);
        coach.training(10,4);

    }


}
