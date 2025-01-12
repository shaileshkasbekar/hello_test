import java.util.Scanner;
public class Practical_4 {
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);
            if (bit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    public static String binaryToOctal(String binary) {
        int decimal = binaryToDecimal(binary);
        return decimalToOctal(decimal);
    }

    public static String binaryToHexadecimal(String binary) {
        int decimal = binaryToDecimal(binary);
        return decimalToHexadecimal(decimal);
    }

    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        if (binary.length() > 0) {
            return binary.toString();
        } else {
            return "0";
        }
    }

    public static String decimalToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            octal.insert(0, decimal % 8);
            decimal /= 8;
        }
        if (octal.length() > 0) {
            return octal.toString();
        } else {
            return "0";
        }
    }

    public static String decimalToHexadecimal(int decimal) {
        StringBuilder hexadecimal = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 16;
            if (remainder < 10) {
                hexadecimal.insert(0, (char) (remainder + '0'));
            } else {
                hexadecimal.insert(0, (char) (remainder - 10 + 'A'));
            }
            decimal /= 16;
        }
        if (hexadecimal.length() > 0) {
            return hexadecimal.toString();
        } else {
            return "0";
        }
    }

    public static int octalToDecimal(String octal) {
        int decimal = 0;
        for (int i = 0; i < octal.length(); i++) {
            int digit = octal.charAt(octal.length() - 1 - i) - '0';
            decimal += digit * Math.pow(8, i);
        }
        return decimal;
    }

    public static String octalToBinary(String octal) {
        int decimal = octalToDecimal(octal);
        return decimalToBinary(decimal);
    }

    public static String octalToHexadecimal(String octal) {
        int decimal = octalToDecimal(octal);
        return decimalToHexadecimal(decimal);
    }

    public static int hexadecimalToDecimal(String hexadecimal) {
        int decimal = 0;
        for (int i = 0; i < hexadecimal.length(); i++) {
            char ch = hexadecimal.charAt(hexadecimal.length() - 1 - i);
            int value;
            if (Character.isDigit(ch)) {
                value = ch - '0';
            } else {
                value = ch - 'A' + 10;
            }
            decimal += value * Math.pow(16, i);
        }
        return decimal;
    }

    public static String hexadecimalToBinary(String hexadecimal) {
        int decimal = hexadecimalToDecimal(hexadecimal);
        return decimalToBinary(decimal);
    }

    public static String hexadecimalToOctal(String hexadecimal) {
        int decimal = hexadecimalToDecimal(hexadecimal);
        return decimalToOctal(decimal);
    }

    public static int getByte(int num) {
        while (num > 127 || num < -128) {
            if (num > 127) {
                num -= 256;
            } else if (num < -128) {
                num += 256;
            }
        }
        return num;
    }

    public static int getShort(int num) {
        while (num > 32767 || num < -32768) {
            if (num > 32767) {
                num -= 65536;
            } else if (num < -32768) {
                num += 65536;
            }
        }
        return num;
    }

    public static int getNumber(int num, String type) {
        switch (type.toLowerCase()) {
            case "byte":
                return getByte(num);
            case "short":
                return getShort(num);
            case "int":
                return num;
            default:
                System.out.println("Invalid type specified. Use 'byte', 'short', or 'int'.");
                return num;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input number:");
        String input = sc.next();
        System.out.println("Enter the input type ('b' for binary, 'd' for decimal, 'o' for octal, 'h' for hexadecimal):");
        String inputType = sc.next();
        System.out.println("Enter the target type ('b' for binary, 'd' for decimal, 'o' for octal, 'h' for hexadecimal):");
        String targetType = sc.next();
        String result = "";

        if (inputType.equalsIgnoreCase("b")) {
            if (targetType.equalsIgnoreCase("d")) {
                result = String.valueOf(binaryToDecimal(input));
            } else if (targetType.equalsIgnoreCase("o")) {
                result = binaryToOctal(input);
            } else if (targetType.equalsIgnoreCase("h")) {
                result = binaryToHexadecimal(input);
            } else {
                result = input;
            }
        } else if (inputType.equalsIgnoreCase("d")) {
            int decimal = Integer.parseInt(input);
            if (targetType.equalsIgnoreCase("b")) {
                result = decimalToBinary(decimal);
            } else if (targetType.equalsIgnoreCase("o")) {
                result = decimalToOctal(decimal);
            } else if (targetType.equalsIgnoreCase("h")) {
                result = decimalToHexadecimal(decimal);
            } else {
                result = input;
            }
        } else if (inputType.equalsIgnoreCase("o")) {
            if (targetType.equalsIgnoreCase("b")) {
                result = octalToBinary(input);
            } else if (targetType.equalsIgnoreCase("d")) {
                result = String.valueOf(octalToDecimal(input));
            } else if (targetType.equalsIgnoreCase("h")) {
                result = octalToHexadecimal(input);
            } else {
                result = input;
            }
        } else if (inputType.equalsIgnoreCase("h")) {
            if (targetType.equalsIgnoreCase("b")) {
                result = hexadecimalToBinary(input);
            } else if (targetType.equalsIgnoreCase("d")) {
                result = String.valueOf(hexadecimalToDecimal(input));
            } else if (targetType.equalsIgnoreCase("o")) {
                result = hexadecimalToOctal(input);
            } else {
                result = input;
            }
        } else {
            result = "Invalid input type!";
        }
        System.out.println("The converted value is: " + result);

        System.out.println("Enter a number for range adjustment:");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter type ('byte', 'short', or 'int'):");
        String type = sc.nextLine();
        int adjustedNum = getNumber(num, type);
        System.out.println("Adjusted number: " + adjustedNum);

        sc.close();
    }
}
