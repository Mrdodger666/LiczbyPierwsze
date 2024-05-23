import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MainTest1 {

    @org.junit.jupiter.api.Test
    void Liczbajestpierwsza() {

        int x = 47;

        boolean wynik = Main.Jestpierwsza(x);

        Assertions.assertEquals(true, wynik);
    }

    @org.junit.jupiter.api.Test
    void Sumacyfrbinarnych() {
    int x = 32;

    int wynik = Main.Sumacyfrbinarnych(x);

    Assertions.assertTrue(wynik==1);
    }

    @org.junit.jupiter.api.Test
    void Sumacyfr() {
        int x = 65;

        int wynik = Main.Sumacyfr(x);
        Assertions.assertTrue(wynik==11);
    }
}