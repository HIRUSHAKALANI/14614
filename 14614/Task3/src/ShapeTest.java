public class ShapeTest {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        // Test various shapes
        Shape square = shapeFactory.getShape("SQUARE");
        if (square != null) {
            System.out.println("Square:");
            square.draw();
            System.out.println();
        }
        Shape circle = shapeFactory.getShape("CIRCLE");
        if (circle != null) {
            System.out.println("Circle:");
            circle.draw();
            System.out.println();
        }
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        if (rectangle != null) {
            System.out.println("Rectangle:");
            rectangle.draw();
            System.out.println();
        }
        // Test invalid shape
        Shape invalidShape = shapeFactory.getShape("PENTAGON");
        if (invalidShape != null){
            invalidShape.draw();
        }
    }
}
