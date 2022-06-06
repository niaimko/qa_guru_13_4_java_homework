package guru.qa;

public class JavaHomework{

    public static void main(String[] args) {

        // математические операторы: + - / * %

        // +
        byte b1 = 100;
        b1 += 27;
        System.out.println(b1);

        // -
        short s1 = 555;
        s1 -= 55;
        System.out.println(s1);

        // /
        long l1 = 333;
        l1 /= 3;
        System.out.println(l1);

        // *
        double d1 = 0.1;
        d1 *= 2;
        System.out.println(d1);

        // %
        int i1 = 100;
        i1 %= 9;
        System.out.println(i1);

        // логические операторы > < >= <= == != && ||

        int i2 = 100;
        int i3 = 100;
        int i4 = 101;

        // == равно, выведет true т.к. 100 == 100
        System.out.println(i2 == i3);

        // > больше, выведет false т.к. 100 < 101
        System.out.println(i2 > i4);

        // < меньше, выведет true т.к. 100 < 101
        System.out.println(i2 < i4);

        // >= больше или равно, выведет false т.к. 100 < 101
        System.out.println(i2 >= i4);

        // <= меньше или равно, выведет true т.к. 100 < 101
        System.out.println(i2 <= i4);

        // != не равно, выведет false т.к. 100 = 100
        System.out.println(i2 != i3);

        // выведет true т.к. 100 != 101 и 100 < 101
        System.out.println((i2 != i4) && (i3 < i4));

        // выведет true т.к. 100 < 101, то есть правый операнд истинный
        System.out.println((i2 != i3) || (i3 < i4));

        // операции над разными типами данных

        // float * double
        float  f1 = 0.1f;
        double d2 = 10;

        double d3 = f1 * d2;
        System.out.println(d3);

        // int * long
        int  i5 = 10;
        long l2 = 10;

        long l3 = i5 * l2;
        System.out.println(l3);

        // переполнение в min сторону на примере int, диапазон от -2147483648 до 2147483647
        int i6 = 2147483647;
        i6 += 1;
        System.out.println(i6);

        // переполнение в max сторону на примере byte, диапазон от -128 до 127
        byte b2 = -127;
        b2 -= 2;
        System.out.println(b2);

    }

}
