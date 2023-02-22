import Lambda.LambdaTest;
import Lambda.TestLambdaParam;
import Random.RandomTest;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.lambaMain();
  //      main.randomMain();





    }

    /* *************************   Lambda Tests   ********************************* */
    public void lambaMain() {
        LambdaTest lambdaTest = new LambdaTest();
        // lambdaTest.lambda1();
        // lambdaTest.lambda2();
        // lambdaTest.lambdaAsParam();
        // lambdaTest.lambdaAsParam2();

    }
    /* *************************   Lambda Tests   ********************************* */



    /* *************************   Random Tests   ********************************* */
    public void randomMain() {
        RandomTest randomTest = new RandomTest();
        double a;
        byte b;
        char c;
        a = randomTest.castowanie(4, 5);
        b = (byte) randomTest.castowanie(4, 5);
        c = (char) randomTest.castowanie(1, 3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    /* *************************   Random Tests   ********************************* */


}
