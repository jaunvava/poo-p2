public class Questao04 {
    public final static class CalculoGeometrico{
        private static final double PI = Math.PI;

        public static double circleArea(double radius) {
            return PI * radius * radius;
        }

        public static double rectangleArea(double width, double height) {
            return width * height;
        }

        public static double triangleArea(double base, double height) {
            return (base * height) / 2;
        }

        public static double circlePerimeter(double radius) {
            return 2 * PI * radius;
        }

        public static boolean isValidTriangle(double a, double b, double c) {
            return (a + b > c) && (b + c > a) && (a + c > b);
        }
    }

    public static abstract class Shape {
        protected final String name;
        protected final String color;

        protected Shape(String name, String color) {
            this.name = name;
            this.color = color;
        }

        public abstract double calculateArea();
        public abstract double calculatePerimeter();

        public final String getDescription() {
            return "Forma: " + name + ", Cor: " + color;
        }
    }

    public static class Circle extends Shape {
        private final double radius;

        public Circle(String name, String color, double radius) {
            super(name, color);
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return CalculoGeometrico.circleArea(radius);
        }

        @Override
        public double calculatePerimeter() {
            return CalculoGeometrico.circlePerimeter(radius);
        }
    }

    public static class Rectangle extends Shape {
        private final double width;
        private final double height;

        public Rectangle(String name, String color, double width, double height) {
            super(name, color);
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return CalculoGeometrico.rectangleArea(width, height);
        }

        @Override
        public double calculatePerimeter() {
            return 2 * (width + height);
        }
    }

    public static void main(String[] args) {
        System.out.println("Área círculo r=5: " + CalculoGeometrico.circleArea(5));
        System.out.println("É triângulo válido? " + CalculoGeometrico.isValidTriangle(3, 4, 5));

        Circle circle = new Circle("Círculo1", "Vermelho", 5.0);
        Rectangle rectangle = new Rectangle("Retângulo1", "Azul", 4.0, 6.0);

        System.out.println(circle.getDescription());
        System.out.println("Área: " + circle.calculateArea());

        System.out.println(rectangle.getDescription());
        System.out.println("Área: " + rectangle.calculateArea());
    }
}
