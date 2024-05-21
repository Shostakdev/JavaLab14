package com.labwork4;

/**
 * MouseEventHandler interface
 */
public interface MouseEventHandler {
    /**
     * Method to set the next handler.
     * @param handler MouseEventHandler object.
     */
    void setNextHandler(MouseEventHandler handler);

    /**
     * Method to get the next handler.
     * @param x coordinate
     * @param y coordinate
     */
    void handleEvent(int x, int y);

    /**
     * Method to get the next handler.
     * @return MouseEventHandler object.
     */
    MouseEventHandler getNextHandler();
}
