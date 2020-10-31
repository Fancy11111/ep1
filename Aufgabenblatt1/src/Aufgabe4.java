import java.awt.*;

/*
    Aufgabe 4) StdDraw Bibliothek
*/
public class Aufgabe4 {
    
    public static void main(String[] args) {

        // TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        StdDraw.setCanvasSize(400, 400);
        StdDraw.setScale(0, 400);
        StdDraw.setPenRadius(0.005);
        drawLines();
        drawBlueCircles();
        drawFilledSquare();
        drawStar();
    }

    private static void drawLines() {
        for(int i = 1; i * 40 <= 400; i++) {
            if(i % 3 == 0) {
                StdDraw.setPenColor(Color.RED);
            }
            else {
                StdDraw.setPenColor(Color.GREEN);
            }
            StdDraw.line(0, 400, i * 40, 0);
        }
    }

    private static void drawBlueCircles() {
        StdDraw.setPenColor(Color.CYAN);
        StdDraw.circle(400-250, 400-50, 50);
        StdDraw.circle(400-50, 400-250, 50);
    }

    private static void drawFilledSquare() {
        StdDraw.setPenColor(Color.ORANGE);
        StdDraw.filledRectangle(100, 100, 40, 40);
        StdDraw.setPenColor(Color.BLUE);
        StdDraw.filledCircle(100, 100, 20);
    }

    private static void drawStar() {
        StdDraw.setPenColor(Color.MAGENTA);
        StdDraw.rectangle(300, 300, 100, 100);
        StdDraw.setPenColor(Color.YELLOW);
        StdDraw.filledRectangle(300, 300, 40,40);
        StdDraw.filledEllipse(400-100, 400 - 100, 100, 40);
        StdDraw.filledEllipse(400-100, 400 - 100, 40, 100);
    }
}
