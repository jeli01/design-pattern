package memento;

import java.util.ArrayList;

public class Walker {
    private int currentX, currentY;
    private int targetX, targetY;
    private ArrayList<String> actionList = new ArrayList<>();

    public Walker(int currentX, int currentY, int targetX, int targetY) {
        this.currentX = currentX;
        this.currentY = currentY;
        this.targetX = targetX;
        this.targetY = targetY;
    }

    public double walk(String action) {
        actionList.add(action);

        if (action.equals("UP")) {
            currentY += 1;
        } else if (action.equals("RIGHT")) {
            currentX += 1;
        } else if (action.equals("DOWN")) {
            currentY -= 1;
        } else if (action.equals("LEFT")) {
            currentX -= 1;
        }

        return Math.sqrt(Math.pow(currentX - targetX, 2) + Math.pow(currentY - targetY, 2));
    }

    public class Memento {
        int x, y;
        ArrayList<String> actionList;

        Memento() {
            actionList = new ArrayList<>();
        }
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.x = this.currentX;
        memento.y = this.currentY;
        memento.actionList = new ArrayList<>(this.actionList);
        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.currentX = memento.x;
        this.currentY = memento.y;
        this.actionList = new ArrayList<>(memento.actionList);
    }

    @Override
    public String toString() {
        return actionList.toString();
    }
}