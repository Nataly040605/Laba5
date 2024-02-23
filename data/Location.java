package data;

public class Location {
	private final Integer x; //Поле не может быть null
    private final float y; //Поле не может быть null
    private final long z; //Поле не может быть null
    
    public Location(Integer x, float y, long z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Integer getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public long getZ() {
        return z;
    }

}
