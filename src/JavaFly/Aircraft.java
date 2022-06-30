package JavaFly;

public class Aircraft {
private static int id;
private String model;
private String type;

    public Aircraft(String model, String type) {
        this.model = this.getClass().getSimpleName();
        this.type = type;
        id++;
    }

    public static int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }
}
