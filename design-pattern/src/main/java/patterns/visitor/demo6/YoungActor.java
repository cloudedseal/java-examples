package patterns.visitor.demo6;

public class YoungActor extends AbsActor{
    @Override
    public void act(KungFuRole role) {
        System.out.println("最喜欢演功夫角色");
    }
}
