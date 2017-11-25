package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Presentation {
    private StringProperty type;
    private StringProperty unit;
    private StringProperty price;

    public Presentation(String type, String unit, String price) {
        this.type = new SimpleStringProperty(type);
        this.unit = new SimpleStringProperty(unit);
        this.price = new SimpleStringProperty(price);
    }

    public String getType() {
        return type.get();
    }

    public StringProperty typeProperty() {
        return type;
    }

    public void setType(String type) {
        this.type.set(type);
    }

    public String getUnit() {
        return unit.get();
    }

    public StringProperty unitProperty() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit.set(unit);
    }

    public String getPrice() {
        return price.get();
    }

    public StringProperty priceProperty() {
        return price;
    }

    public void setPrice(String price) {
        this.price.set(price);
    }

    @Override
    public String toString() {
        return "{" +
                "'type':'" + type.get() + '\'' +
                ", 'unit':'" + unit.get() + '\'' +
                ", 'price':'" + price.get() + '\'' +
                '}';
    }
}
