package data;

public class Coordinates {
	private final double x; //Значение поля должно быть больше -557
    private final long y; //Поле не может быть null
    
    public Coordinates(double x, long y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public long getY() {
        return y;
    }

}
