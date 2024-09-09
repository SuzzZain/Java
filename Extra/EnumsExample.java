package Extra;

// An enum (short for "enumeration") is a special data type in Java that defines a collection of constants. Each constant is an instance of the enum class.

// Enum constants are implicitly public static final.
// Enum types are type-safe and can be used in switch statements.
// Enums can have constructors, methods, and instance variables.

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumsExample {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        if (today == Day.MONDAY) {
            System.out.println("Today is Monday");
        }

        // Using switch with enums
        switch (today) {
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday!");
                break;
            default:
                System.out.println("Another day!");
                break;
        }
    }  
}


// Enums can have fields, constructors, and methods, just like normal classes. Each constant is an object of the enum.
// Enums can have custom fields, constructors, and methods.
// Enum constructors are private by default.
// Useful for representing a fixed set of constants with additional properties.


// enum Day {
//     MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

//     private final int dayNumber;

//     // Constructor
//     Day(int dayNumber) {
//         this.dayNumber = dayNumber;
//     }

//     public int getDayNumber() {
//         return dayNumber;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Day day = Day.FRIDAY;
//         System.out.println(day + " is the " + day.getDayNumber() + "th day of the week.");  // Output: FRIDAY is the 5th day of the week.
//     }
// }
