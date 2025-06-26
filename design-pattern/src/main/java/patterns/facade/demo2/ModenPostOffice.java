package patterns.facade.demo2;

import patterns.facade.demo1.ILetterProcess;
import patterns.facade.demo1.LetterProcessImpl;

/**
 * Provide a unified interface to a set of interfaces in a subsystem.
 * Facade defines a higher-level interface that makes the subsystem
 * easier to use.
 * 高层次接口
 * 使子系统更好用
 * 不参与子系统内的业务逻辑
 * 装裱工 中间层，外部使用是这个
 */
public class ModenPostOffice {
    private ILetterProcess letterProcess = new LetterProcessImpl();

    // 写信一条龙服务
    public void sendLetter(String context, String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
