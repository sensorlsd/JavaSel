package src;

import org.json.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONObject {

    public static void main(String[] args) throws IOException {


        String pathFile = "C:\\Users\\Dmitry.Nahliuk\\IdeaProjects\\autoBDD\\src\\test\\java\\src\\sw_gg.json";


        String file = new String(Files.readAllBytes(Paths.get(pathFile)));



        System.out.println(file);
    }
}
