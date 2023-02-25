package Platform;

import Platform.Position;

/// Здесь будут статичные методы для каких-то базовых вспомогательных вещей
public class Base
{
    /// Получить длину между двумя 2д точками в пикселях
    static double DistanceToPoint(final Position<Integer> iFirst, final Position<Integer> iSecond)
    {
       return Math.sqrt(Math.pow(iFirst.GetX() - iSecond.GetX(), 2) + Math.pow(iFirst.GetY() - iSecond.GetY(), 2));
    }
}