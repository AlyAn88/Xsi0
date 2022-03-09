import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> randul1 = new HashMap<>();
        randul1.put(1, " ");
        randul1.put(2, " ");
        randul1.put(3, " ");
        Map<Integer, String> randul2 = new HashMap<>();
        randul2.put(1, " ");
        randul2.put(2, " ");
        randul2.put(3, " ");
        Map<Integer, String> randul3 = new HashMap<>();
        randul3.put(1, " ");
        randul3.put(2, " ");
        randul3.put(3, " ");
        int jocuri = 1;
        while (true) {
            for (int x = 1; x <= 3; x++) {
                System.out.print("| " + randul1.get(x) + " |");
            }
            System.out.println(" ");
            for (int x = 1; x <= 3; x++) {
                System.out.print("| " + randul2.get(x) + " |");
            }
            System.out.println(" ");
            for (int x = 1; x <= 3; x++) {
                System.out.print("| " + randul3.get(x) + " |");
            }
            System.out.println(" ");
            if (jocuri % 2 == 1) {
                System.out.println("Introdu locul lui X");
            } else {
                System.out.println("Introdu locul lui 0");
            }
            if (randul1.get(1).equals(randul1.get(2)) && randul1.get(1).equals(randul1.get(3)) && randul1.get(1) != (" ")) {
                System.out.println("Castigatorul este " + randul1.get(1));
                break;
            }
            if (randul2.get(1).equals(randul2.get(2)) && randul2.get(1).equals(randul2.get(3)) && randul2.get(1) != (" ")) {
                System.out.println("Castigatorul este " + randul2.get(1));
                break;
            }
            if (randul3.get(1).equals(randul3.get(2)) && randul3.get(1).equals(randul3.get(3)) && randul3.get(1) != (" ")) {
                System.out.println("Castigatorul este " + randul3.get(1));
                break;
            }
            if (randul1.get(1).equals(randul2.get(1)) && randul1.get(1).equals(randul3.get(1)) && randul1.get(1) != (" ")) {
                System.out.println("Castigatorul este " + randul1.get(1));
                break;
            }
            if (randul1.get(2).equals(randul2.get(2)) && randul1.get(2).equals(randul3.get(2)) && randul1.get(2) != (" ")) {
                System.out.println("Castigatorul este " + randul1.get(1));
                break;
            }
            if (randul1.get(3).equals(randul2.get(3)) && randul1.get(3).equals(randul3.get(3)) && randul1.get(3) != (" ")) {
                System.out.println("Castigatorul este " + randul1.get(1));
                break;
            }
            if (randul1.get(1).equals(randul2.get(2)) && randul1.get(1).equals(randul3.get(3)) && randul1.get(1) != (" ")) {
                System.out.println("Castigatorul este " + randul1.get(1));
                break;
            }
            if (randul1.get(3).equals(randul2.get(2)) && randul1.get(1).equals(randul3.get(1)) && randul1.get(3) != (" ")) {
                System.out.println("Castigatorul este " + randul1.get(1));
                break;
            }
            if (jocuri == 9) {
                System.out.println("Jocul a luat sfarsit");
                break;
            }

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Introdu randul");
            int rand = keyboard.nextInt();
            System.out.println("Introdu coloana");
            int coloana = keyboard.nextInt();
            if (rand == 1) {
                if (randul1.get(coloana).equals(" ") & jocuri % 2 == 1) {
                    randul1.put(coloana, "X");
                    jocuri++;
                    continue;
                } else if (randul1.get(coloana).equals(" ") & jocuri % 2 == 0) {
                    randul1.put(coloana, "O");
                    jocuri++;
                    continue;
                }
            }
            if (rand == 2) {
                if (randul2.get(coloana).equals(" ") & jocuri % 2 == 1) {
                    randul2.put(coloana, "X");
                    jocuri++;
                    continue;
                } else if (randul2.get(coloana).equals(" ") & jocuri % 2 == 0) {
                    randul2.put(coloana, "O");
                    jocuri++;
                    continue;
                }
            }
            if (rand == 3) {

                if (randul3.get(coloana).equals(" ") & jocuri % 2 == 1) {
                    randul3.put(coloana, "X");
                    jocuri++;
                    continue;
                } else if (randul3.get(coloana).equals(" ") & jocuri % 2 == 0) {
                    randul3.put(coloana, "O");
                    jocuri++;
                    continue;
                }
            }
            if (jocuri == 11) {
                System.out.println("Jocul a luat sfarsit");
                break;
            }

        }

    }

}
