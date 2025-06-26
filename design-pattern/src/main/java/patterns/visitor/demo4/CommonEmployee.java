package patterns.visitor.demo4;



public class CommonEmployee extends Employee {
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

//    @Override
//    protected String getOtherInfo() {
//        return "工作：" + this.job + "\t";
//    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
