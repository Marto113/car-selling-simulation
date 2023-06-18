package Helper;

public class Determiner {

    public static int determineType(String type) {
        switch (type) {
            case "Coupe":
                return 1;
            case "Truck":
                return 2;
            case "SUV":
                return 3;
            case "Combi":
                return 4;
            case "Sedan":
                return 5;
            case "Hatchback":
                return 6;
        }
        
        return -1;
    }

    public static int determineCondition(String Condition) {
        switch (Condition) {
            case "Excellent":
                return 1;
            case "Good":
                return 2;
            case "Bad":
                return 3;
            case "Scrap":
                return 4;
        }

        return -1;
    }
}
