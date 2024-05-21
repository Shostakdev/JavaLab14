package com.labwork4;

/**
 * GUI class
 */
public class GUI {
    /**
     * First handler
     */
    private MouseEventHandler firstHandler;

    /**
     * Add handler to the chain.
     * @param handler MouseEventHandler object.
     */
    public void addHandler(MouseEventHandler handler) {
        if (firstHandler == null) {
            firstHandler = handler;
        } else {
            MouseEventHandler currentHandler = firstHandler;
            while (currentHandler != null) {
                MouseEventHandler next = currentHandler.getNextHandler();
                if (next == null) {
                    currentHandler.setNextHandler(handler);
                    break;
                }
                currentHandler = next;
            }
        }
    }

    /**
     * Handle mouse event.
     * @param x coordinate
     * @param y coordinate
     */
    public void handleMouseEvent(int x, int y) {
        if (firstHandler != null) {
            firstHandler.handleEvent(x, y);
        }
    }
}
