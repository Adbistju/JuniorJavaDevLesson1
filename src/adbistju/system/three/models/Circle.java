package adbistju.system.three.models;

public class Circle extends Figure{

    public Circle(float radius) {
        this.setRadius(radius);
        calculation();
    }

    private void setAreaCircle(){
        this.setArea(Math.pow(this.getRadius(),2)*Math.PI);
    }

    @Override
    public void setArea(){
        setAreaCircle();
    }

    @Override
    public void setRadius(float radius) {
        super.setRadius(radius);
//        super.setWidth(radius*2);
//        super.setHeight(radius*2);
        calculation();
    }

    @Override
    public String toString() {
        return "Circle{ radius: "+this.getRadius()+" area: "+this.getArea()+" }";
    }
}
