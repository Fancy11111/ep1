import java.util.Scanner;

/*
    Aufgabe 2) Verschachtelte Schleifen und Verzweigungen
*/
public class Aufgabe2 {

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
        int signs;
        int width = figHeight + 1;
        int yMiddle = (figHeight / 2);
        int direction = -1;
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
        for(int i = 0; i < width - 2; i++) {
            System.out.print('A');
        }
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

    }
}
