package com.labwork4;

/**
 * Component interface
 */
public interface Component {
    /**
     * Method to draw the component.
     */
    void draw();

    /**
     * Method to handle mouse events.
     * @param x coordinate
     * @param y coordinate
     */
    void handleMouseEvent(int x, int y);
}
