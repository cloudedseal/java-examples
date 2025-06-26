package patterns.prototypeclone.demo1;

import java.util.Random;

public class Client {
    // MAX_COUNT 数据量大？一个一个发太慢了
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        int i = 0;
        // 模版定义出来
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XXX银行版权所有");
        while (i < MAX_COUNT){
            mail.setAppellation(getRandString(5) + "先生(女士)");
            mail.setReceiver(getRandString(5) + "@" + getRandString(8) +".com");
            sendMail(mail);
            i++;
        }
    }

    private static void sendMail(Mail mail) {
        System.out.println("标题:" + mail.getSubject() + "\t收件人:" + mail.getReceiver() + "\t...发送成功");
    }

    private static String getRandString(int maxLength) {
        String source ="abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for(int i=0;i<maxLength;i++){
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
