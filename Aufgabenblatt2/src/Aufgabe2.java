import java.util.Scanner;

/*
    Aufgabe 2) Verschachtelte Schleifen und Verzweigungen
*/
public class Aufgabe2 {
    static final String LETTERS = "ABCDEFGHJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {

        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        Scanner scanner = new Scanner(System.in);
        int figHeight = 0;
        boolean readInt = false;
        System.out.print("Please enter an uneven positive that is <= 53: ");
        while(!readInt && scanner.hasNext()) {
            if(scanner.hasNextInt()) {
                figHeight = scanner.nextInt();
                if(figHeight % 2 == 1 && figHeight <= 53) {
                    readInt = true;
                }
                else {
                    System.out.print("Please enter an uneven positive that is <= 53: ");
                }
            }
            else {
                System.out.print("Please enter an uneven positive that is <= 53: ");
                scanner.next();
            }
        }

        if(!(figHeight % 2 == 1 && figHeight <= 53)) {
            System.exit(1);
        }
        int spaces; // Spaces left and right of figure
        int letters;
        int width = figHeight + 1;
        int yMiddle = (figHeight / 2);
        char leftBorder, rightBorder;

        // Loesung mit mehreren Schleifen
        for(int i = 0; i < yMiddle; i++) {
            spaces = (width - (i * 2) - 2) / 2;
            for(int j = 0; j < spaces; j++) {
                System.out.print(' ');
            }
            System.out.print('/');
            for(int j = 0; j < i*2; j++) {
                System.out.print('A');
            }
            System.out.print('\\');
            for(int j = 0; j < spaces; j++) {
                System.out.print(' ');
            }
            System.out.println();
        }

        System.out.print('|');
        for(int i = 0; i < (width - 2) / 2; i++)
            System.out.print(LETTERS.charAt(i));

        for(int i = (width - 2) / 2 - 1; i >= 0; i--)
            System.out.print(LETTERS.charAt(i));
        System.out.println('|');

        for(int i = yMiddle - 1; i > -1; i--) {
            spaces = (width - (i * 2) - 2) / 2;
            for(int j = 0; j < spaces; j++) {
                System.out.print(' ');
            }
            System.out.print('\\');
            for(int j = 0; j < i*2; j++) {
                System.out.print('A');
            }
            System.out.print('/');
            for(int j = 0; j < spaces; j++) {
                System.out.print(' ');
            }
            System.out.println();
        }

        // Loesung einer Schleife
        for(int i = 0; i < figHeight; i++){
            if(i < yMiddle) {
                leftBorder = '/';
                rightBorder = '\\';
            }
            else if(i > yMiddle) {
                leftBorder = '\\';
                rightBorder = '/';
            }
            else{
                leftBorder = '|';
                rightBorder = '|';
            }
            spaces = ((width - 2) - i*2) / 2;
            spaces = spaces >= 0 ? spaces : spaces * -1;
            letters = (width - 2 - spaces*2) / 2;
            printSpaces(spaces);
            System.out.print(leftBorder);
            printLetters(letters);
            System.out.print(rightBorder);
            printSpaces(spaces);
            System.out.println();
        }
    }

    private static void printSpaces(int count) {
        for(int i = 0; i < count; i++)
            System.out.print(' ');
    }

    /**
     * prints twice the amount of count letters
     * for count = 2 ABBA
     * for count = 7 ABCDEFGGFEDCBA
     * @param count
     */
    private static void printLetters(int count){

        for(int i = 0; i < count; i++)
            System.out.print(LETTERS.charAt(i));

        for(int i = count - 1; i >= 0; i--)
            System.out.print(LETTERS.charAt(i));
    }
}
