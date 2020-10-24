# Factory Method Design Pattern (Java)
**Factory Method** create objects without specifying the class of the object.
![](https://github.com/shamy1st/design-pattern-factory/blob/main/uml.png)

### Problem:
You want to create **Shape** and treat it without knowing its type (Circle, Rectangle, Square).

    public class Main {
        public static void main(String[] args) {
            ShapeFactory shapeFactory = new ShapeFactory();
            Shape shape1 = shapeFactory.getShape("CIRCLE");
            Shape shape2 = shapeFactory.getShape("RECTANGLE");
            shape1.draw();
            shape2.draw();
        }
    }
### Solution:
![](https://github.com/shamy1st/design-pattern-factory/blob/main/uml-solution.png)
