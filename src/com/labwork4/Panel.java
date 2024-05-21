package com.labwork4;

import java.util.ArrayList;
import java.util.List;

/**
 * Panel class
 */
public class Panel implements Component {
    /**
     * List of children components
     */
    private List<Component> children = new ArrayList<>();

    /**
     * Add a component to the panel
     * @param component Component to add
     */
    public void addComponent(Component component) {
        children.add(component);
    }

    /**
     * Remove a component from the panel
     * @param component Component to remove
     */
    public void removeComponent(Component component) {
        children.remove(component);
    }

    @Override
    public void draw() {
        System.out.println("Drawing panel");
        for (Component child : children) {
            child.draw();
        }
    }

    @Override
    public void handleMouseEvent(int x, int y) {
        System.out.println("Panel received mouse event at (" + x + ", " + y + ")");
        for (Component child : children) {
            child.handleMouseEvent(x, y);
        }
    }
}
