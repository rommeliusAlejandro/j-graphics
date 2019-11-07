public class Main {

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow(new CanvasPanel());

        mainWindow.setVisible(true);
        mainWindow.getCanvasPanel().draw(mainWindow.getCanvasPanel().getGraphics());
    }
}
