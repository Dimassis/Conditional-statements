
public class Main {
    public static void main(String[] args) {
        // Task 1
        byte age = 17;
        if (age >= 17) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        // Task 2
        System.out.println("");
        short temperature = 25;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + ", можно идти без шапки");
        }
        // Task 3
        System.out.println("");
        short speed = 25;
        if (speed >= 60) {
            System.out.println("Если скорость "+ speed +", то придется заплатить штраф ");
        } else {
            System.out.println("Если скорость "+ speed +", то можно ездить спокойно ");
        }

        // Task 4
        System.out.println("");
        byte ageHuman = 10;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека "+ ageHuman +", то нужно ходить в детский сад ");
        } else if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println("Если возраст человека "+ ageHuman +", то нужно ходить в школу ");
        } else if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека "+ ageHuman +", то нужно ходить в университет ");
        } else {
            System.out.println("Если возраст человека "+ ageHuman +", то нужно ходить в работу ");
        }

        // Task 5
        System.out.println("");
        byte ageLimit = 15;
        if (ageLimit < 5) {
            System.out.println("Если возраст ребенка равен "+ ageLimit +", нельзя кататься на аттракционе ");
        } else if (ageLimit >= 5 && ageLimit < 14) {
            System.out.println("Если возраст ребенка равен "+ ageLimit +", можно кататься на аттракционе в сопровождении ");
        } else {
            System.out.println("Если возраст ребенка равен "+ ageLimit +", без сопровождения взрослого ");
        }

        // Task 6
        System.out.println("");
        short seats = 102;
        if (seats < 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (seats >= 60 && seats < 102) {
            System.out.println("В вагоне есть сидячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }

        // Task 7
        System.out.println("");
        int one = 6;
        int two = 3;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше");
        } else if (two > one && two > three){
            System.out.println("Число " + two + " больше");
        } else if (three > one && three > two){
            System.out.println("Число " + three + " больше");
        }
        else {
            System.out.println("Нет большего числа");
        }
    }
}