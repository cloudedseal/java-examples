package pk.demo6.observer;

import pk.demo6.chain.Recorder;

public class ChinaTopDnsServer extends DnsServer {
@Override
protected void sign(Recorder recorder) {
recorder.setOwner("中国顶级DNS服务器");
}
@Override
protected boolean isLocal(Recorder recorder) {
return recorder.getDomain().endsWith(".cn");
}
}