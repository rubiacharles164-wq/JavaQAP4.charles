package DBContent;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteToFile {
    public void WriteFile(Drug drug) {
        new Drug("ibuprofen", "15.49", "2 every 6 hours");
        try {
            Files.writeString(Path.of("Info.txt"), drug.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


