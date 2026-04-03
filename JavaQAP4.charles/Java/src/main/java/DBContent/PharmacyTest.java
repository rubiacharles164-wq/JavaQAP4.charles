package DBContent;

import Databse.DBConnection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.*;
import java.util.ArrayList;

public class PharmacyTest {

    public static void main(String[] args) throws IOException, SQLException {
        //PatientService patientService = new PatientService();
        //Patient patient = new Patient("Charles", "Rubia", "2006/01/07");
        //patientService.saveNewPatient(patient);

       //WriteToFile writeToFile = new WriteToFile();
        //Drug drug = new Drug("ibuprofen", "15.49", "2 every 6 hours");
        //writeToFile.WriteFile(drug);


        //String content = Files.readString(Path.of("info.txt"));
        //System.out.println(content);


        ArrayList<Patient> patientlist = new ArrayList<Patient>();
        String query = " SELECT * FROM patient ";

        try{

            Connection connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet rs = statement.executeQuery();

            while(rs.next()){
                Patient temp = new Patient();
                temp.setPatientID(rs.getInt("patientid"));
                temp.setPatientFName(rs.getString("patientFName"));
                temp.setPatientLName(rs.getString("patientLName"));
                temp.setPatientDOB(rs.getString("patientDOB"));
                patientlist.add(temp);
                }
            connection.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println(patientlist);
    }
}
