package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Indications {
    private final StringProperty route;
    private final StringProperty dosage;
    private final StringProperty otherComments;


    public Indications(String route, String dosage, String otherComments) {
        this.route = new SimpleStringProperty(route);
        this.dosage = new SimpleStringProperty(dosage);
        this.otherComments = new SimpleStringProperty(otherComments);
    }

    public String getRoute() {
        return route.get();
    }

    public StringProperty routeProperty() {
        return route;
    }

    public void setRoute(String route) {
        this.route.set(route);
    }

    public String getDosage() {
        return dosage.get();
    }

    public StringProperty dosageProperty() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage.set(dosage);
    }

    public String getOtherComments() {
        return otherComments.get();
    }

    public StringProperty otherCommentsProperty() {
        return otherComments;
    }

    public void setOtherComments(String otherComments) {
        this.otherComments.set(otherComments);
    }

    @Override
    public String toString() {
        return "{" +
                "'route':'" + route.get() + '\'' +
                ", 'dosage':'" + dosage.get() + '\'' +
                ", 'otherComments':'" + otherComments.get() + '\'' +
                '}';
    }
}
