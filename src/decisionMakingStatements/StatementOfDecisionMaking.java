package decisionMakingStatements;

public class StatementOfDecisionMaking {
    public static void main(String[] args) {
        //Simple if statement
        String name = "Fahmida";
        int age = 25;
        if (name == "Fahmida") {
            //age++;
            System.out.println("Fahmida's age is : " + age);
            System.out.println("Value of age is now : " + age + "\n");
        }
        //if-else statement
        int february = 28;
        if (february >= 29) {
            System.out.println("This year is Leap Year." + "\n");
        } else {
            System.out.println("This year is not Leap Year." + "\n");
        }
        //if-else-if ladder
        int year = 2023;
        if (year != 2023) {
            System.out.println("This is not present year." + "\n");
        } else if (year > 2023) {
            System.out.println("Next year is 2024." + "\n");
        } else if (year == 2022) {
            System.out.println("Last year was 2022." + "\n");
        } else if (year == 2023) {
            System.out.println("Present year is 202." + "\n");
        } else {
            System.out.println("Year is not found" + "\n");
        }

        //Nested if-statement
        if (name == "Fahmida") {
            if (age != 25) {
                System.out.println("This is not Fahmida" + "\n");
            } else {
                System.out.println("This is Fahmida" + "\n");
            }
        } else {
            System.out.println("Not found anyone. " + "\n");
        }

    }

}
