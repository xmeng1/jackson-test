import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

/**
 * User:    mengxin
 * Date:    05/07/17
 * Project: jackson-examples
 * Package: PACKAGE_NAME
 * Description: ItemDeserializer.
 *
 * @author mengxin
 * @version 1.0
 */
public class LocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime> {
    @Override
    public LocalDateTime deserialize(JsonParser jsonparser, DeserializationContext context)
            throws IOException, JsonProcessingException {
        String date = jsonparser.getText();

        JavaTimeModule javaTimeModule = new JavaTimeModule();
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(javaTimeModule);
        ZonedDateTime zonedDateTime = mapper.readValue(date, ZonedDateTime.class);
        return zonedDateTime.toLocalDateTime();
    }
}