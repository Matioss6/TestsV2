package Porównywanko;

import java.io.File;
import java.util.*;

public class Porównajmy {
    Książka[] książka = new Książka[9];
    List<Książka> książka1 = new ArrayList<>();
    ArrayList<Książka> książka2 = new ArrayList<>();
    Set<Książka> książka3 = new HashSet<>();
    HashSet<Książka> książka4 = new HashSet<>();
    TreeSet<Książka> książka5 = new TreeSet<>();
    HashMap<String, Książka> książka6 = new HashMap<>();


    public void createCollections() {

        książka[0] = new Książka("Harry Potter cz.1 ", "2J.K Rowling", 5);
        książka[1] = new Książka("Harry Potter cz.2 ", "3.K Rowling", 0);
        książka[2] = new Książka("Harry Potter cz.3 ", "1J.K Rowling", 1);
        książka[3] = new Książka("Hobbit ", "Tolkien", 0);
        książka[4] = new Książka("Władca Pierścieni ", "Tolkien", 22);
        książka[5] = new Książka("Władca Pierścieni ", "Tolkien", 55);
        książka[6] = new Książka("Gwiezdne Wojny", "Tim Lebbon", 11);
        książka[7] = new Książka("123", "1ufo2", 7);
        książka[8] = new Książka("123", "1ufo2", 52);


        for (int i = 0; i < książka.length; i++) {
            książka1.add(książka[i]);
            książka2.add(książka[i]);
            książka3.add(książka[i]);
            książka4.add(książka[i]);
            książka5.add(książka[i]);
            książka6.put(String.valueOf(i), książka[i]);

        }


        System.out.println("książka = " + Arrays.toString(książka));
        System.out.println("książka 1(LIST) = " + książka1);
        System.out.println("książka 2(ARRAY LIST) = " + książka2);
        System.out.println("książka 3(SET) = " + książka3);
        System.out.println("książka 4(HASH SET) = " + książka4);
        System.out.println("książka 5(Tree Set) = " + książka5);
        System.out.println("książka 6(HASH MAP) = " + książka6);
        Collections.sort(książka1);
        System.out.println("książka 1(LIST - sorted) = " + książka1);
        książka1.sort(new Książka.KomparatorID());
        System.out.println("książka 1(LIST - sorted + komparator) = " + książka1);

        List<String> monthCollection = new ArrayList<>();
        monthCollection.add("January");
        monthCollection.add("February");
        monthCollection.add("March");
        String[] monthArray = monthCollection.toArray(String[]::new);

    }

    public void treeMapTest() {

        Map<Integer, String> employees = new TreeMap<>();
        employees.put(111, "Jan Kowalski");
        employees.put(333, "Wojciech Kowalski");
        employees.put(222, "Kasia Piotrowska");
        employees.put(555, "Anna Zawadzka");
        employees.put(444, "Jan Kowalski");

        System.out.println("Ilość pracowników: " + employees.size());

        Set<Integer> keySet = employees.keySet();
        System.out.println("Klucze:\n" + keySet);
        Collection<String> values = employees.values();
        System.out.println("Wartości:\n" + values);

        Set<Map.Entry<Integer, String>> entrySet = employees.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void kolorki() {

        ArrayList<WebColor> colors = new ArrayList<>();
        colors.add(new WebColor(255, 255, 255));
        colors.add(new WebColor(106, 207, 247));
        colors.add(new WebColor(240, 134, 222));
        colors.add(new WebColor(35, 110, 67));
        colors.add(new WebColor(224, 140, 13));
        colors.add(new WebColor(52, 4, 184));
        System.out.println("As added:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("  " + i + ": " + colors.get(i));
        }

        Collections.sort(colors, (x, y) -> x.getBlue() - y.getBlue());
        System.out.println("After sorting blue:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("  " + i + ": " + colors.get(i));


        }
        // Sort normal
        ColorComp comp = new ColorComp();
        //  Collections.sort(colors, comp);

        //Sort Lambda
        Collections.sort(colors, (x, y) -> x.getColor() - y.getColor());

        // Sort reference
        Collections.sort(colors, Comparator.comparingInt(WebColor::getColor));

        System.out.println("After sorting:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("  " + i + ": " + colors.get(i));


        }
    }

    public void start() {
        TreeSet<File> recentFiles = new TreeSet<>((f1, f2) -> f1.getName().compareTo(f2.getName()));
        recentFiles.add(new File("/tmp/check.txt"));
        recentFiles.add(new File("/Documents/contents.doc"));
        recentFiles.add(new File("/home/marc/startup.sh"));
        recentFiles.add(new File("/library/info.txt"));
        recentFiles.add(new File("/Downloads/episodes.json"));


        System.out.println("Full paths:");
        Iterator<File> i = recentFiles.iterator();
        while (i.hasNext()) {
            File f = i.next();
            System.out.println("  " + f.getAbsolutePath());
        }

        System.out.println("Full paths easy loop:");
        for (File f : recentFiles) {
            System.out.println("  " + f.getAbsolutePath());

        }


        System.out.println("Just names:");
        i = recentFiles.iterator();
        while (i.hasNext()) {
            File f = i.next();
            System.out.println("  " + f.getName());
        }
    }


}
