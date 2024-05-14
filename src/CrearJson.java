import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class CrearJson {
    public void generarJson (Moneda moneda) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(moneda.base_code() + moneda.target_code() + ".json");
        escritura.write(gson.toJson(moneda));
        escritura.close();
    }
}
