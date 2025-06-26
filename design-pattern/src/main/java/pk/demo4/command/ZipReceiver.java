package pk.demo4.command;

public class ZipReceiver implements IReceiver {
    @Override
    public boolean compress(String source, String to) {
        System.out.println(source + "---> " + to + " ZIP 压缩成功！");
        return true;
    }

    @Override
    public boolean uncompress(String source, String to) {
        System.out.println(source + "---> " + to + " ZIP 解压缩成功！");
        return true;
    }
}
