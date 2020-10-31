/*
    Aufgabe 3) while-Schleifen
*/
public class Aufgabe3 {

    public static void main(String[] args) {

        // TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        String text = "Ich gehe zum Bagger und starte den Bagger.";
        PrintUntilDoubleG(text);
        System.out.println(firstIndexOf(text, 't'));
        int i = 27;
        int sum = 0;
        while (i < 261) {
            if (i % 13 == 0 && i % 2 == 0)
                sum += i;
            i++;
        }
        System.out.println(sum);
        PrintReverseExceptG(text);
        System.out.println(CountVocals(text));


        System.out.println();

        text = "Ich gehe in die Garage.";
        PrintUntilDoubleG(text);
        System.out.println(firstIndexOf(text, 't'));
        PrintReverseExceptG(text);
        System.out.println(CountVocals(text));

    }

    private static void PrintUntilDoubleG(String text) {
        int i = 0;
        int textLength = text.length();
        char previousChar = Character.MIN_VALUE;
        boolean doubleG = false;
        while (i < textLength && !doubleG) {
            if (previousChar == 'g' && text.charAt(i) == 'g') {
                doubleG = true;
            } else {
                System.out.print(previousChar);
            }
            previousChar = text.charAt(i);
            i++;
        }
        if (!doubleG) {
            System.out.print(previousChar);
        }
        System.out.println();
    }

    private static int firstIndexOf(String text, char c) {
        int i = 0;
        int textLength = text.length();
        int firstOccurence = -1;
        boolean charFound = false;
        while (i < textLength && !charFound) {
            if (text.charAt(i) == c) {
                firstOccurence = i;
                charFound = true;
            }
            i++;
        }
        return firstOccurence;
    }

    private static void PrintReverseExceptG(String text) {
        int i = text.length() - 1;
        int j = 1;
        while (i >= 0) {
            if (j % 2 == 0 && text.charAt(i) != 'g') {
                System.out.print(text.charAt(i));
            }
            j++;
            i--;
        }
        System.out.println();
    }

    private static int CountVocals(String text) {
        int i = 0;
        int occurences = 0;
        while(i < text.length()) {
            if(IsVocal(text.charAt(i))) {
                occurences++;
            }
            i++;
        }
        return occurences;
    }

    private static boolean IsVocal(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}






