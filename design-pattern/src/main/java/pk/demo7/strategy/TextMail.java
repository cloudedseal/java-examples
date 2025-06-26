package pk.demo7.strategy;

public class TextMail extends MailTemplate{
    public TextMail(String from, String to, String subject, String context) {
        super(from, to, subject, context);
    }

    @Override
    public String getContext() {

        return  "这是文本邮件";
    }
}
