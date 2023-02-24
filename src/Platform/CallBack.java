package Platform;

/// Наша реализация колл бэка, он же функтор
@FunctionalInterface
public interface CallBack<Arg>
{
    /// Собственно сам вызов функтора
    void Call(Arg ioValue);

    /// Вызов, но только с параметрами
    //void Invoke(Arg ioValue, Object ... iParam);
}
