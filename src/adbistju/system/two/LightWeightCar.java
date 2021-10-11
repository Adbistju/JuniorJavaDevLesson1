package adbistju.system.two;

class LightWeightCar extends Car implements Moveable,MoveHatches{

    @Override
    public void open() {
        System.out.println("Car is open");
    }

    @Override
    public void close() {
        System.out.println("Car is close");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Car is stop");
    }

}
