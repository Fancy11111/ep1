/*
    Aufgabe 4) Verschachtelung von Schleifen und Methoden - Münchhausen-Zahlen
*/
public class Aufgabe4 {

    private static boolean isMuenchhausenNumber(int number) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        return false; //Zeile kann geändert oder entfernt werden.
    }

    private static int countMuenchhausenNumbers(int start, int end) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        return -1; //Zeile kann geändert oder entfernt werden.
    }

    private static void printMuenchhausenNumbers(int start, int end) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
    }

    public static void main(String[] args) {
        //DIE NACHFOLGENDEN ZEILEN SIND ZUM TESTEN DER METHODE isMuenchhausenNumber(...).
        System.out.println("0 --> " + isMuenchhausenNumber(0));
        assert (isMuenchhausenNumber(0));
        System.out.println("1 --> " + isMuenchhausenNumber(1));
        assert (isMuenchhausenNumber(1));
        System.out.println("3435 --> " + isMuenchhausenNumber(3435));
        assert (isMuenchhausenNumber(3435));
        System.out.println("438579088 --> " + isMuenchhausenNumber(438579088));
        assert (isMuenchhausenNumber(438579088));

        System.out.println("2 --> " + isMuenchhausenNumber(2));
        assert (!isMuenchhausenNumber(2));
        System.out.println("36 --> " + isMuenchhausenNumber(36));
        assert (!isMuenchhausenNumber(36));
        System.out.println("1432 --> " + isMuenchhausenNumber(1432));
        assert (!isMuenchhausenNumber(1432));
        System.out.println();
        //**********************************************************************

        //TODO: Testen Sie hier alle Methoden mit verschiedenen Inputs!
    }
}
