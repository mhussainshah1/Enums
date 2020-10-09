package oop;

public class Main {
    public static void main(String[] args) {
        Day d = Day.TUESDAY;
        Day d1 = Day.valueOf("TUESDAY");
//        d1 = Day.valueOf("tuesday");

        System.out.println(d == d1);
        System.out.println(d.equals(d1));
        System.out.println(Day.SUNDAY);
        System.out.println(d.toString());

        for (Day day: Day.values() ) {
            System.out.println(day.name() + " " + day.ordinal());
        }

//        if (Day.THURSDAY == 4){
//
//        }
        d.printTemperature();
        Day.SUNDAY.printTemperature();

        switch (d){
            case SUNDAY:
                System.out.println("Go to beach");
                break;
            case MONDAY:
                System.out.println("Go back to work");
                break;
            case TUESDAY://Error- Day.TUESDAY: , 2
                System.out.println("I am at work");
                break;
            default:
                System.out.println("Are you at work?");
        }
    }
}