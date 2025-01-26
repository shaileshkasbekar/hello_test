public class Practical_6 {
    public static void pattern3() {
        int n = 5; 
        int i = 1; 

        while (i <= n) { 
            int j = 1; 

            while (j <= 5) { 
                if ((i == 1 && j == 3) ||  
                    (i == 2 && (j >= 2 && j <= 4)) ||  
                    (i == 3) ||  
                    (i == 4 && (j >= 2 && j <= 4)) ||  
                    (i == 5 && j == 3)) {  
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
                j++;
            }

            System.out.println(); 
            i++;
        }
    }

    public static void pattern2() {
        int n = 5; 

        for (int i = 1; i <= n; i++) {      
            for (int j = 1; j <= n; j++) {
                if (i == 1) { 
                    if (j == 3) {
                        System.out.print("+");
                    } else {
                        System.out.print(" ");
                    }
                } else if (i == 2) { 
                    if (j == 2 || j == 4) {
                        System.out.print("+");
                    } else {
                        System.out.print(" ");
                    }
                } else if (i == 3) { 
                    if (j == 1 || j == 3 || j == 5) {
                        System.out.print("+");
                    } else {
                        System.out.print(" ");
                    }
                } else if (i == 4) { 
                    if (j == 2 || j == 4) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (i == 5) { 
                    if (j == 3) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(); 
        }
    }
    public static void pattern1() {
        int n = 4;
        int i = 1;
        while (i <= n) {
            int j = 2 * i - 1;
            while (j > 0) {
                if (i % 2 == 0 && j % 2 == 1) {
                    System.out.print("+");
                } else if (i % 2 == 0 && j % 2 == 0) {
                    System.out.print("*");
                } else if (i % 2 == 1 && j % 2 == 1) {
                    System.out.print("*");
                } else if (i % 2 == 1 && j % 2 == 0) {
                    System.out.print("+");
                }
                j--;
            }
            System.out.println("");
            i++;
        }
    }
    public static void main(String[] args) {
        System.out.println("Pattern 3:");
        pattern3();

        System.out.println("\nPattern 2:");
        pattern2();

        System.out.println("\nPattern 1:");
        pattern1();
    }
}
