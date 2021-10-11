package adbistju.system.three.models;

public class Square extends Figure{
    public Square(float width) {
        this.setWidth(width);
        this.setHeight(width);
        this.setAngle(4);
        calculation();
    }

    public void setAreaSquare(){
        this.setArea(this.getHeight()*this.getWidth());
    }

    @Override
    public void setWidth(float width) {
        super.setWidth(width);
        super.setHeight(width);
        calculation();
    }

    @Override
    public void setHeight(float height) {
        super.setHeight(height);
        super.setWidth(height);
        calculation();
    }

    @Override
    public void setArea(){
        setAreaSquare();
    }

    @Override
    public String toString() {
        return "Square{ height: "+this.getHeight()+" width: "+this.getWidth()+" area: "+this.getArea()+"}";
    }
}
