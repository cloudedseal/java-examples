package pk.demo4.command;

public class GzipCompressCmd extends AbstractCmd{
    @Override
    public boolean execute(String source, String to) {
        return super.gzip.compress(source, to);
    }
}
