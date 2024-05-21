package com.labwork4;

/**
 * Panel event handler class
 */
public class PanelEventHandler implements MouseEventHandler {
    /**
     * Reference to the next handler in the chain.
     */
    private MouseEventHandler nextHandler;
    /**
     * Reference to the panel object.
     */
    private Panel panel;

    /**
     * Constructor that initializes the panel object.
     * @param panel Panel object.
     */
    public PanelEventHandler(Panel panel) {
        this.panel = panel;
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
        if (panel != null) {
            panel.handleMouseEvent(x, y);
        }
        if (nextHandler != null) {
            nextHandler.handleEvent(x, y);
        }
    }
}
