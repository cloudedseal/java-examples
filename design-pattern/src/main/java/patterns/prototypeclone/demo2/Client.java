package patterns.prototypeclone.demo2;

import patterns.prototypeclone.demo1.AdvTemplate;

import java.util.Random;

/**
 * Specify the kinds of objects to create using a prototypical instance,
 * and create new objects by copying this prototype.
 *
 * 不必从零开始拿到对象，直接复制完全体，哈哈哈
 */
public class Client {
    // MAX_COUNT 数据量大？一个一个发太慢了
    private static int MAX_COUNT = 6;

    public static void main(String[] args) throws CloneNotSupportedException {
        int i = 0;
        // 模版定义出来，作为被复制的对象，这就是原型
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XXX银行版权所有");
        System.out.println(mail);
        while (i < MAX_COUNT){
            // 每封邮件不同的地方, 把对象复制一份。
            // 不会调用构造函数，因为这个是 Object#clone native 方法直接复制的
            // 直接复制内存中的内容
            // 不通过 new 创建，通过对象复制，这就是所谓的 prototype 模式
            Mail cloneMail = (Mail) mail.clone();
            System.out.println(i + "==>" + cloneMail.toString());
            cloneMail.setAppellation(getRandString(5) + "先生(女士)");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) +".com");
            sendMail(cloneMail);
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
