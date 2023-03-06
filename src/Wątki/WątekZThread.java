package Wątki;

public class WątekZThread extends Thread{

    public void run(){
        for (int i = 0; i < 1 ; i++) {
            System.out.println(this.getId()+" "+i);
        }
    }

    public int dodajmy(int i){
                return ++i;
    }

}
