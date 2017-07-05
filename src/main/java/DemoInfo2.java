import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.LocalDateTime;

/**
 * User:    mengxin
 * Date:    05/07/17
 * Project: jackson-examples
 * Package: PACKAGE_NAME
 * Description: DemoInfo.
 *
 * @author mengxin
 * @version 1.0
 */
public class DemoInfo2 {
    private String name;

    //@JsonTypeInfo(use= Id.NAME, include= As.PROPERTY, defaultImpl = ZonedDateTime.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
