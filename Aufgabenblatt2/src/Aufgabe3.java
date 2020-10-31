/*
    Aufgabe 3) Erste Methoden
*/
public class Aufgabe3 {
    static final String LETTERS = "ABCDEFGHJKLMNOPQRSTUVWXYZ";
    //TODO: Implementieren Sie hier die in der Angabe beschriebenen Methoden

    private static void printChar(char c) {
        System.out.print(c);
    }

    private static void printAlphabet() {
        for(int i = 0; i < LETTERS.length(); i++) {
            printChar(LETTERS.charAt(i));
            System.out.print(" ");
        }
        System.out.println();
    }

    private static void printNumbersInInterval(int start, int end) {
        for(int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int calcSum(int start, int end) {
        int sum = 0;
        for(int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    private static double getCirclePerimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    private static boolean isFirstCharacterGreater(char charOne, char charTwo) {
        return (int)charOne > (int)charTwo;
    }

    private static String removeEachSecondChar(String text) {
        String newText = "";
        for(int i = 0; i <  text.length(); i++) {
            if(i % 2 == 0) {
                newText = newText + text.charAt(i);
            }
        }
        return newText;
    }

    public static void main(String[] args) {
        //DIE NACHFOLGENDEN ZEILEN SIND ZUM TESTEN DER METHODEN.
        //ENTFERNEN SIE DIE KOMMENTARE, UM IHRE METHODEN ZU TESTEN.

        assert (calcSum(0, 0) == 0);
        assert (calcSum(0, 1) == 1);
        assert (calcSum(1, 2) == 3);
        assert (calcSum(1, 10) == 55);
        assert (calcSum(23, 356) == 63293);
        /*
        assert (getCirclePerimeter(0) == 0);
        assert (getCirclePerimeter(1) == 2 * Math.PI);
        assert (getCirclePerimeter(7) == 14 * Math.PI);

        assert (!isFirstCharacterGreater('A', 'B'));
        assert (!isFirstCharacterGreater('+', '4'));
        assert (!isFirstCharacterGreater('5', '5'));
        assert (isFirstCharacterGreater('C', '?'));
        assert (isFirstCharacterGreater('t', 'g'));
        assert (isFirstCharacterGreater('8', '3'));

        assert (removeEachSecondChar("").equals(""));
        assert (removeEachSecondChar("A").equals("A"));
        assert (removeEachSecondChar("AB").equals("A"));
        assert (removeEachSecondChar("Hello World!").equals("HloWrd"));
        assert (removeEachSecondChar("Das ist ein kurzer Testtext!").equals("Dsitenkre etet"));
        */
        //**********************************************************************

        //TODO: Testen Sie hier zusätzlich alle Methoden mit verschiedenen Inputs!
        System.out.println(calcSum(0, 0) == 0);
        System.out.println(calcSum(0, 1) == 1);
        System.out.println(calcSum(1, 2) == 3);
        System.out.println(calcSum(1, 10) == 55);
        System.out.println(calcSum(23, 356) == 63293);
    }



}
