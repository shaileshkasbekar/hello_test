import java.util.*;

class Practical_10 {
    public static String gridPrinting(int size, int length) {
        String[][] elements = createElement(size, length);
        int layout = 2 * size + 1;
        StringBuilder pattern = new StringBuilder();

        for (int i = 0; i < layout; i++) {
            for (int j = 0; j < layout; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        pattern.append("+");
                    } else {
                        pattern.append("-");
                    }
                } else {
                    if (j % 2 == 0) {
                        pattern.append("|");
                    } else {
                        int row = (i - 1) / 2;
                        int col = (j - 1) / 2;
                        pattern.append(elements[row][col]);
                    }
                }
            }
            pattern.append("\n");
        }
        return pattern.toString();
    }

    public static String[][] createElement(int size, int length) {
        String[][] elements = new String[size][size];
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            numbers.add(i);
        }

        for (int i = 0; i < size; i++) {
            Collections.shuffle(numbers);
            for (int j = 0; j < size; j++) {
                if (Math.random() < 0.5) {  // 50% chance to leave a blank space
                    elements[i][j] = String.format("%" + length + "s", "");
                } else {
                    elements[i][j] = String.format("%" + length + "s", numbers.get(j));
                }
            }
        }
        return elements;
    }

    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        if (size <= 0) {
            System.out.print("Enter a valid option");
        } else {
            int length = ("" + size).length();
            System.out.println(gridPrinting(size, length));
        }
    }
}
