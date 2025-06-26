package patterns.command.demo2;

import patterns.command.demo1.CodeGroup;
import patterns.command.demo1.PageGroup;
import patterns.command.demo1.RequirementGroup;

/**
 * Encapsulate a request as an object, thereby letting you parameterize clients with different requests,
 * queue or log request, and support undoable operations;
 */
public abstract class Command {

    // 封装 receiver，具体哪个 receiver 调用者无需知道
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    // 需要做什么事情
    public abstract void execute();
}
