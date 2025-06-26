package patterns.facade.demo1;

public class Client {
    public static void main(String[] args) {
        // 创建一个处理信件的流程
        ILetterProcess letterProcess = new LetterProcessImpl();
        // 开始写信
        letterProcess.writeContext("hello, nice to meet you");
        // 写信封
        letterProcess.fillEnvelope("heaven101");
        // 把信放到信封
        letterProcess.letterIntoEnvelope();
        // 发信
        letterProcess.sendLetter();
    }
}
