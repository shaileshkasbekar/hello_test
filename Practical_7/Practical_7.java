public class Practical_7 {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;

        while (i <= n) {
            int j = 1;
            while (j <= n + 30) { 
                if ((i == 1 && j > 1 && j <= n) || 
                    (i == 3 && j > 1 && j < n) || 
                    (i == n && j < n) || 
                    (i == 2 && j == 1) || 
                    (i == 4 && j == n)) {
                    System.out.print("*");
                } 
                else if (j == n + 2 || j == n + 4 || (i == 3 && j == n + 3)) {
                    System.out.print("*");
                } 
                else if (j == n + 6 || j == n + 8 || (i == 1 && j > n + 6 && j < n + 8) || (i == 3 && j > n + 6 && j < n + 8)) {
                    System.out.print("*");
                }
                else if (j == n + 10 || (i == 1 && j >= n + 10 && j <= n + 10) || (i == n && j >= n + 10 && j <= n + 10)) {
                    System.out.print("*");
                }
                else if (j == n + 12 || (i == n && j >= n + 12 && j <= n + 14)) {
                    System.out.print("*");
                }
                else if ((i == 1 && j >= n + 16 && j <= n + 20) || 
                         (i == 3 && j >= n + 16 && j <= n + 20) || 
                         (i == 5 && j >= n + 16 && j <= n + 20) || 
                         (i == 2 && j == n + 16) || 
                         (i == 4 && j == n + 16)) {
                    System.out.print("*");
                }
                else if ((i == 1 && j >= n + 22 && j <= n + 25) || 
                         (i == 3 && j >= n + 22 && j <= n + 25) || 
                         (i == 2 && j == n + 22) || 
                         (i == 4 && j == n + 25) || 
                         (i == 5 && j >= n + 22 && j <= n + 25)) {
                    System.out.print("*");
                }
                else if (j == n + 27 || j == n + 29 || (i == 3 && j == n + 28)) {
                    System.out.print("*");
                } 

                else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
