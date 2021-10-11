package adbistju.system.three.models;

public abstract class Figure {
    private float radius;
    private float width;
    private float height;
    private double area;
    private int angle;

    public Figure() {
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setRadius() {

    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setArea() {
        //this.area = 0;
//        if(angle == 4){
//            this.area = width*height;
//        } else if (angle == 3){
//            this.area = width*height/2;
//        } else if ( angle == 0) {
//            this.area = width*height*3.14159f;
//        } else if(angle >= 5){
//            this.area = ((double)1/2)*(radius*radius)*angle*Math.sin(Math.toRadians((double) 360/angle));
//        }
    }

    public void drawFigure(){
        System.out.println(this.getClass()+ " is draw");
    }

    public void calculation(){
        setArea();
        setRadius();
    }
}
