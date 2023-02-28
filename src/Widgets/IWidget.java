package Widgets;

import Draw.IDraw;
import Platform.CallBack;
import Platform.Position;

/// Базовый класс для виджетов(элементов интерфейса, кнопок, текста, выпадающих списков и т.д.)
/// Класс является абстрактным и не может быть создан
public abstract class IWidget extends IDraw
{
    public IWidget()
    {
        _pos = new Position<Integer>(0, 0);
    }

    public Position<Integer> GetPosition()
    {
        return _pos;
    }

    /// Обработчик активации виджета
    public CallBack<IWidget> OnActive;
    /// Обработчик деактивации виджета
    public CallBack<IWidget> OnDeactive;
    /// Обработчик клика мышкой по виджету
    public CallBack<IWidget> OnClick;

    private Position<Integer> _pos;
}
