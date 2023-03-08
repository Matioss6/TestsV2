package Streams;

import java.util.ArrayList;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class StreamTests {
    ArrayList<String> names = new ArrayList<>();

    public void startStreams() {

        names.add("Goku");
        names.add("Vegeta");
        names.add("Matios");
        names.add("Ellie");
        names.add("Joel");


        // forEach jest "terminal operation(~końcowa operacja)" - czyli działa np. na naszej kolekcji a nie na streamie
        names.stream().forEach(n -> System.out.println(n));

        //  "intermediate operation(~pośrednia operacja)" - działą na streamie i zwraca kolejny stream z którym możemy kontynuować
        names.stream().forEach(n -> System.out.println(n));

        // bez lambdy na streamie
        //   IntStream letsGo = IntStream.generate(new GiveMeInt()).limit(100);
        //  letsGo.limit(10).forEach(a -> System.out.println("bez lambdy" +a));

        // z lambdą plus filtr
        IntStream letsGoLambda = IntStream.generate(() -> (int) (Math.random() * Integer.MAX_VALUE));
        letsGoLambda.filter(i -> i % 2 == 0)
                .limit(10)
                .forEach(b -> System.out.println("with lambda " + b));


        // Lata przestępne
        IntStream lataPrzestępne = IntStream.generate(() -> (int) (Math.random() * 301) + 1900);
        IntPredicate is4 = i -> i % 4 == 0;
        IntPredicate isNot100 = i -> i % 100 != 0;
        lataPrzestępne.filter((is4.and(isNot100)).negate()).limit(500).sorted().forEach(System.out::println);

    }
}
