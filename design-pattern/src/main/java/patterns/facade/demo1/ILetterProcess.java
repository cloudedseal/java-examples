package patterns.facade.demo1;

public interface ILetterProcess {
    // 信内容
    void writeContext(String context);

    // 写信封
    void fillEnvelope(String address);

    // 信放到信封
    void letterIntoEnvelope();

    // 发信
    void sendLetter();
}
