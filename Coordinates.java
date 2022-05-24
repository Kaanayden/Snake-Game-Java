import java.util.Random;

public class Coordinates{
    private int x;
    private int y;

    public Coordinates(int x, int y){
        setX(x);
        setY(y);
    }
    public Coordinates(Coordinates c){
        setX(c.getX());
        setY(c.getY());
    }
    private void setX(int x){
        this.x = x;
    }
    private void setY(int y){
        this.y = y;
    }
    private int getX(){
        return this.x;
    }
    private int getY(){
        return this.y;
    }
    public static Coordinates randomCoordinates (int column, int row){
        Random random = new Random();
        int x1 = random.nextInt(column-1) + 1;
        int y1 = random.nextInt(column-1) + 1;
        return new Coordinates(x1, y1);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Coordinates){
<<<<<<< HEAD
            Coordinates c = (Coordinates) obj;
=======
            Coordinates c = (Coordinates)obj;
>>>>>>> 142a92303fe1f4c3083146417d8955c14c9fcb7e
            if ((c.getX() == this.x) && c.getY() == this.y) {
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "[" + this.x + ", " + this.y + "]";
    }
}
