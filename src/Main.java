import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Упр.№ 1");
        short age = 24;
        if (age >= 18) {System.out.println("Если возраст человека равен " + age +
                ", то он совершеннолетний");}
        else {System.out.println("Если возраст человека равен " + age +
                ", то он не достиг совершеннолетия, нужно немного подождать.");}
        short age1 = 12;
        if (age1 >= 18) {System.out.println("Если возраст человека равен " + age1 +
                ", то он совершеннолетний");}
        else {System.out.println("Если возраст человека равен " + age1 +
                ", то он не достиг совершеннолетия, нужно немного подождать.");}

        System.out.println();
        System.out.println("Упр.№ 2");
        int temperature = 25;
        if (temperature < 5)
            System.out.println("На улице холодно, нужно надеть шапку.");
        if (!(temperature < 5)) {
            System.out.println("Сегодня тепло, можно идти без шапки.");}

        System.out.println();
        System.out.println("Упр.№ 3");
        int speedCar = 57;
        if (speedCar > 60) {
            System.out.println("Если скорость " +speedCar+ ", то придется заплатить штраф.");}
        if (speedCar <= 60) {
            System.out.println("Если скорость " +speedCar+ ", то можно ездить спокойно.");}

        System.out.println();
        System.out.println("Упр. № 4");
        int age2 = 20;
        if (age2 >= 2 && age2 <= 6)
        {System.out.println("Если возраст человека равен " +age2+ ", то ему нужно ходить в детский сад.");}
        else if (age2 >= 7 && age2 <= 17)
        {System.out.println("Если возраст человека равен " +age2+ ", то ему нужно ходить в школу.");}
        else if (age2 >= 18 && age2 <= 24)
        {System.out.println("Если возраст человека равен " +age2+ ", то ему нужно ходить в университет.");}

        System.out.println();
        System.out.println("Упр. № 5");
        int childAge = 11;
        boolean canNotRide = childAge < 5;
        boolean canRideWithParents = childAge >= 5 && childAge < 14;
        boolean canRideAlone = childAge >= 14;
        if (canNotRide) {System.out.println("Если возраст ребенка равен " +childAge+
                ", то ему нельзя кататься на аттракционе.");}
        else if (canRideWithParents) {
            System.out.println("Если возраст ребенка равен " +childAge+
                    ", то ему можно кататься на аттракционе в сопровождении родителей.");}
        else if (canRideAlone) {System.out.println("Если возраст ребенка равен " +childAge+
                ", то ему можно кататься на аттракционе без сопровождения взрослого.");}

        System.out.println();
        System.out.println("Упр. № 6");
        short numberSeatedPassengers = 60;
        short numberPassengers = 101;
        short numberStandingPass = (short) (numberPassengers - numberSeatedPassengers);
        short seats = 60;
        short totalCapacity = 102;
        if (numberPassengers  < totalCapacity) {
            if (numberSeatedPassengers < seats) {
                System.out.println("В вагоне есть " +(seats - numberSeatedPassengers)+ " сидячих мест и "
                        +(totalCapacity - seats - numberStandingPass)+ " стоячих мест");}
            else {System.out.println("В вагоне осталось " +(totalCapacity - seats - numberStandingPass)+ " стоячих мест");}
        } else {System.out.println("В вагоне нет свободных мест");}

        System.out.println();
        System.out.println("Упр. № 7");
        int one = 456;
        int two = 100;
        int three = 7;
        if (one > two) {if (one > three) {
            System.out.println("Число " +one+ " большее из трёх чисел.");}
        else {System.out.println("Число " +three+ " большее из трёх чисел.");}
        }
        else if (two > three) {System.out.println("Число " +two+ " большее из трёх чисел.");}
        else {System.out.println("Число " +three+ " большее из трёх чисел.");}

    }
}
