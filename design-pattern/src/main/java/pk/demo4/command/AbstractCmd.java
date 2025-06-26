package pk.demo4.command;

public abstract class AbstractCmd {
    // 接收者
    protected IReceiver zip = new ZipReceiver();
    protected IReceiver gzip = new GzipReceiver();

    /**
     * 执行
     * @param source
     * @param to
     * @return
     */
    public abstract boolean execute(String source, String to);
}
