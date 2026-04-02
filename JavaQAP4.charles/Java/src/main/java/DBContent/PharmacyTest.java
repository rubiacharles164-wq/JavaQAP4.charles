package DBContent;

public class PharmacyTest {

    public static void main(String[] args) {
        PatientService patientService = new PatientService();
        Patient patient = new Patient("PatientFName", "PatientLName", "PatientDOB");
        patientService.saveNewPatient(patient);

        DrugService drugService = new DrugService();
        Drug drug = new Drug("DrugName", "DrugCost", "Dosage");
        drugService.saveNewDrug(drug);
    }
}
