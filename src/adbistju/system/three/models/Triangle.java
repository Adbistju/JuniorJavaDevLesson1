package adbistju.system.three.models;

public class Triangle extends Figure{
    public Triangle(float width, float height) {
        this.setWidth(width);
        this.setHeight(height);
        this.setAngle(3);
        calculation();
    }

    private void setAreaTriangle(){
        this.setArea((this.getWidth()*this.getHeight())/2);
    }

    private void setRadiusTriangle(){
        this.setRadius((float) Math.sqrt(Math.pow(this.getWidth(),2)+Math.pow(this.getHeight(),2))/2);
    }

    @Override
    public void setRadius() {
        setRadiusTriangle();
    }

    @Override
    public void setArea() {
        setAreaTriangle();
    }

    @Override
    public void setWidth(float width) {
        super.setWidth(width);
        calculation();
    }

    @Override
    public void setHeight(float height) {
        super.setHeight(height);
        calculation();
    }

    @Override
    public String toString() {
        return "Triangle{ height: "+this.getHeight()+" width: "+this.getWidth()+" area: "+this.getArea()+"}";
    }
}
