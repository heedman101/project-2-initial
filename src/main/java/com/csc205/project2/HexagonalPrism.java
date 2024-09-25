package com.csc205.project2;

public class HexagonalPrism extends Shape{

    //instance variables
    private double baseEdge;
    private double height;

    //constructor
    public HexagonalPrism(){
        super();
        this.baseEdge = 0.0;
        this.height = 0.0;
    }

    //parameterized constructor
    public HexagonalPrism(double b, double h){
        super();
        this.baseEdge = b;
        this.height = h;
    }

    //getter
    public double getBaseEdge() { return baseEdge; }

    //getter
    public double getHeight() { return height; }

    //setter
    public void setBaseEdge() { this.baseEdge = baseEdge; }

    //setter
    public void setHeight() { this.height = height; }

    //surface area
    public double surfaceArea() { return((6* baseEdge * height)+ (3*(Math.sqrt(3))*(Math.pow(baseEdge, 2)))); }

    //volume
    public double volume() { return((3*Math.sqrt(3)/2)*(Math.pow(baseEdge, 2)*height)); }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("Hexagonal Prism {");
        sb.append("base edge = ").append(baseEdge);
        sb.append(", height = ").append(height);
        sb.append(", surface area = ").append(surfaceArea());
        sb.append(", volume = ").append(volume());
        sb.append('}');
        return sb.toString();

    }
}

