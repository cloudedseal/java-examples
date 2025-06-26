package principle.lsp.demo1;

/**
 *  Liskov Substitution Principle
 * Functions that use pointers or references to base classes must be
 * able to use objects of derived classes without knowing it.
 * 能用到父类的地方，子类就可以出现，替换成的子类不会有任务错误或者异常
 */
public abstract class AbstractGun {
    public abstract void shoot();
}
