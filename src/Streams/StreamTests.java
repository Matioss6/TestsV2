package Streams;

import Streams.Functions.StringToInt;
import Streams.Functions.StringToInteger;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.IntPredicate;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
//        IntStream letsGoLambda = IntStream.generate(() -> (int) (Math.random() * Integer.MAX_VALUE));
//        letsGoLambda.filter(i -> i % 2 == 0)
//                .limit(10)
//                .forEach(b -> System.out.println("with lambda " + b));


        // Lata przestępne
        IntStream lataPrzestępne = IntStream.generate(() -> (int) (Math.random() * 301) + 1900);
        IntPredicate is4 = i -> i % 4 == 0;
        IntPredicate isNot100 = i -> i % 100 != 0;
        lataPrzestępne
                .limit(650)
                .peek(i -> System.out.println("peek" + i))
                .filter(is4.and(isNot100))
                .distinct().sorted().forEach(System.out::println);

        IntPredicate isLeap = is4.and(isNot100);
//        IntStream.of(1999, 2000, 2001, 2004, 1900, 2100, 2102).filter(isLeap).forEach(System.out::println);




    }

    public void streamWithFile(){
        LogDemo logDemo = new LogDemo();
        logDemo.letsGo();
    }

    public void mappingData(String... args){

        Stream<String> usingIntegers = Arrays.stream(args);
        Stream<String> usingIntegers2 = Arrays.stream(args);

        // Process the Integers and print their class bez lambdy
     //   usingIntegers.map(new StringToInteger()).forEach(i -> System.out.println(i + ", " + i.getClass().getSimpleName()));

        //z lambdą + try catch na złe inputy
        usingIntegers2.map(s->{
                    try {
                        return Integer.valueOf(s);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                        System.out.println("to nie jest numer");
                    };
                    return 0;
                })
                .forEach(i -> System.out.println(i + ", " + i.getClass().getSimpleName()));

        // And then try out the ints and make sure they are numbers
        Stream<String> usingInts = Arrays.stream(args);
        usingInts.mapToInt(new StringToInt())
                .filter(i -> (i >= Integer.MIN_VALUE && i <= Integer.MAX_VALUE))
                .forEach(i -> System.out.println(i + " is a valid int"));

        String[] dates = { "2011-04-04", "2020-02-20", "2019-09-19", "2018-08-18", "1970-01-02" };

        // Just a simple parse function
        System.out.println("Simple parse of a stream of dates:");
        Arrays.stream(dates).map(d -> LocalDate.parse(d)).map(d->d.getLong(ChronoField.EPOCH_DAY)).forEach(d -> System.out.println("  " + d));




    }

    public void mapping2DData(){

        int[][] grades = {{3,4,5,2}, {5,6,2,3}, {3,3,2,4,5,3},{6,4,7,8,94}};
        Stream<int[]> a = Stream.of(grades);
        Stream.of(grades).flatMapToInt(s->IntStream.of(s)).forEach(s-> System.out.println(s));



        Pattern separator = Pattern.compile(",");
        try {
            Stream<String> lineStream = Files.lines(Path.of("lorem-ipsum.txt"));
            Stream<String> lineStream2 = Files.lines(Path.of("lorem-ipsum.txt"));
            lineStream2.flatMap(ls -> separator.splitAsStream(ls)).forEach(s-> System.out.println(s));

            long wordCount = lineStream.flatMap(ls -> separator.splitAsStream(ls)).distinct().count();
            System.out.println("Found " + wordCount + " unique words in the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
