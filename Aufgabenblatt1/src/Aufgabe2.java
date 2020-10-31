/*
    Aufgabe 2) for-Schleifen
*/
public class Aufgabe2 {
    
    public static void main(String[] args) {
        //a
        int sum = 0;
        for(int i = 10; i < 110; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println();

        //b
        for(int i = 13; i < 121; i++) {
            if(i % 4 == 0 &&  i % 6 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        //c
        for(int i = 169; i > 34; i--) {
            if(i % 17 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        //d
        int product = 1;
        for(int i = -10; i < 11; i++) {
            if(i % 2 == 1 || i % 2 == -1) {
                product *= i;
            }
        }
        System.out.println(product);
        System.out.println();

        //e
        String text = "Schiffe für den Fischfang.";
        int occurences = 0;
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == 'f'){
                occurences++;
            }
        }
        System.out.println(occurences);

    }
}






