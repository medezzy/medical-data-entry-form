package sample;

public class SafetyAlerts {
    private String contractions;
    private String specialPrecautions;
    private String interactions;
    private String adverseDrugReactions;

    public SafetyAlerts(String contractions, String specialPrecautions, String interactions, String adverseDrugReactions) {
        this.contractions = contractions;
        this.specialPrecautions = specialPrecautions;
        this.interactions = interactions;
        this.adverseDrugReactions = adverseDrugReactions;
    }

    @Override
    public String toString() {
        return "{" +
                "'contractions':'" + contractions + '\'' +
                ", 'specialPrecautions':'" + specialPrecautions + '\'' +
                ", 'interactions':'" + interactions + '\'' +
                ", 'adverseDrugReactions':'" + adverseDrugReactions + '\'' +
                '}';
    }

    public String getContractions() {
        return contractions;
    }

    public void setContractions(String contractions) {
        this.contractions = contractions;
    }

    public String getSpecialPrecautions() {
        return specialPrecautions;
    }

    public void setSpecialPrecautions(String specialPrecautions) {
        this.specialPrecautions = specialPrecautions;
    }

    public String getInteractions() {
        return interactions;
    }

    public void setInteractions(String interactions) {
        this.interactions = interactions;
    }

    public String getAdverseDrugReactions() {
        return adverseDrugReactions;
    }

    public void setAdverseDrugReactions(String adverseDrugReactions) {
        this.adverseDrugReactions = adverseDrugReactions;
    }
}
