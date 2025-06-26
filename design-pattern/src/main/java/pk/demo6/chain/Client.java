package pk.demo6.chain;

public class Client {
    public static void main(String[] args) throws Exception {
//上海域名服务器
        DnsServer sh = new SHDnsServer();
//中国顶级域名服务器
        DnsServer china = new ChinaTopDnsServer();
//全球顶级域名服务器
        DnsServer top = new TopDnsServer();
//定义查询路径
        china.setUpperServer(top);
        sh.setUpperServer(china);
//解析域名
        System.out.println("=====域名解析模拟器=====");

        String domain = "www.dubai.com.sh.cn";
        Recorder recorder = sh.resolve(domain);
        System.out.println("----DNS服务器解析结果----");
        System.out.println(recorder);
    }

}