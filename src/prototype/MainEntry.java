package prototype;

public class MainEntry {
    public static void main(String[] args) {
        Point pt1 = new Point().setX(0).setY(0);
        System.out.println(pt1.draw());

        Point pt2 = new Point().setX(100).setY(0);
        System.out.println(pt2.draw());

        Line line1 = new Line().setStartPoint(pt1).setEndPoint(pt2);
        System.out.println(line1.draw());

        Line lineCopy = (Line) line1.copy();

        Point pt3 = new Point().setX(100).setY(100);
        Point pt4 = new Point().setX(0).setY(100);

        Line line2 = new Line().setStartPoint(pt2).setEndPoint(pt3);
        Line line3 = new Line().setStartPoint(pt3).setEndPoint(pt4);
        Line line4 = new Line().setStartPoint(pt4).setEndPoint(pt1);

        Group rect = new Group("RECT");
        rect.addShape(line1).addShape(line2).addShape(line3).addShape(line4);

        Group cloneRect = (Group) rect.copy();
        cloneRect.moveOffset(100, 100);

        System.out.println(cloneRect.draw());
        System.out.println(rect.draw());
    }
}
