package DBContent;

public class Drug {
    private int DrugID;
    private String DrugName;
    private String DrugCost;
    private String Dosage;

    public Drug(int DrugID, String DrugName, String DrugCost, String Dosage) {
        this.DrugID = DrugID;
        this.DrugName = DrugName;
        this.DrugCost = DrugCost;
        this.Dosage = Dosage;
    }

    public Drug(String drugName, String drugCost, String dosage) {
        DrugName = drugName;
        DrugCost = drugCost;
        Dosage = dosage;
    }

    public Drug() {
    }

    public int getDrugID() {
        return DrugID;
    }

    public void setDrugID(int drugID) {
        DrugID = drugID;
    }

    public String getDrugName() {
        return DrugName;
    }

    public void setDrugName(String drugName) {
        DrugName = drugName;
    }

    public String getDrugCost() {
        return DrugCost;
    }

    public void setDrugCost(String drugCost) {
        DrugCost = drugCost;
    }

    public String getDosage() {
        return Dosage;
    }

    public void setDosage(String dosage) {
        Dosage = dosage;
    }

    @Override
    public String toString() {
        return "DrugTable{" +
                "DrugID=" + DrugID +
                ", DrugName='" + DrugName + '\'' +
                ", DrugCost='" + DrugCost + '\'' +
                ", Dosage='" + Dosage + '\'' +
                '}';
    }
}
