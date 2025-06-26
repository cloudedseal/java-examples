package principle.ocp.demo3;

import principle.ocp.demo1.IBook;

/**
 * open closed principle
 */
public interface IComputerBook extends IBook {
    String getScope();
}
