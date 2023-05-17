package ua.cpu.lw7;

import javax.swing.*;
import java.awt.*;

public class DistanceCalculator implements Runnable {

    private final JFrame frame;

    public DistanceCalculator() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        frame = new JFrame("Distance Calculator");
        frame.setSize(450, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
    }

    public void run() {
        MainPanel mainPanel = new MainPanel();
        frame.add(mainPanel);
    }

}
