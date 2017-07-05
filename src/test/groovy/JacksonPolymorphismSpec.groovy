import com.fasterxml.jackson.databind.ObjectMapper
import spock.lang.Narrative
import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Title

/**
 * User:    mengxin
 * Date:    04/07/17
 * Project: jackson-examples
 * Package: 
 * Description: JacksonPolymorphism.
 * @author mengxin
 * @version 1.0
 */

@Narrative("""
""")
@Title("Unit test for JacksonPolymorphism")
@Subject(JacksonPolymorphismSpec)
class JacksonPolymorphismSpec extends Specification {

    private static String outputFile = "zoo.json"

    def "test"() {
        given: "information"
        // let start creating the zoo
        Zoo zoo = new Zoo("Samba Wild Park", "Paz");
        Lion lion = new Lion("Simba");
        Elephant elephant = new Elephant("Manny");
        List<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(elephant);
        zoo.setAnimals(animals);

        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new FileWriter(new File(outputFile)), zoo);

        and: "information"

        when: "when"

        then: "then"
    }
}