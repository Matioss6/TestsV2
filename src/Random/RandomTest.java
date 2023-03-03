package Random;

public class RandomTest {



    public int castowanie(int a, int b) {
        return a * b;
    }

    public int sumaWithArgs(int arg0, int...args){

        int wynik = arg0;
        for (int i = 0; i < args.length; i++) {
            wynik+=args[i];
        }
        System.out.println(wynik);
        return wynik;

    }

}
