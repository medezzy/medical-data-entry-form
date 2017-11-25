package sample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Data {
    private String sectionName;
    private String subSectionName;
    private String genericName;
    private SafetyAlerts safetyAlerts;
    private List<Indications> indications;
    private List<Brands> brands;

    public Data(String sectionName, String subSectionName, String genericName, SafetyAlerts safetyAlerts, List<Indications> indications,List<Brands> brands) {
        this.sectionName = sectionName;
        this.subSectionName = subSectionName;
        this.genericName = genericName;
        this.safetyAlerts = safetyAlerts;
        this.indications = indications;
        this.brands = brands;
    }

    public List<Brands> getBrands() {
        return brands;
    }

    public void setBrands(List<Brands> brands) {
        this.brands = brands;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSubSectionName() {
        return subSectionName;
    }

    public void setSubSectionName(String subSectionName) {
        this.subSectionName = subSectionName;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public SafetyAlerts getSafetyAlerts() {
        return safetyAlerts;
    }

    public void setSafetyAlerts(SafetyAlerts safetyAlerts) {
        this.safetyAlerts = safetyAlerts;
    }

    public List<Indications> getIndications() {
        return indications;
    }

    public void setIndications(List<Indications> indications) {
        this.indications = indications;
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return "{" +
                "'sectionName':'" + sectionName + '\'' +
                ", 'subSectionName':'" + subSectionName + '\'' +
                ", 'genericName':'" + genericName + '\'' +
                ", 'safetyAlerts':" + safetyAlerts +
                ", 'indications':" + indications +
                ", 'brands':" + brands +
                ", 'date':'"+ dateFormat.format(date) + '\'' +
                '}';
    }
}
