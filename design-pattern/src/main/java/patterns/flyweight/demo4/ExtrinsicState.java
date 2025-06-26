package patterns.flyweight.demo4;

import java.util.Objects;

public class ExtrinsicState {
    private String subject;
    private String location;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExtrinsicState that = (ExtrinsicState) o;
        return Objects.equals(subject, that.subject) && Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, location);
    }
}
