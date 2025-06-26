package patterns.flyweight.demo2;

import patterns.flyweight.demo1.SignInfo;

/**
 * 对象池中，对象一旦产生，必然有一个唯一的，可访问的状态标志该对象，
 * 而且池中的对象声明周期是由池容器决定，而不是由使用者决定。
 */
public class SignInfo4Pool extends SignInfo {
    private String key;

    public SignInfo4Pool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
