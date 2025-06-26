package pk.demo7.bridge;

public class SendMail extends MailServer {
    public SendMail(MailTemplate _m) {
        super(_m);
    }

    //修正邮件发送程序
    public void sendMail() {
//增加邮件服务器信息
        String context = "Received: from SendMail Service ";
        super.sendMail();
    }
}