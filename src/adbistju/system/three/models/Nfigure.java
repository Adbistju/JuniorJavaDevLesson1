package adbistju.system.three.models;

public class Nfigure extends Figure{
    public Nfigure(float radius,int angle) {
        this.setWidth(radius*2);
        this.setHeight(radius*2);
        this.setRadius(radius);
        this.setAngle(angle);
        calculation();
    }

    @Override
    public void setAngle(int angle) {
        super.setAngle(angle);
        calculation();
    }

    @Override
    public void setRadius(float radius) {
        super.setRadius(radius);
        super.setWidth(radius*2);
        super.setHeight(radius*2);
        calculation();
    }

    @Override
    public void setWidth(float width) {
        super.setWidth(width);
        super.setHeight(width);
        super.setRadius(width/2);
        calculation();
    }

    @Override
    public void setHeight(float height) {
        super.setHeight(height);
        super.setWidth(height);
        super.setRadius(height/2);
        calculation();
    }

    public void setAreaNfigure(){
        this.setArea(((double)1/2)*(Math.pow(this.getRadius(),2))*this.getAngle()*Math.sin(Math.toRadians((double) 360/this.getAngle())));
    }

    @Override
    public void setArea(){
        setAreaNfigure();
    }

    @Override
    public String toString() {
        return "Nfigure{ radius: "+this.getRadius()+" height: "+this.getHeight()+" width: "+this.getWidth()+" area: "+this.getArea()+" angle: "+this.getAngle()+"}";
    }
}
