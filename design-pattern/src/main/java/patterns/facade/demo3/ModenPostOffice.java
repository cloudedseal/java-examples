package patterns.facade.demo3;

import patterns.facade.demo1.ILetterProcess;
import patterns.facade.demo1.LetterProcessImpl;

public class ModenPostOffice {
    private ILetterProcess letterProcess = new LetterProcessImpl();
    private Police letterPolice = new Police();

    // 写信一条龙服务
    public void sendLetter(String context, String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        // 新加的流程
        letterPolice.checkLetter(letterProcess);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
