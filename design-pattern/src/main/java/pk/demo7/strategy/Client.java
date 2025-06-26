package pk.demo7.strategy;

public class Client {
    public static void main(String[] args) {
//创建一封TEXT格式的邮件
        MailTemplate m = new HtmlMail("a@a.com", "b@b.com", "外星人攻击地球了", "aaa");
        MailServer mail = new MailServer(m);
//发送邮件
        mail.sendMail();
    }
}