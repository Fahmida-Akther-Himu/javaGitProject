package decisionMakingStatements;

public class StatementsOfLoop {
    public static void main(String[] args) {
        //for loop
        int summation = 0;
        int subtraction = 0;
        for (int a = 5; a < 10; a++) {
            summation = summation + a;
            System.out.println("Total count will be : " + summation + "\n");
        }
        for (int a = 11; a >= 10; a--) {
            subtraction -= a;
            System.out.println("Total count will be : " + subtraction + "\n");
        }

        //for each
        int nums[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int x : nums) {
            System.out.println(x + " ");
            sum += x;
        }
        System.out.println();
        System.out.println("Summation : " + sum);
        System.out.println();

        String phone[] = {"Apple", "Samsung", "Nokia"};
        for (String i : phone) {
            System.out.println(i);
        }

        //while loop
        int x = 2;
        while (x < 3) {
            int a = 4, b = 2, c = 0;
            c = a + b;
            System.out.println();
            System.out.println("Print c : " + c);
            x++;
        }

        //do while
        int y = 2;
        do{
            int a = 1, b = 2, c = 0;
            c = a + b;
            System.out.println();
            System.out.println("Print c : " + c);
            y++;
        }
        while (y < 3);
    }
}
