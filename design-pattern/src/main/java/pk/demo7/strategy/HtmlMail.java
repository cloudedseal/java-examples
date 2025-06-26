package pk.demo7.strategy;

public class HtmlMail extends MailTemplate{
    public HtmlMail(String from, String to, String subject, String context) {
        super(from, to, subject, context);
    }

    @Override
    public String getContext() {

        return  "这是 hyper 文本邮件";
    }
}
