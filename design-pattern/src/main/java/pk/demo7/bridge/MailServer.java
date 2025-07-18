package pk.demo7.bridge;


public abstract class MailServer {
    // 方便子类调用, 委托
    protected MailTemplate mail;

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
