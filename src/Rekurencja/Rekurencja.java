package Rekurencja;

public class Rekurencja {

    public int sumaIteracja(int n) {
        int suma=0;

        for(int i=1; i<=n; i++){
            suma = suma+i;
        }
        return suma;

    }

    public int sumaRekurencja(int n) {

//        if (n > 0) {
//            return n + sumaRekurencja(n - 1);
//        }
//        else{
//            return 0;
//        }
        // Dół daje to samo co to wyżej - nice

        return n>0? n+ sumaRekurencja(n-1) : 0;

    }

    public int fibbonacciRekurencja(int n){

        if (n>1){

            n--;
            return fibbonacciRekurencja(n-1)+fibbonacciRekurencja(n);

        }
        else if (n==1) return 1;
        else return 0;
    }

}
