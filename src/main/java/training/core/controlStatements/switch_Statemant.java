package training.core.controlStatements;

import training.core.Day;

/**
 * @
 */
class switch_Statemant {

    public static void main(String[] args) {

        currentSeasonName(1);
        seasonNumberByName("Winter");
        amountOfDaysInMonth(6);
        whatYouThinkAbout(Day.FRIDAY);
        Day.MONDAY.shortName();
        System.out.println(Day.SUNDAY);
    }

    private static void whatYouThinkAbout(Day dayOfWeek) {
        System.out.println(dayOfWeek + " statistic: ");
        dayOfWeek.dayNumber();
        dayOfWeek.shortName();
        switch (dayOfWeek) {
            case MONDAY:
                System.out.println("Oh no!!!");
                break;
            case TUESDAY:
                System.out.println("It's better");
                break;
            case WEDNESDAY:
                System.out.println("In the week middle");
                break;
            case THURSDAY:
                System.out.println("Almost weekend");
                break;
            case FRIDAY:
                System.out.println("Yeah, today is my day");
                break;
            case SATURDAY:
                System.out.println("Party time!!!");
                break;
            case SUNDAY:
                System.out.println("Hangover killing me!");
        }
    }

    private static void amountOfDaysInMonth(int month) {
        //2 - 28
        //1,3,5,7,8,10,12  - 31
        //4,6,9,11  - 30
        switch (month) {
            case 2:
                System.out.println("28/29 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
            default:
                System.out.println("Are sure?");

        }
    }

    private static void seasonNumberByName(String season) {
        String partOfYear = season.toUpperCase();
        switch (partOfYear) {
            case "SPRING":
                System.out.println("No.: 1");
                break;
            case "SUMMER":
                System.out.println("No.: 2");
                break;
            case "AUTUMN":
                System.out.println("No.: 3");
                break;
            case "WINTER":
                System.out.println("No.: 4");
                break;
            default:
                System.out.println("I don't understand");

        }
    }

    private static void currentSeasonName(int seasonNumber) {
        switch (seasonNumber) {
            case 1:
                System.out.println("Spring");
                break;
            case 2:
                System.out.println("Summer");
                break;
            case 3:
                System.out.println("Autumn");
                break;
            case 4:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Not exist!!!");
        }
    }


}
