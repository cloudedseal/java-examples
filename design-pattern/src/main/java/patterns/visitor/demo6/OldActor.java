package patterns.visitor.demo6;

public class OldActor extends AbsActor{
    @Override
    public void act(KungFuRole role) {
        System.out.println("年纪打了，不能演功夫角色");
    }
}
