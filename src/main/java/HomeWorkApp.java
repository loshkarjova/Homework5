public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

        boolean s = isInRange(5, 6);
        System.out.println(s);

        writeAddOrNegative(188);

        boolean negative = isNegative(-176);
        System.out.println(negative);

        getArray(new int[]{1, 2, 3, 4, 5, 6}, 3);

        boolean year = isLeapYear(1600);
        System.out.println(year);

    }

    public static void printThreeWords() {
        String[] fruits = {"Orange", "Banana", "Apple"};
        System.out.println("Test 1:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }

    public static void checkSumSign() {
        int a = 23;
        int b = 28;
        if (a + b >= 0) {
            System.out.println("\nTest 2:\n" + "a = " + a + "\n" + "b = " + b + "\nСума позитивна\n");
        } else {
            System.out.println("\nTest 2:\n" + "a = " + a + "\n" + "b = " + b + "\nСума негативна\n");
        }
    }

    public static void printColor() {
        int value = 5;
        if (value <= 0) {
            System.out.println("Test 3:\n" + "value = " + value + "\nЧервоний\n");
        } else if (value > 0 && value <= 100) {
            System.out.println("Test 3:\n" + "value = " + value + "\nЖовтий\n");
        } else {
            System.out.println("Test 3:\n" + "value = " + value + "Зелений\n");
        }
    }

    public static void compareNumbers() {
        int a = 253;
        int b = 189;
        if (a >= b) {
            System.out.println("Test 4:\n" + "a = " + a + "\nb = " + b + "\na >= b\n");
        } else {
            System.out.println("Test 4:\n" + "a = " + a + "\nb = " + b + "\n a < b\n");
        }
    }

    public static boolean isInRange(int a, int b) {
        int c = a + b;
        System.out.println("Test 5:");
        return c <= 20 && c >= 10;
    }

    public static void writeAddOrNegative(int a) {
        System.out.println("\nTest 6:");
        if (a >= 0) {
            System.out.println("a = " + a + "\nЧисло додатнє\n");
        } else {
            System.out.println("a = " + a + "\nЧисло від'ємне\n");
        }
    }

    public static boolean isNegative(int a) {
        System.out.println("Test 7:\n" + "a = " + a);
        return a < 0;
    }

    public static void getArray(int[] array, int a) {
        System.out.println("\nTest 8: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j]);
            }
            System.out.println();
        }
    }

    public static boolean isLeapYear(int year) {
        System.out.println("\nTest 9:");
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }
}
