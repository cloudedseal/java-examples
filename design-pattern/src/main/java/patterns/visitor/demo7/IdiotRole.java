package patterns.visitor.demo7;



public class IdiotRole implements Role {
    @Override
    public void accept(AbsActor actor) {
           actor.act(this);
    }
}
