public class Figure {
    private final ColorType color;
    private final FigureType type;

    public Figure(ColorType color, FigureType type) {
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return color.toString().substring(0,1) + type.toString().substring(0,1);
    }
}
