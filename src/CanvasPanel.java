import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class CanvasPanel extends JPanel {

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        ((Graphics2D) g).setPaint(Color.blue);

        int width = getWidth();
        int height = getHeight();

        int x1 = width/2;
        int y1 = height/2;

        g2d.drawLine(x1, y1, 0, 0);
        g2d.drawLine(x1, y1, width, height);
        g2d.drawLine(x1, y1, width, 0);
        g2d.drawLine(x1, y1, 0, height);
        g2d.drawLine(x1, y1, x1, height);
        g2d.drawLine(x1, y1, x1, 0);
        g2d.drawLine(x1, y1, width, y1);
        g2d.drawLine(x1, y1, 0, y1);

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }

    public void draw(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        ((Graphics2D) g).setPaint(Color.blue);

        int width = getWidth();
        int height = getHeight();

        int x1 = width/2;
        int y1 = height/2;

        try {
            while (true) {
                Thread.sleep(1000);
                Scanner scanner = new Scanner(System.in);
                int nextX1 = scanner.nextInt();
                int nextY1 = scanner.nextInt();

                g2d.drawLine(x1, y1, nextX1, nextY1);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
