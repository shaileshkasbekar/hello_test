import java.util.Scanner;

public class Practical_5 {

    public static int f1(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }
        return a * f1(a - 1);
    }

    public static int f2(int a) {
        int b = 1;
        for (int c = a; c > 0; c--) {
            b=b*c;
        }
        return b;
    }

    public static int f3(int a) {
        int b = 1, c = 1;
        while (c <= a) {
            b=b*c;
            c++;
        }
        return b;
    }

    public static int s2(int[] x) {
        int y = 0;
        for (int z = 0; z < x.length; z++) {
            y=y+x[z];
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int x = sc.nextInt();
        System.out.println(f1(x));

        System.out.println("Enter number:");
        int y = sc.nextInt();
        System.out.println(f2(y));

        System.out.println("Enter number:");
        int z = sc.nextInt();
        System.out.println(f3(z));

        int[] arr2 = {2, 4, 6, 8};
        System.out.println(s2(arr2));

        sc.close();
    }
}

