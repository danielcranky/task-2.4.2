package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private int series;
    private int horsePower;

    public Car(String model, int series, int horsePower) {
        this.model = model;
        this.series = series;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
