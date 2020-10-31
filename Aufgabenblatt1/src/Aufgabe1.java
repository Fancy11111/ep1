/*
    Aufgabe 1) Verzweigungen
*/
public class Aufgabe1 {
    
    public static void main(String[] args) {
        
        // a)
        System.out.println(StripTextBetweenPoints(".Der erste Satz. Der zweite Teil!"));
        System.out.println(StripTextBetweenPoints("Zwei. Punkte im Satz."));
        System.out.println(StripTextBetweenPoints("Mehr. als. zwei. Punkte gefunden!"));
        System.out.println(StripTextBetweenPoints("Ein Punkt."));
        System.out.println(StripTextBetweenPoints("Kein Punkt!"));
        System.out.println();
        // b)
        CheckCharacterOccurence("Donaudampfschiff", 'k');
        CheckCharacterOccurence("Donaudampfschiff", 'n');
        CheckCharacterOccurence("Donaudampfschiff", 'f');
        System.out.println();
        // c)
        daysOfMonth(2001, 1);
        daysOfMonth(2001, 2);
        daysOfMonth(2001, 3);
        daysOfMonth(2001, 4);
        daysOfMonth(2001, 5);
        daysOfMonth(2001, 6);
        daysOfMonth(2001, 7);
        daysOfMonth(2001, 8);
        daysOfMonth(2001, 9);
        daysOfMonth(2001, 10);
        daysOfMonth(2001, 11);
        daysOfMonth(2001, 12);
        System.out.println();

        daysOfMonth(2001, -1);
        daysOfMonth(2001, 0);
        daysOfMonth(2001, 13);
        System.out.println();

        daysOfMonth(2000, 2);
        daysOfMonth(2400, 2);
        daysOfMonth(2100, 2);
        daysOfMonth(2200, 2);
    }

    private static String StripTextBetweenPoints(String text) {
        int indexFirstPoint = text.indexOf('.');
        int indexLastPoint = text.lastIndexOf('.');
        int textLength = text.length();

        if(indexFirstPoint != indexLastPoint) {
            if(textLength != indexLastPoint + 1) {
                return text.substring(0, indexFirstPoint) + text.substring(indexLastPoint + 1, textLength);
            }
            else {
                return text.substring(0, indexFirstPoint);
            }
        }
        else {
            return text;
        }
    }

    private static void CheckCharacterOccurence(String text, char occuringCharacter) {
        int indexFirstPoint = text.indexOf(occuringCharacter);
        int indexLastPoint = text.lastIndexOf(occuringCharacter);

        if(indexFirstPoint != indexLastPoint) {
            System.out.println("Zwei oder mehr Zeichen gefunden");
        }
        else if (indexFirstPoint != -1) {
            System.out.println("Genau ein Zeichen gefunden");
        }
        else {
            System.out.println("Kein Zeichen gefunden");
        }
    }

    private static void daysOfMonth(int year, int month) {
        int days;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2: {
                if(year % 4 == 0){
                    if(year % 100 == 0 && year % 400 == 0) {
                        days = 29;
                    }
                    else if (year % 100 == 0) {
                        days = 28;
                    }
                    else {
                        days = 29;
                    }
                }
                else {
                    days = 28;
                }
                break;
            }
            default:
                days = -1;
                break;
        }

        if(days == -1) {
            System.out.println("Ungültiges Datum!");
        }
        else{
            System.out.println("Jahr: " + year + "; Monat: " + month + "; Tage: " + days);
        }
    }
}
