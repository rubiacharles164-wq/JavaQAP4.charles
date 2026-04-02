package DBContent;

import Databse.DBConnection;

public class DrugInsert {
        public void saveNewDrugToDB(Drug drug) {
            String sql =  "INSERT INTO Drug(Drugname, DrugCost, Dosage) VALUES (?,?,?)";

            try (var connections = DBConnection.getConnection();
                 var preparedStatement = connections.prepareStatement(sql)) {
                preparedStatement.setString(1, drug.getDrugName());
                preparedStatement.setString(2, drug.getDrugCost());
                preparedStatement.setString(3, drug.getDosage());
                preparedStatement.executeUpdate();
            }
            catch (Exception e) {
                e.printStackTrace();
                String message = "Error Saving Drug";
            }
        }


}
