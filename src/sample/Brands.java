package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.LinkedList;
import java.util.List;

public class Brands {
    private StringProperty medicineName;
    private StringProperty manufacturerName;
    private StringProperty contents;
    private List<Presentation> presentations;
    private StringProperty comments;

    public Brands(String medicineName, String manufacturerName, String contents, String comments, List<Presentation> presentations) {
        this.medicineName = new SimpleStringProperty(medicineName);
        this.manufacturerName = new SimpleStringProperty(manufacturerName);
        this.contents = new SimpleStringProperty(contents);
        this.comments = new SimpleStringProperty(comments);
        this.presentations = new LinkedList<Presentation>(presentations);
    }

    public String getMedicineName() {
        return medicineName.get();
    }

    public StringProperty medicineNameProperty() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName.set(medicineName);
    }

    public String getManufacturerName() {
        return manufacturerName.get();
    }

    public StringProperty manufacturerNameProperty() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName.set(manufacturerName);
    }

    public String getContents() {
        return contents.get();
    }

    public StringProperty contentsProperty() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents.set(contents);
    }

    public List<Presentation> getPresentations() {
        return presentations;
    }

    public void setPresentations(List<Presentation> presentations) {
        this.presentations = presentations;
    }

    public String getComments() {
        return comments.get();
    }

    public StringProperty commentsProperty() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments.set(comments);
    }

    @Override
    public String toString() {
        return "{" +
                "'medicineName':'" + medicineName.get() + '\'' +
                ", 'manufacturerName':'" + manufacturerName.get() + '\'' +
                ", 'contents':'" + contents.get() + '\'' +
                ", 'comments':'" + comments.get() + '\'' +
                ", 'presentation':" + presentations +
                '}';
    }
}
