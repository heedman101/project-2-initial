package com.csc205.project2;

public class Cube extends Shape{

    //instance variable
    private double width;

    //constructor
    public Cube(){
        super();
        this.width = 0.0;
    }

    //parameterized constructor
    public Cube(double w){
        super();
        this.width = w;
    }

    //getter
    public double getWidth() { return width; }

    //setter
    public void setWidth(double width) { this.width = width; }

    //Surface Area of a Cube
    public double surfaceArea() { return 6.0 * Math.pow(width, 2); }

    //volume
    public double volume() { return 3.0 * width; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width = ").append(width);
        sb.append(", surface area = ").append(surfaceArea());
        sb.append(", volume = ").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
