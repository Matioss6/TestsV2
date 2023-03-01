package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest {

    public void lambda1() {

        TestLambda<String> old = new TestLambda<String>() {
            @Override
            public void collable(String b) {
                System.out.println(b);
            }
        };

        TestLambda<String> nowe = (a) -> System.out.println(a);
        TestLambda<String> nowe2 = System.out::println;

        old.collable("old not lambda");
        nowe.collable("new lambda");
        nowe2.collable("hejo method ref");


    }

    public void lambda2() {

        TestLambda2 old = new TestLambda2() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };

        TestLambda2 nowe = (a, b) -> a + b;
        TestLambda2 nowe2 = Integer::sum;
        TestLambda2 nowe3 = Math::addExact;

        System.out.println(old.add(5, 8));
        System.out.println(nowe.add(5, 8));
        System.out.println(nowe2.add(5, 8));
        System.out.println(nowe3.add(5, 8));
        System.out.println(nowe3.add(22, 8));


    }

    public void lambdaAsParam() {

        List<String> kolorki = List.of("niebieski", "czarny", "czerwony");

        Consumer<String> a = parametercik -> System.out.println(parametercik + "param");
        kolorki.forEach(a);

        kolorki.forEach(kolor -> System.out.println(kolor)); //"normal" lambda

        kolorki.forEach(kolor -> {          // a bit extended lambda
            String b = kolor + "55";
            System.out.println(b);
        });

        kolorki.forEach(System.out::println); // method reference


    }

    public void lambdaAsParam2() {

        TestLambdaParam lambdaParam = (a, b) ->
        {
            String c = a + b;
            return c;
        };
        System.out.println(lambdaParam.addString("dodaj", " mnie to"));

    }

}
