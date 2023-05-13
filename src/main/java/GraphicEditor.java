package main.java;

import main.java.shape.*;

public class GraphicEditor {
    public void namePrint() {
        Shape sguare = new Square();
        Shape rhombus  = new Rhombus ();
        Shape parallelogram = new Parallelogram();
        Shape rectangle = new Rectangle();
        Shape trapezium = new Trapezium();

        sguare.printName();

        rhombus.printName();

        parallelogram.printName();

        rectangle.printName();

        trapezium.printName();

    }
}
