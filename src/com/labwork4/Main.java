package com.labwork4;

/**
 * Main class
 */
public class Main {
    /**
     * Main method
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Button button1 = new Button("OK");
        Button button2 = new Button("Cancel");
        Panel panel = new Panel();
        panel.addComponent(button1);
        panel.addComponent(button2);

        GUI gui = new GUI();
        gui.addHandler(new ButtonEventHandler(button1));
        gui.addHandler(new ButtonEventHandler(button2));
        gui.addHandler(new PanelEventHandler(panel));

        gui.handleMouseEvent(100, 200); // Simulate a mouse event at coordinates (100, 200)
    }
}