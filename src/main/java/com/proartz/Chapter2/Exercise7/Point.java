package com.proartz.Chapter2.Exercise7;

/**
 * Obiekt <code>Point</code> opisuję punkt na płaszczyżnie 2D
 * @author Marcin Filipowski
 * @version 0.1
 */
public class Point {

    private double x;
    private double y;

    public Point() {
        this(0, 0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    /**
     * Metoda modyfikuję współrzędne <code>x</code> i <code>y</code> dodając do nich
     * wartość przekazaną w parametrach
     *
     * @param x współrzędna x
     * @param y współrzędna y
     */
    public void translate(double x, double y) {
        this.x += x;
        this.y += y;
    }

    /**
     * Metoda skaluję wartości parametrów o podane <code>ratio</code>
     * @param ratio współczynnik skalowania
     */
    public void scale(double ratio) {
        x *= ratio;
        y *= ratio;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
