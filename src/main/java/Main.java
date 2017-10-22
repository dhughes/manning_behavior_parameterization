import java.io.IOException;
import java.text.DateFormat;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws IOException {
        // load the inspection service
        InspectionService service = new InspectionService(Main.class.getResource("nyc_restaurant_inspections.json").getFile());

        // print report
        printInspections(service.listInspections());

    }

    public static void printInspections(List<Inspection> inspections){

        for (Inspection inspection : inspections){
            System.out.printf("\033[0;1m%s\033[0m\n" +
                            "\tBoro: %s\n" +
                            "\tCuisine: %s\n" +
                            "\tInsp. Date: %s\n" +
                            "\tScore: %s\n" +
                            "\tGrade: %s\n" +
                            "\tViolation: %s\n\n",
                    inspection.getDba(),
                    inspection.getBoro(),
                    inspection.getCuisineDescription(),
                    DateFormat.getDateInstance().format(inspection.getInspectionDate()),
                    inspection.getScore(),
                    inspection.getGrade(),
                    inspection.getViolationDescription());
        }

        System.out.printf("Listed %s inspections\n", inspections.size());

    }
}
