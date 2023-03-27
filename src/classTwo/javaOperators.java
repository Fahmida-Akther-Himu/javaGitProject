package classTwo;

public class javaOperators {
    public static void main(String[] args) {
        //Unary Operator: expr++ expr-- ++expr --expr
        int count = 1847;
        System.out.println("Unary operator - ");
        System.out.println("count++: " + count++);      //1847
        System.out.println("count--: " + count--);      //1848
        System.out.println("count: " + count);          //1847

        System.out.println("++count: " + ++count);      //1848
        System.out.println("count: " + count);          //1848
        System.out.println("--count: " + --count);      //1847
        System.out.println("count: " + count + '\n');   //1847

        double cgpa = 4.11;
        System.out.println("++cgpa: " + ++cgpa);        //5.11
        System.out.println("cgpa++: " + cgpa++);        //5.11
        System.out.println("cgpa: " + cgpa);            //6.11

        System.out.println("--cgpa: " + --cgpa);        //5.11
        System.out.println("cgpa--: " + cgpa--);        //5.11
        System.out.println("cgpa: " + cgpa);            //4.11

        //Arithmetic Operator: * / % + -
        System.out.println('\n' + "Arithmetic Operator - ");
        int science = 95, math = 98, sum = 0;
        sum = science + math;
        System.out.println("Summation is : " + sum);

        int english = 98, bgs = 90, sub = 0;
        sub = english - bgs;
        System.out.println("Subtraction is: " + sub);

        int multiplication1 = 8, multiplication2 = 5, multiplication = 0;
        multiplication = multiplication1 * multiplication2;
        System.out.println("Multiplication is: " + multiplication);

        int div1 = 60, div2 = 5, division = 0;
        division = div1 / div2;
        System.out.println("Division is: " + division);

        int mod1 = 102, mod2 = 25, modulus = 0;
        modulus = mod1 % mod2;
        System.out.println("Modulus is: " + modulus);

        //Ternary Operator and : ? : (int min=(a<b)?a:b; )
        //science = 95, math = 98,
        System.out.println('\n' + "Ternary Operator - ");
        int maxNumber = (science > math) ? science : math;
        System.out.println("Maximum number is: " + maxNumber);
        int minNumber = (science < math) ? science : math;
        System.out.println("Minimum number is: " + minNumber);

        //Relational Operator: < > <= >= instanceof == !=
        //science = 95, math = 98,
        System.out.println('\n' + "Relational Operator - ");
        System.out.println("science>math: " + (science > math));
        System.out.println("math>science: " + (math > science));
        System.out.println("math>=science: " + (math >= science));
        System.out.println("science<=math: " + (science <= math));
        System.out.println("science==math: " + (science == math));
        System.out.println("science!=math: " + (science != math));

        //Logical Operator: && ||
        //science = 95, math = 98
        System.out.println('\n' + "Logical Operator - ");
        System.out.println((science > math) && (science < math));
        System.out.println((science > math) || (science < math));
        System.out.println((science < math) || (science <= math));
        System.out.println((science != math) && (science < math));
        System.out.println((science != math) && (science == math));

        //Assignment Operator: = += -= *= /= %=
        System.out.println('\n' + "Assignment Operator - ");
        int a = 200, b = 30;
        a += 10;
        System.out.println("Addition = " + a);

        b -= 5;
        System.out.println("Subtraction = " + b);

        b *= 4;
        System.out.println("Multiplication = " + b);

        a /= 5;
        System.out.println("Division = " + a);

        a %= 5;
        System.out.println("Modulus = " + a);

        a = 2;
        System.out.println("Equal = " + a);
    }
}
