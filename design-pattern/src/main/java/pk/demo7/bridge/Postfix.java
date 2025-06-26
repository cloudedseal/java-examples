package pk.demo7.bridge;

public class Postfix extends MailServer {
    public Postfix(MailTemplate _m) {
        super(_m);
    }

    //修正邮件发送程序
    public void sendMail() {
//增加邮件服务器信息
        String context = "Received: from XXXX (unknown [xxx.xxx.xxx.xxx]) by ";
        super.mail.add(context);
        super.sendMail();
    }
}