package pk.demo7.strategy;

public class MailServer {
    private MailTemplate mail;

    public MailServer(MailTemplate mail) {
        this.mail = mail;
    }

    public void sendMail(){
        System.out.println(this.mail.getFrom());
        System.out.println(this.mail.getTo());
        System.out.println(this.mail.getSubject());
        System.out.println(this.mail.getContext());
    }
}
