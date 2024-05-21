package com.labwork4;

/**
 * ButtonEventHandler class is a concrete implementation of MouseEventHandler interface.
 */
public class ButtonEventHandler implements MouseEventHandler {
    /**
     * Reference to the next handler in the chain.
     */
    private MouseEventHandler nextHandler;
    /**
     * Reference to the button object.
     */
    private Button button;

    /**
     * Constructor that initializes the button object.
     * @param button Button object.
     */
    public ButtonEventHandler(Button button) {
        this.button = button;
    }

    @Override
    public void setNextHandler(MouseEventHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public MouseEventHandler getNextHandler() {
        return nextHandler;
    }

    @Override
    public void handleEvent(int x, int y) {
        if (button != null) {
            button.handleMouseEvent(x, y);
        }
        if (nextHandler != null) {
            nextHandler.handleEvent(x, y);
        }
    }
}
