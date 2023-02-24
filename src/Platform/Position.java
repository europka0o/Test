package Platform;

public class Position<Type>
{
    /// Конструктор по умолчанию
    public Position()
    {

    }

    /// Конструктор с параметрами
    public Position(Type iX, Type iY)
    {
        _x = iX;
        _y = iY;
    }

    /// Получить значение x
    public Type GetX()
    {
        return _x;
    }

    /// Получить значение y
    public Type GetY()
    {
        return _y;
    }

    /// Получить масси со занчениями x и y
    public Type[] ToArray()
    {
        var arr = (Type[])new Object[] { _x, _y };
        return arr;
    }

    /// Задать x
    public void SetX(Type iX)
    {
        _x = iX;
    }

    /// Задать y
    public void SetY(Type iY)
    {
        _y = iY;
    }
    /// Задать сразу x и y через массив
    public void SetXY(Type[] iXY)
    {
        _x = iXY[0];
        _y = iXY[1];
    }

    /// Задать сразу x и y
    public void SetXY(Type iX, Type iY)
    {
        _x = iX;
        _y = iY;
    }

    private Type _x;
    private Type _y;
}

