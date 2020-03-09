package edu.campus02;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int pflanze = 1;

        giessen(25, pflanze);

    }

    public static int giessen(int feuchtigkeitswert) {
        int giessdauer;
        if (feuchtigkeitswert < 20) {
            giessdauer = 5;
        } else if (feuchtigkeitswert > 20 && feuchtigkeitswert < 40) {
            giessdauer = 3;
        } else if (feuchtigkeitswert > 40 && feuchtigkeitswert < 75) {
            giessdauer = 1;
        } else {
            giessdauer = 0;
        }
        System.out.println("Die Pflanze muss " + giessdauer + " Sekunden gegossen werden");
        return feuchtigkeitswert;

        int wassergehalt = 95;
        int pflanze = 2;

        switch (pflanze) {
            case 1:
                wassergehalt = 99;
            case 2:
                wassergehalt = 95;
            case 3:
                wassergehalt = 100;
            case 4:
                wassergehalt = 98;
            default:
                wassergehalt = 99;
        }
        return wassergehalt;
    }
}
