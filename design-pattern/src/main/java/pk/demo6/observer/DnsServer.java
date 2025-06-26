package pk.demo6.observer;

import pk.demo6.chain.Recorder;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public abstract class DnsServer extends Observable implements Observer {
    //上级DNS是谁
    private DnsServer upperServer;

    @Override
    public void update(Observable o, Object arg) {
        Recorder recorder = (Recorder) arg;
        if (isLocal(recorder)) {//是本服务器能解析的域名
           recorder.setIp(genIpAddress());
        } else {//本服务器不能解析
//提交上级DNS进行解析
            responseFromUpperServer(recorder);
        }
        sign(recorder);
    }

    protected abstract void sign(Recorder recorder);

    protected  void responseFromUpperServer(Recorder recorder){
        super.setChanged();
        super.notifyObservers();
    }


    //指向上级DNS
    public void setUpperServer(DnsServer _upperServer) {
        super.deleteObservers();
        super.addObserver(_upperServer);
    }

    //每个DNS都有一个数据处理区（ZONE）,检查域名是否在本区中
    protected abstract boolean isLocal(Recorder domain);

    //每个DNS服务器都必须实现解析任务
    protected Recorder echo(String domain) {
        Recorder recorder = new Recorder();
//获得IP地址
        recorder.setIp(genIpAddress());
        recorder.setDomain(domain);
        return recorder;
    }

    //随机产生一个IP地址，工具类
    private String genIpAddress() {
        Random rand = new Random();
        String address = rand.nextInt(255)
                + "." + rand.nextInt(255)
                + "." + rand.nextInt(255)
                + "." + + rand.nextInt(255);
        return address;
    }
}