package patterns.flyweight.demo4;

public class SignInfo {
    private String id;
    private ExtrinsicState state;
    private String postAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExtrinsicState getState() {
        return state;
    }

    public void setState(ExtrinsicState state) {
        this.state = state;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }
}
