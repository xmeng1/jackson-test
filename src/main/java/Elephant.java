import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User:    mengxin
 * Date:    04/07/17
 * Project: jackson-examples
 * Package: PACKAGE_NAME
 * Description: Elephant.
 *
 * @author mengxin
 * @version 1.0
 */
public class Elephant extends Animal {

    @JsonProperty
    private String name;

    @JsonCreator
    public Elephant(@JsonProperty("name") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return "trumpet";
    }

    public String getType() {
        return "herbivorous";
    }

    public boolean isEndangered() {
        return false;
    }

    @Override
    public String toString() {
        return "Elephant [name=" + name + ", getName()=" + getName() + ", getSound()=" + getSound() + ", getType()=" + getType()
                + ", isEndangered()=" + isEndangered() + "]";
    }

}