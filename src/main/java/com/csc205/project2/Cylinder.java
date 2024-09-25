package com.csc205.project2;

public class Cylinder extends Shape{

    //instance variables
    private double height;
    private double radius;

    //constructor
    public Cylinder(){

        super ();
        this.height = 0.0;
        this.radius = 0.0;

    }

    //parameterized constructor
    public Cylinder(double h, double r){

        super ();
        this.height = h;
        this.radius = r;
    }

    //getter
    public double getHeight(){ return height; }

    //getter
    public double getRadius(){ return radius; }

    //setter
    public void setHeight(double height){ this.height = height; }

    //setter
    public void setRadius(double radius){ this.radius = radius; }

    //surface area
    public double surfaceArea() { return (2 * Math.PI* radius * height) + (2 * Math.PI * Math.pow(radius, 2)); }

    //volume
    public double volume() { return height * Math.PI * Math.pow(radius, 2); }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sphere {");
        sb.append("height = ").append(height);
        sb.append(", radius = ").append(radius);
        sb.append(", surface area = ").append(surfaceArea());
        sb.append(", volume = ").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
