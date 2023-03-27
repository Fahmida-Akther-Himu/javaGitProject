package javaPackage;

public class UsePrimitiveDataTypes {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("Print integer : " + ++i + '\n');

        long l = 100;
        System.out.println((l > i) && (i != l));
        System.out.println("Print long: " + l);

        float f = 10.10f;
        System.out.println('\n' + "Print float: " + f + '\n');

        double d = 80.80;
        System.out.println(d != f);
        System.out.println("Print double: " + d);

        boolean b1 = true;
        System.out.println('\n' + "Print boolean: " + b1);
        boolean b2 = false;
        System.out.println("Print boolean: " + b2 + '\n');

        char ch = 'F';
        System.out.println("Print char: " + ch + '\n');

        byte by = 5;
        System.out.println("Print byte: " + by--);
        System.out.println("Print byte: " + by + '\n');

        short s = 10;
        System.out.println(by > s);
        System.out.println("Print short: " + s);
    }
}
