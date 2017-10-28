package service;

import bean.Inspection;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class InspectionService {
    private List<Inspection> inspections;

    public InspectionService(String file) throws IOException {
        String json = new String(Files.readAllBytes(Paths.get(file)));

        Type inspectionListType = new TypeToken<List<Inspection>>(){}.getType();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss")
                .create();

        inspections = gson.fromJson(json, inspectionListType);
    }

    public List<Inspection> listInspections() {
        return inspections;
    }

}
