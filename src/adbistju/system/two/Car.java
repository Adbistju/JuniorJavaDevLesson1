package adbistju.system.two;

abstract class Car {
    public Engine engine;
    private Color color;
    private String name;


    protected void start() {
        System.out.println("Car starting");
    }

    abstract void open();

    abstract void close();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

