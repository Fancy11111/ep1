import java.awt.*;

/*
    Aufgabe 5) Schleifen und Zeichnen innerhalb des StdDraw-Fensters
*/
public class Aufgabe5 {
    
    public static void main(String[] args) {

        int n = 19;
        int windowSize = 300;
        double radius = windowSize / (n * 2.0);
        if(n % 2 == 0) {
            System.out.println("fehler: n ist gerade");
        }
        StdDraw.setCanvasSize(windowSize,windowSize);
        StdDraw.setXscale(0, windowSize);
        StdDraw.setYscale(0, windowSize);
        // Horizonzal rechts
        StdDraw.setPenColor(Color.BLUE);
        for(int i = 3; i < ((n-1) * 2); i = i + 2) {
            StdDraw.circle(radius * i, radius , radius);
            StdDraw.circle(radius * i, windowSize - radius, radius);
        }

        StdDraw.setPenColor(Color.RED);
        for(int i = 1; i < (n * 2); i = i + 2) {
            StdDraw.circle(radius, radius * i, radius);
            StdDraw.circle(windowSize - radius, radius * i, radius);
        }

        StdDraw.setPenColor(Color.GREEN);
        StdDraw.circle(windowSize / 2.0, windowSize / 2.0, radius);
        double x = Math.sqrt((radius*radius) * 2);
        double middle = windowSize / 2.0;
        for(int i = 0; i <= n / 2; i++){
            StdDraw.circle(middle - (x * i), middle - (x * i), radius);
            StdDraw.circle(middle + (x * i), middle + (x * i), radius);
            StdDraw.circle(middle - (x * i), middle + (x * i), radius);
            StdDraw.circle(middle + (x * i), middle - (x * i), radius);
        }
    }
}
