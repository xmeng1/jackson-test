import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import org.apache.commons.io.FileUtils
import spock.lang.Narrative
import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Title

import java.time.LocalDate
import java.time.LocalTime
import java.time.ZonedDateTime
/**
 * User:    mengxin
 * Date:    05/07/17
 * Project: jackson-examples
 * Package: 
 * Description: JsonTypeInfoSpec.
 * @author mengxin
 * @version 1.0
 */

@Narrative("""
""")
@Title("Unit test for JsonTypeInfoSpec")
@Subject(JsonTypeInfoSpec)
class JsonTypeInfoSpec extends Specification {
    private static String outputFile = "demoInfo_zoneDate.json"

    def "test"() {
        given: "information"
        DemoInfo demoInfo = new DemoInfo()
        demoInfo.setName("test")
        LocalDate localDate = LocalDate.now()//new LocalDate(2017, 7, 5)
        LocalTime localTime = LocalTime.now()//new LocalTime(12, 1, 1, 1)
        demoInfo.setDate(ZonedDateTime.now())
        and: "information"

        when: "when"
        JavaTimeModule javaTimeModule = new JavaTimeModule()
        ObjectMapper mapper = new ObjectMapper()
        mapper.registerModule(javaTimeModule)
        mapper.writerWithDefaultPrettyPrinter().writeValue(new FileWriter(new File(outputFile)), demoInfo)

        then: "then"
    }

    def "read"() {
        given: "information"
        File file = new File(getClass().getResource("demoInfo_zoneDate.json").getFile())
        String json = FileUtils.readFileToString(file, "UTF-8")

        when: "when"

        JavaTimeModule javaTimeModule = new JavaTimeModule()
        ObjectMapper mapper = new ObjectMapper()
        mapper.registerModule(javaTimeModule)
        DemoInfo itemWithOwner = mapper.readValue(json, DemoInfo.class)
        itemWithOwner.getName()
        itemWithOwner.getDate()
        then: "then"
    }

    def "read3"() {
        given: "information"
        File file = new File(getClass().getResource("demoInfo_zoneDate.json").getFile())
        String json = FileUtils.readFileToString(file, "UTF-8")

        when: "when"

        JavaTimeModule javaTimeModule = new JavaTimeModule()
        ObjectMapper mapper = new ObjectMapper()
        mapper.registerModule(javaTimeModule)
        DemoInfo2 itemWithOwner = mapper.readValue(json, DemoInfo2.class)
        itemWithOwner.getName()
        itemWithOwner.getDate()
        then: "then"
    }
}