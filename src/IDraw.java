/// Базовый класс для рендера, всё что рисуется наследуется от него
/// Класс является абстрактным и не может быть создан
abstract class IDraw
{
    public IDraw(boolean iVisible)
    {
        _visible = iVisible;
    }

    public IDraw()
    {
        _visible = true;
    }

    /// Метод самой отрисовки, вообще в будущем его нужно будет сделать protected,
    /// и вызывать не вручную, а через менеджер отрисовки, но это потом, пока что так
    public void Draw()
    {

    }

    /// Задать видимсоть объекта
    public void SetVisible(boolean iVisible)
    {
        _visible = iVisible;
    }

    /// Проверить видимсоть объекта
    public boolean IsVisible()
    {
        return _visible;
    }

    private boolean _visible; /// Видимость
}
