/**
 * Дан класс Solution, параметризированный T.
 * Ограничьте параметр T.T должен быть наследником классаClassForGenerics и
 * одновременно реализовывать интерфейс InterfaceForGenerics. Менять можно толькоклассSolution
 *
 * @author Artem SLidenko
 * @version 1.0
 */
package lesson009;

public class Solution<T extends ClassForGenerics & InterfaceForGenerics> {
}
