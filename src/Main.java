import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Buna ziua! Ne bucuram ca ati ales acest joc.");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int scorJucator = 0;
        int scorAdversar = 0;
        while (true) {
            System.out.println("Doriti sa jucati? Raspundeti cu da sau nu.");
            String raspuns = scanner.nextLine();
            if (raspuns.equalsIgnoreCase("da")) {
                int zar1Jucator = random.nextInt(6) + 1;
                int zar2Jucator = random.nextInt(6) + 1;
                int zar1Adversar = random.nextInt(6) + 1;
                int zar2Adversar = random.nextInt(6) + 1;
                System.out.println("Ai dat cu zarul: " + zar1Jucator + " si " + zar2Jucator);
                System.out.println("Adversarul a dat cu zarul: " + zar1Adversar + " si " + zar2Adversar);
                int sumaJucator = zar1Jucator + zar2Jucator;
                int sumaAdversar = zar1Adversar + zar2Adversar;
                if (sumaJucator > sumaAdversar) {
                    scorJucator++;
                    System.out.println("Ati castigat! Scorul este de " + scorJucator + " pentru tine si " + scorAdversar + " pentru adversar.");
                } else if (sumaAdversar == sumaJucator) {
                    System.out.println("REMIZA");
                } else {
                    scorAdversar++;
                    System.out.println("Adversarul a castigat! Scorul este de " + scorJucator + " pentru tine si " + scorAdversar + " pentru adversar ");
                }
                if (scorAdversar == 6) {
                    System.out.println("Adversarul a ajuns la 6 victorii. Adversarul a castigat jocul!");
                    break;
                }else if (scorJucator==6){
                    System.out.println("Ati ajuns la sase victori. Ati castigat jocul!");
                    break;
                }
            }else if (raspuns.equalsIgnoreCase("nu")){
                System.out.println("Va mai asteptam pe la noi.");
                break;
            }else {
                System.out.println("Nu ati introdus un raspuns valid. Introduceti da sau nu.");
            }
        }


    }
}
