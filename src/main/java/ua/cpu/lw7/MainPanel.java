package ua.cpu.lw7;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MainPanel extends JPanel {

    private final GridBagConstraints gbc;
    private final JPanel dataPanel;
    private final JPanel inputPanel;
    private final JTextField speedField;
    private final JTextField timeField;
    private final JPanel outputPanel;
    private final JLabel resultLabel;
    private final JTextArea resultArea;
    private final JPanel buttonPanel;
    private final JButton calculateButton;


    public MainPanel() {
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setLayout(new GridBagLayout());

        gbc = new GridBagConstraints();
//        Header constraints
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTH;

        add(new JLabel("<html><h1><strong><i>Distance Calculator</i></strong></h1><hr></html>"), gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        dataPanel = new JPanel(new GridBagLayout());
        inputPanel = new JPanel(new GridBagLayout());

        speedField = new JTextField(10);
        timeField = new JTextField(10);

        inputPanel.add(timeField, gbc);
        inputPanel.add(speedField, gbc);

        gbc.gridwidth = GridBagConstraints.RELATIVE;
        outputPanel = new JPanel(new GridBagLayout());

        resultLabel = new JLabel("Result -> ");
        resultArea = new JTextArea();

        outputPanel.add(resultLabel, gbc);
        outputPanel.add(resultArea, gbc);

        dataPanel.add(inputPanel, gbc);
        dataPanel.add(outputPanel, gbc);

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        add(dataPanel, gbc);

        buttonPanel = new JPanel(new GridBagLayout());

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(e -> {
            try {
                double time = Double.parseDouble(timeField.getText());
                double speed = Double.parseDouble(speedField.getText());

                resultArea.setText(String.valueOf(time * speed));
            } catch (NumberFormatException exc) {
                resultArea.setText("Number format exception.\n" + exc.getMessage());
                exc.printStackTrace();
            }
        });
        buttonPanel.add(calculateButton, gbc);
        add(buttonPanel, gbc);
    }

    public GridBagConstraints getGbc() {
        return gbc;
    }

    public JPanel getDataPanel() {
        return dataPanel;
    }

    public JPanel getInputPanel() {
        return inputPanel;
    }

    public JTextField getSpeedField() {
        return speedField;
    }

    public JTextField getTimeField() {
        return timeField;
    }

    public JPanel getOutputPanel() {
        return outputPanel;
    }

    public JLabel getResultLabel() {
        return resultLabel;
    }

    public JTextArea getResultArea() {
        return resultArea;
    }

    public JPanel getButtonPanel() {
        return buttonPanel;
    }

    public JButton getCalculateButton() {
        return calculateButton;
    }
}
