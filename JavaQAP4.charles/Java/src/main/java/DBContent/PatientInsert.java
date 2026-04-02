package DBContent;

import Databse.DBConnection;


public class PatientInsert {
    public void saveNewPatientToDB(Patient patient) {
        String sql =  "INSERT INTO patient(patientfname, patientlname, patientdob) VALUES (?,?,?)";

        try (var connections = DBConnection.getConnection();
            var preparedStatement = connections.prepareStatement(sql)) {
            preparedStatement.setString(1, patient.getPatientFName());
            preparedStatement.setString(2, patient.getPatientLName());
            preparedStatement.setString(3, patient.getPatientDOB());
            preparedStatement.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
            String message = "Error Saving Patient";
        }
    }

}
