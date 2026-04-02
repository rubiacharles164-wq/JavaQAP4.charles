package DBContent;

public class PatientService {

    private static PatientInsert patientInsert = new PatientInsert();

    public void saveNewPatient(Patient patient) {

        if(patient.getPatientFName().isEmpty() || patient.getPatientLName().isEmpty() || patient.getPatientDOB().isEmpty())
            throw new IllegalArgumentException("First Name, Last Name, and Date of Birth cannot be empty");
        patientInsert.saveNewPatientToDB(patient);
    }
}
