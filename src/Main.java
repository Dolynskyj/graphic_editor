import main.java.GraphicEditor;
import main.java.shape.*;

public class Main {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        Shape parallelogram = new Parallelogram();
        Shape rectangle = new Rectangle();
        Shape rhombus = new Rhombus();
        Shape square = new Square();
        Shape trapezium = new Trapezium();
        graphicEditor.namePrint(parallelogram);
        graphicEditor.namePrint(rectangle);
        graphicEditor.namePrint(rhombus);
        graphicEditor.namePrint(square);
        graphicEditor.namePrint(trapezium);
    }
}