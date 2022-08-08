package creational.immutable;

public final class ImmutablePoint {
    private final double x;
    private final double y;

    private final int[] coord;

    public ImmutablePoint(double x, double y, int[] coord) {

        this.x = x;
        this.y = y;

        this.coord = new int[coord.length];
        for (int i = 0; i < coord.length; i++) {
            this.coord[i] = coord[i];
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int[] getCoord() {
        int[] tempCoord = new int[coord.length];
        for (int i = 0; i < tempCoord.length; i++) {
            tempCoord[i] = this.coord[i] ;
        }
        return tempCoord;
    }


    public ImmutablePoint setX(double x) {
        return new ImmutablePoint(x, y, coord);
    }

    public ImmutablePoint setY(double y) {
        return new ImmutablePoint(x, y, coord);
    }

    @Override
    public String toString() {
        return "ImmutablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
