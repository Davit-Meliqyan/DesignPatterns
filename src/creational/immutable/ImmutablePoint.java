package creational.immutable;

public final class ImmutablePoint {
    private final double x;
    private final double y;


    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public ImmutablePoint() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public  ImmutablePoint setX( double x){
        return new ImmutablePoint(x,y);
    }

    public  ImmutablePoint setY( double y) {
        return new ImmutablePoint(x, y);
    }

    @Override
    public String toString() {
        return "ImmutablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
