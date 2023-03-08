package Wątki;

public class Wątki {
    static int liczbaStatic1;
    static int liczbaStatic2;
    int Liczba;
    int wynik;

    public void startujeWątki() {


        WątekZThread wątpliwyWątek1 = new WątekZThread();
        WątekZThread wątpliwyWątek2 = new WątekZThread();
        wątpliwyWątek1.start();
        wątpliwyWątek2.start();

        for (int i = 0; i < 100060; i++) {
            wynik += wątpliwyWątek1.dodajmy(Liczba);
            wynik += wątpliwyWątek2.dodajmy(Liczba);
            System.out.println(wynik);

        }


    }

    public void startujeWątkiRunnable() {

        // not Synchronized
        Thread t1 = new Thread(new WątekZRunnable());
        Thread t2 = new Thread(new WątekZRunnable());
        Thread t3 = new Thread(new WątekZRunnable());
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                liczbaStatic1++;
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(liczbaStatic1);


    }

    synchronized void dodawanko() {
        for (int i = 0; i < 10000; i++) {
            liczbaStatic2++;
        }

    }

    public void startujeWątkiRunnableSynchro() {


        Thread t1 = new Thread(this::dodawanko);
        Thread t2 = new Thread(this::dodawanko);
        Thread t3 = new Thread(this::dodawanko);
        Thread t4 = new Thread(this::dodawanko);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(liczbaStatic2);

    }


}
