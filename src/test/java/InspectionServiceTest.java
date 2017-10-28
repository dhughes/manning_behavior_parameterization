import bean.Inspection;
import org.junit.Test;
import service.InspectionService;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class InspectionServiceTest {

    @Test
    public void canInstantiateService() throws IOException {
        // arrange
        InspectionService service = new InspectionService(getClass().getResource("test_inspections.json").getFile());

        // act

        // assert
        assertThat(service, instanceOf(InspectionService.class));
    }

    @Test
    public void canListInspections() throws IOException {
        // arrange
        InspectionService service = new InspectionService(getClass().getResource("test_inspections.json").getFile());

        // act
        List<Inspection> inspections = service.listInspections();

        // assert
        assertThat(inspections.size(), is(50));
    }

    @Test
    public void canLoadInspections() throws IOException {
        // arrange
        InspectionService service = new InspectionService(getClass().getResource("test_inspections.json").getFile());

        // act
        List<Inspection> inspections = service.listInspections();
        Inspection inspection0 = inspections.get(0);
        Inspection inspection6 = inspections.get(6);

        // assert
        assertThat(inspection0.getDba(), is("MORRIS PARK BAKE SHOP"));
        assertThat(inspection0.getCuisineDescription(), is("Bakery"));
        assertThat(inspection6.getDba(), is("WENDY'S"));
    }
}
