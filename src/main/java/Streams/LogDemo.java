package Streams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

public class LogDemo {

    public void letsGo()  {


        try {
            Predicate<String> getLines = line -> line.contains("] \"GET");
           long result = Files.lines(Path.of("sample-access.log")).filter(getLines.negate()).count();
            System.out.println("Found " + result + " lines in the log file.");

        } catch (IOException e) {
            e.printStackTrace();
        }


        Pattern separator = Pattern.compile("\\s+");
        Pattern ipAddress = Pattern.compile("\\d+\\.\\d+\\.\\d+\\.\\d+");
        try {
            // Open the file...
            FileInputStream fis = new FileInputStream("sample-access.log.gz");
            // Then decompress the file...
            GZIPInputStream gis = new GZIPInputStream(fis);
            // The wrap the decompressed input in a reader
            InputStreamReader ir = new InputStreamReader(gis);
            // Then layer on a buffered reader...
            BufferedReader br = new BufferedReader(ir);

            // That finally gives us our stream!
           //  long result = br.lines().count();
         //    System.out.println("Compressed file has " + result + " lines.");

            // Now let's process that stream to get some interesting information
            long result = br.lines()
                    .flatMap(ls -> separator.splitAsStream(ls))
                    .filter(word -> ipAddress.matcher(word).matches())
                    .distinct()
                    .count();
            System.out.println("Found " + result + " unique IPs.");

        } catch (IOException ioe) {
            System.err.println("Oh no! Something went wrong: " + ioe);
        }










    }

}