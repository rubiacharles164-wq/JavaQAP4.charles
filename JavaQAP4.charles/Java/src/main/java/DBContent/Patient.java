package DBContent;

public class Patient {
    private int PatientID;
    private String PatientFName;
    private String PatientLName;
    private String PatientDOB;


    public Patient(int patientID, String patientFName, String patientLName, String patientDOB) {
        PatientID = patientID;
        PatientFName = patientFName;
        PatientLName = patientLName;
        PatientDOB = patientDOB;
    }

    public Patient(String patientFName, String patientLName, String patientDOB) {
        PatientFName = patientFName;
        PatientLName = patientLName;
        PatientDOB = patientDOB;
    }

    public Patient() {
    }

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int patientID) {
        PatientID = patientID;
    }

    public String getPatientFName() {
        return PatientFName;
    }

    public void setPatientFName(String patientFName) {
        PatientFName = patientFName;
    }

    public String getPatientLName() {
        return PatientLName;
    }

    public void setPatientLName(String patientLName) {
        PatientLName = patientLName;
    }

    public String getPatientDOB() {
        return PatientDOB;
    }

    public void setPatientDOB(String patientDOB) {
        PatientDOB = patientDOB;
    }

    @Override
    public String toString() {
        return "PatientTable{" +
                "PatientID=" + PatientID +
                ", PatientFName='" + PatientFName + '\'' +
                ", PatientLName='" + PatientLName + '\'' +
                ", PatientDOB='" + PatientDOB + '\'' +
                '}';
    }
}
