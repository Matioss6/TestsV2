import Enum.Colour;
import Enum.Length;
import Lambda.LambdaTest;
import Porównywanko.Porównajmy;
import Random.RandomTest;
import Rekurencja.Rekurencja;
import Sterowanie.Sterowanie;
import Streams.StreamTests;
import Wątki.Wątki;

import java.util.Arrays;

/**
 * Main method
 */
public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        //     main.lambaMain();
        // main.randomMain();
        //    main.enumMain();
        //    main.rekurencjaMain();
        //    main.caseMain();
        //  main.porównywanieMain();
        //   main.wątkiMain();
        main.streamMain();


    }

    /* *************************   Lambda Tests   ********************************* */
    public void lambaMain() {
        LambdaTest lambdaTest = new LambdaTest();
        // lambdaTest.lambda1();
        // lambdaTest.lambda2();
        // lambdaTest.lambdaAsParam();
        // lambdaTest.lambdaAsParam2();
        lambdaTest.lambdaBuiltInInterfaces();

    }


    /* *************************   Random Tests   ********************************* */
    public void randomMain() {
        RandomTest randomTest = new RandomTest();
//        double a;
//        byte b;
//        char c;
//        a = randomTest.castowanie(4, 5);
//        b = (byte) randomTest.castowanie(4, 5);
//        c = (char) randomTest.castowanie(1, 3);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
        randomTest.sumaWithArgs(5, 3, 2, 3);
        randomTest.stringConcat();
        randomTest.stringConcat2();
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

    /* *************************   Porównywanie Tests   ********************************* */
    public void porównywanieMain() {
        Porównajmy porównajmy = new Porównajmy();
        //   porównajmy.createCollections();
        //    porównajmy.treeMapTest();
        //    porównajmy.kolorki();
        porównajmy.start();


    }

    /* *************************   Wątki Tests   ********************************* */
    public void wątkiMain() {
        Wątki wątki = new Wątki();
        //   wątki.startujeWątki();
        wątki.startujeWątkiRunnable();
        wątki.startujeWątkiRunnableSynchro();

    }

    /* *************************   Stream Tests   ********************************* */
    public void streamMain() {
        StreamTests streamTests = new StreamTests();
        streamTests.startStreams();
    }
}
