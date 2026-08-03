public class Card {

    enum COLOR {
        RED,
        GREEN,
        PURPLE
    }
    
    enum SHAPE {
        OVAL,
        SQUIGGLE,
        DIAMOND
    }

    enum COUNT {
        ONE,
        TWO,
        THREE
    }

    enum SHADING {
        SOLID,
        STRIPED,
        OPEN
    }

    private COLOR color;
    private SHAPE shape;
    private COUNT count;
    private SHADING shading;

    public Card(COLOR color, SHAPE shape, COUNT count, SHADING shading) {
        this.color = color;
        this.shape = shape;
        this.count = count;
        this.shading = shading;
    }

    public COLOR getColor() {
        return color;
    }

    public SHAPE getShape() {
        return shape;
    }

    public COUNT getCount() {
        return count;
    }

    public SHADING getShading() {
        return shading;
    }

    public String toString() {
        return "Card{" +
                "color=" + color +
                ", shape=" + shape +
                ", count=" + count +
                ", shading=" + shading +
                '}';
    }

}