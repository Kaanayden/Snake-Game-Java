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
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Coordinates){
            Coordinates c = (Coordinates) obj;
            if ((c.getX() == this.x) && c.getY() == this.y) {
                return true;
            }
        }
        return false;
    }
}
