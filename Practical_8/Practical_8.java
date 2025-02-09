class Practical_8 {
    public static void design1(int n) {
        int mid = n / 2 + 1;
        drawUpperHalf(mid, 1);
        drawLowerHalf(mid - 1, mid);
        drawVerticalLine(n, 1);
    }

    private static void drawUpperHalf(int mid, int r) {
        if (r > mid) return;
        insertSpaces(mid - r);
        insertStars(2 * r - 1);
        System.out.println();
        drawUpperHalf(mid, r + 1);
    }

    private static void drawLowerHalf(int r, int mid) {
        if (r == 0) return;
        insertSpaces(mid - r);
        insertStars(2 * r - 1);
        System.out.println();
        drawLowerHalf(r - 1, mid);
    }

    private static void drawVerticalLine(int n, int r) {
        if (r > n) return;
        insertSpaces(2);
        System.out.println("+");
        drawVerticalLine(n, r + 1);
    }

    public static void design2(int n) {
        drawAscending(1, n + 1);
        drawDescending(n, 1);
    }

    private static void drawAscending(int r, int n) {
        if (r > n) return;
        insertStars(r);
        System.out.println();
        drawAscending(r + 1, n);
    }

    private static void drawDescending(int r, int min) {
        if (r < min) return;
        insertStars(r);
        System.out.println();
        drawDescending(r - 1, min);
    }

    public static void design3(int n) {
        drawRightTriangle(1, n + 1);
        drawMiddleLine(n + 1);
        drawSlashTriangle(1, n + 1);
    }

    private static void drawRightTriangle(int r, int n) {
        if (r >= n) return;
        insertSpaces(n - r);
        insertStars(r);
        System.out.println();
        drawRightTriangle(r + 1, n);
    }

    private static void drawMiddleLine(int n) {
        for (int c = 1; c <= n; c++) {
            System.out.print("+");
        }
        System.out.println();
    }

    private static void drawSlashTriangle(int r, int n) {
        if (r > n) return;
        insertSpaces(r);
        insertSlashes(n - r);
        System.out.println();
        drawSlashTriangle(r + 1, n);
    }

    private static void insertSpaces(int count) {
        if (count == 0) return;
        System.out.print(" ");
        insertSpaces(count - 1);
    }

    private static void insertStars(int count) {
        if (count == 0) return;
        System.out.print("*");
        insertStars(count - 1);
    }

    private static void insertSlashes(int count) {
        if (count == 0) return;
        System.out.print("/");
        insertSlashes(count - 1);
    }

    public static void main(String[] args) {
        design1(5);
        System.out.println();
        design2(3);
        System.out.println();
        design3(3);
    }
}
