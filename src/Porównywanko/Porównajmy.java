package Porównywanko;

import java.util.*;

public class Porównajmy {
    Książka[] książka = new Książka[9];
    List<Książka> książka1 = new ArrayList<>();
    ArrayList<Książka> książka2 = new ArrayList<>();
    Set<Książka> książka3 = new HashSet<>();
    HashSet<Książka> książka4 = new HashSet<>();
    TreeSet<Książka> książka5 = new TreeSet<>();
    HashMap<String,Książka> książka6 = new HashMap<>();


    public void createCollections() {

        książka[0] = new Książka("Harry Potter cz.1 ", "J.K Rowling");
        książka[1] = new Książka("Harry Potter cz.2 ", "J.K Rowling");
        książka[2] = new Książka("Harry Potter cz.3 ", "J.K Rowling");
        książka[3] = new Książka("Hobbit ", "Tolkien");
        książka[4] = new Książka("Władca Pierścieni ", "Tolkien");
        książka[5] = new Książka("Władca Pierścieni ", "Tolkien");
        książka[6] = new Książka("Gwiezdne Wojny", "Tim Lebbon");
        książka[7] = new Książka("123", "1ufo2");
        książka[8] = new Książka("123", "1ufo2");

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
        System.out.println("książka 5(Tree Set) = " +  książka5);
        System.out.println("książka 6(HASH MAP) = " + książka6);
    }

    public void porównanie(){

    }
}
