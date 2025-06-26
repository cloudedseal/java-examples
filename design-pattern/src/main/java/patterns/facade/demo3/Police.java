package patterns.facade.demo3;

import patterns.facade.demo1.ILetterProcess;

public class Police {
    public void checkLetter(ILetterProcess letterProcess){
        System.out.println(letterProcess + "信件已经检查过了。。。");
    }
}
