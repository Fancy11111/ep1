import java.awt.*;

/*
    Aufgabe 1) Schleifen - Optische Täuschung
*/
public class Aufgabe1 {

    public static void main(String[] args) {

        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        StdDraw.setCanvasSize(520, 520);
        StdDraw.setScale(0, 520);

        StdDraw.setPenColor(Color.BLACK);
        StdDraw.setPenRadius(0.0075);
        for(int i = 0; i < 11; i++) {
            StdDraw.line(260, 260, i*52, 520);
            StdDraw.line(260, 260, 520, 520 - i * 52);
            StdDraw.line(260, 260, 520 - i * 52, 0);
            StdDraw.line(260, 260, 0, i * 52);
        }

        StdDraw.setPenColor(Color.RED);
        StdDraw.setPenRadius(0.02);
        double distance = 520.0 / 6.0;
        double offset = 520.0 / 12.0;
        for(int i = 0; i < 7; i++) {
            StdDraw.line(0,i * distance + offset, 520, i * distance + offset);
            StdDraw.line(i * distance + offset,0, i * distance + offset, 520);
        }
    }
}
