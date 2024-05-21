package com.labwork4;

/**
 * Button class that implements the Component interface.
 */
public class Button implements Component {
    /**
     * Label of the button.
     */
    private String label;

    /**
     * Constructor that initializes the label of the button.
     * @param label Label of the button.
     */
    public Button(String label) {
        this.label = label;
    }

    @Override
    public void draw() {
        System.out.println("Drawing button: " + label);
    }

    @Override
    public void handleMouseEvent(int x, int y) {
        System.out.println("Button " + label + " received mouse event at (" + x + ", " + y + ")");
    }
}
