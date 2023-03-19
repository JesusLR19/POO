public class Main {

    public static void main (String [] args) {
        Circle circle1 = new Circle(10, 10, 20);
        Circle circle2 = new Circle(15, 15, 21);

//        int resultCircles = circle1.calculateArea(); compareTo circle2.calculateArea(););
//        int resultCircles = circle1.calculateArea().compareTo(circle2.calculateArea());
//        int resultCircles = Double.compare(circle1.calculateArea(), circle2.calculateArea());
//
        int resultCircles = Double.compare(circle1.calculateArea(), circle2.calculateArea());
        if (resultCircles < 0) {
            System.out.println("El circulo 2 tiene un area mayor que el circulo 1");
        } else if (resultCircles > 0) {
            System.out.println("El circulo 1 tiene un area mayor que el circulo 2");
        } else {
            System.out.println("Los dos circulos tienen la misma area");
        }


        Rectangle rec1 = new Rectangle (10, 10, 20, 20);
        Rectangle rec2 = new Rectangle (30, 30, 50, 50);

//        int resultRecs = rec1.calculateArea().compareTo(rec2.calculateArea());
//        int resultRecs = Double.compare(rec1.calculateArea(), circle2.calculateArea());
        int resultRecs = Double.compare(rec1.calculateArea(), rec2.calculateArea());
        if (resultRecs < 0) {
            System.out.println("El rectangulo 2 tiene un area mayor que el rectangulo 1");
        } else if (resultRecs > 0) {
            System.out.println("El rectangulo 1 tiene un area mayor que el rectangulo 2");
        } else {
            System.out.println("Los dos rectangulos tienen la misma area");
        }
    }

}