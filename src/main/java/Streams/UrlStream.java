package Streams;

import java.io.*;
import java.net.*;

public class UrlStream {


    public void takeFromURL() {

        BufferedReader br=null;
        try {
            URL oreilly = new URL("https://www.oreilly.com/");
            InputStream is = oreilly.openStream();
            InputStreamReader isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // no i tu mamy już streaam
            long lineCount = br.lines().count();
            System.out.println("The page has " + lineCount + " lines.");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}