import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User:    mengxin
 * Date:    04/07/17
 * Project: jackson-examples
 * Package: PACKAGE_NAME
 * Description: Lion.
 *
 * @author mengxin
 * @version 1.0
 */
public class Lion extends Animal {

    private String name;

    @JsonCreator
    public Lion(@JsonProperty("name") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return "Roar";
    }

    public String getType() {
        return "carnivorous";
    }

    public boolean isEndangered() {
        return true;
    }

    @Override
    public String toString() {
        return "Lion [name=" + name + ", getName()=" + getName() + ", getSound()=" + getSound() + ", getType()=" + getType() + ", isEndangered()="
                + isEndangered() + "]";
    }

}