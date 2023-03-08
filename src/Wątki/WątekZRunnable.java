package Wątki;

public class WątekZRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Wątki.liczbaStatic1++;
        }
    }
}

