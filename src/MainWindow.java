import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private CanvasPanel canvasPanel;

    public MainWindow(CanvasPanel canvasPanel) throws HeadlessException {

        this.canvasPanel = canvasPanel;
        init();
    }

    public CanvasPanel getCanvasPanel() {
        return canvasPanel;
    }

    public void setCanvasPanel(CanvasPanel canvasPanel) {
        this.canvasPanel = canvasPanel;
    }

    private void init() {

        add(this.canvasPanel);

        setTitle("Roomba Playground");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
