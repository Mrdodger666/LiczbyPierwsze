// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        int[][] ranges = {{2, 1000}, {100, 10000}, {1000, 100000}};


        for (int[] range : ranges) {
            int count = liczsuperbcyfrywzakresie(range[0], range[1]);
            System.out.println("Liczba liczb super B pierwszych w przedziale <" + range[0] + "," + range[1] + ">: " + count);
        }
        int start = 100;
        int end = 10000;
        int count = liczcyfryzsumaliczbpierwszychwzakresie(start, end);
        int sum = Sumasuperbcyfrwzakresie(start, end);
        System.out.println("Suma wszystkich liczb „super B pierwszych” z przedziału <" + start + "," + end + ">: " + sum);
        System.out.println("Liczba liczb w przedziale <" + start + "," + end + ">, których suma cyfr jest liczbą pierwszą: " + count);


    }

    // Funkcja zlicza liczby super B pierwsze w danym przedziale
    public static int liczsuperbcyfrywzakresie(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (Jestsuperbpierwsza(i)) {
                count++;
            }
        }
        return count;
    }

    // Sprawdza, czy liczba jest super pierwsza
    public static boolean Jestsuperpierwsza(int number) {
        return Jestpierwsza(number) && Jestpierwsza(Sumacyfr(number));
    }

    // Sprawdza, czy liczba jest super B pierwsza
    public static boolean Jestsuperbpierwsza(int number) {
        return Jestsuperpierwsza(number) && Jestpierwsza(Sumacyfrbinarnych(number));
    }

    // Sprawdza, czy liczba jest pierwsza
    public static boolean Jestpierwsza(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int liczcyfryzsumaliczbpierwszychwzakresie(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (Jestpierwsza(Sumacyfr(i))) {
                count++;
            }
        }
        return count;
    }


    // Oblicza sumę cyfr liczby
    public static int Sumacyfr(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    // Oblicza sumę cyfr w zapisie binarnym liczby
    public static int Sumacyfrbinarnych(int number) {
        int sum = 0;
        String binaryString = Integer.toBinaryString(number);
        for (char digit : binaryString.toCharArray()) {
            if (digit == '1') {
                sum++;
            }
        }
        return sum;
    }


    // Funkcja zlicza sumę liczb super B pierwszych w danym przedziale
    public static int Sumasuperbcyfrwzakresie(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (Jestsuperbpierwsza(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
