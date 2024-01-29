package task2.geometric_figure;

public abstract class GeometricFigure {
    public String figureName;

    public GeometricFigure(String figureName) {
        this.figureName = figureName;
    }

    public abstract double calculateSquare();
    public abstract double calculatePerimeter();
}
