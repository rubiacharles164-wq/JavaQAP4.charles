package DBContent;

public class DrugService {
    private static DrugInsert drugInsert = new DrugInsert();

    public void saveNewDrug(Drug drug) {

        if(drug.getDrugName().isEmpty() || drug.getDrugCost().isEmpty() || drug.getDosage().isEmpty())
            throw new IllegalArgumentException("Drug Name, Drug Cost, and Dosage cannot be empty");
        drugInsert.saveNewDrugToDB(drug);
    }
}
