import java.time.ZonedDateTime;

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
public class DemoInfo {
    private String name;

    //@JsonTypeInfo(use= Id.NAME, include= As.PROPERTY, defaultImpl = ZonedDateTime.class)
    private ZonedDateTime date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }
}
