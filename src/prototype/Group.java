package prototype;

import java.util.List;
import java.util.ArrayList;

class Group implements Shape, Prototype {
    private List<Shape> shapeList = new ArrayList<>();
    private String name;

    public Group(String name) { this.name = name; }

    public Group addShape(Shape shape) {
        shapeList.add(shape);
        return this;
    }

    @Override
    public Object copy() {
        Group newGroup = new Group(name);
        for (Shape shape : shapeList) {
            newGroup.shapeList.add((Shape) ((Prototype) shape).copy());
        }
        return newGroup;
    }

    @Override
    public String draw() {
        StringBuilder result = new StringBuilder(name + "(");
        for (int i = 0; i < shapeList.size(); i++) {
            result.append(shapeList.get(i).draw());
            if (i < shapeList.size() - 1) result.append(" ");
        }
        result.append(")");
        return result.toString();
    }

    @Override
    public void moveOffset(int dx, int dy) {
        for (Shape shape : shapeList) {
            shape.moveOffset(dx, dy);
        }
    }
}
