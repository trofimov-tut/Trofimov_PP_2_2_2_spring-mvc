package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private int model;
    private String brend;

    public Car(int model, String brend) {
        this.model = model;
        this.brend = brend;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", brend='" + brend + '\'' +
                '}';
    }
}
