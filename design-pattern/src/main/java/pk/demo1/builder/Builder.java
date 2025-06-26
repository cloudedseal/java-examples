package pk.demo1.builder;


public abstract class Builder {
    protected final SuperMan superMan = new SuperMan();
    public void setBody(String body){
        this.superMan.setBody(body);
    }

    public void setSpecialTalent(String st){
        this.superMan.setSpecialTalent(st);
    }

    public void setSpecialSymbol(String ss){
        this.superMan.setSpecialSymbol(ss);
    }

    /**
     * 关注产品具体细节,顺序等，产品的构建过程
     * @return
     */
    public abstract SuperMan getSuperMan();
}
