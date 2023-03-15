package Sterowanie;

import Enum.Colour;

public class Sterowanie {

    public void switchCase1() {

        int a = 1;

        switch (a) {
            case 1: {
                System.out.println(1);
                System.out.println(1);
            }
            case 2: {
                System.out.println(55);
            }

            default: {
                System.out.println(a);
            }

        }
    }


    public void switchCase2(Colour a) {

//        switch (a){
//
//            case CZARNY: {
//                System.out.println("czarny+ cały dół");
//            }
//            case CZERWONY: {
//                System.out.println("czerwony+zielony");
//            }
//
//            case ZIELONY: {
//                System.out.println("zielony");
//            }
//            default:
//            {
//                System.out.println("zawsze tu jestem");
//            }
//
//        }

        switch (a) {

            case CZARNY -> {
                System.out.println("czarny");
            }
            case CZERWONY -> {
                System.out.println("czerwony");
            }

            case ZIELONY -> {
                System.out.println("zielony");
            }
            default -> {
                System.out.println("inne");
            }

        }

    }

    public String switchCase3(Colour a) {

        String zwrotkaZeSwitcha = switch (a) {

            case CZARNY: {
                System.out.println("czarny");
                yield "czarny";
            }
            case CZERWONY: {
                System.out.println("czerwony");
                yield "czerwony";

            }

            case ZIELONY, BIALY: {
                System.out.println("zielony lub biały");
                yield "zielony lub biały zwrotka z funkcji";

            }
            default: {
                System.out.println("inne");
                yield "default";

            }

        };

        return zwrotkaZeSwitcha;


    }

}
