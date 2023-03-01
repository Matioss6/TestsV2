import Enum.Length;
import Enum.Colour;
import Lambda.LambdaTest;
import Random.RandomTest;
import Rekurencja.Rekurencja;
import Sterowanko.Sterowanie;

import java.util.Arrays;

/**
 * Main method
 */
public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        //    main.lambaMain();
        //    main.randomMain();
        //    main.enumMain();
        //    main.rekurencjaMain();
            main.caseMain();


    }

    /* *************************   Lambda Tests   ********************************* */
    public void lambaMain() {
        LambdaTest lambdaTest = new LambdaTest();
        // lambdaTest.lambda1();
        // lambdaTest.lambda2();
        // lambdaTest.lambdaAsParam();
        // lambdaTest.lambdaAsParam2();

    }


    /* *************************   Random Tests   ********************************* */
    public void randomMain() {
        RandomTest randomTest = new RandomTest();
        double a;
        byte b;
        char c;
        a = randomTest.castowanie(4, 5);
        b = (byte) randomTest.castowanie(4, 5);
        c = (char) randomTest.castowanie(1, 3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


    /* *************************   Enum Tests   ********************************* */
    public void enumMain() {
//        Flower kwiatek1 =  new Flower(Colour.ZIELONY,Length.DLUGI);
//        Flower kwiatek2 =  new Flower(Colour.CZARNY,Length.KROTKI);
//        String a = "ZIELONY";
//        Colour b = Colour.valueOf(a);
//
//
//        System.out.println(Arrays.toString(Colour.values()));
//        System.out.println(Colour.ZIELONY.name().equals("ZIELONY"));
//        System.out.println(b);
//
//        System.out.println(kwiatek1);
//        System.out.println(kwiatek2);

        System.out.println(Arrays.toString(Length.values()));

        for (Length length : Length.values()) {
            System.out.println(length + " " + length.isPretty());
        }

    }

    /* *************************   Rekurencja Tests   ********************************* */
    public void rekurencjaMain() {
        Rekurencja rek = new Rekurencja();
        System.out.println(rek.sumaIteracja(1050));
        System.out.println(rek.sumaRekurencja(1050));
        System.out.println(rek.fibbonacciRekurencja(19));
    }

    /* *************************   Case Tests   ********************************* */
    public void caseMain() {
        Sterowanie str = new Sterowanie();
//        str.switchCase2(Colour.CZARNY);
//        str.switchCase2(Colour.CZERWONY);
//        str.switchCase2(Colour.ZIELONY);
//        str.switchCase2(Colour.BIALY);

        str.switchCase3(Colour.CZARNY);
        str.switchCase3(Colour.ZIELONY);
        System.out.println(str.switchCase3(Colour.BIALY));

    }

}
