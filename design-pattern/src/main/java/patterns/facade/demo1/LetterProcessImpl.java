package patterns.facade.demo1;

public class LetterProcessImpl implements ILetterProcess{
    @Override
    public void writeContext(String context) {
        System.out.println("填写新的内容。。。" + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写收件人地址和姓名。。。" + address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("把信放到信封中。。。");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮递信件。。。");
    }
}
