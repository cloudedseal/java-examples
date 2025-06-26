package patterns.adapter.demo2;

import java.util.Map;

/**
 * 第三方的接口
 */
public interface IOuterUser {

    Map getUserBaseInfo();
    Map getUserOfficeInfo();
    Map getUserHomeInfo();
}
