package pk.demo4.command;

public class ZipUncompressCmd extends AbstractCmd{
    @Override
    public boolean execute(String source, String to) {
        return super.zip.uncompress(source, to);
    }
}
