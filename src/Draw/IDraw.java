package Draw;

import java.awt.Graphics;
import javax.swing.JComponent;

/// Базовый класс для рендера, всё что рисуется наследуется от него
/// Класс является абстрактным и не может быть создан
public abstract class IDraw extends JComponent
{
    public IDraw(boolean iVisible)
    {
        _visible = iVisible;
    }

    public IDraw()
    {
        _visible = true;
    }

    /// Костыль, но по другому никак
    @Override
    public void paintComponent(Graphics iG)
    {
        Draw(iG);
    }

    /// Метод самой отрисовки, вообще в будущем его нужно будет сделать protected,
    /// и вызывать не вручную, а через менеджер отрисовки, но это потом, пока что так
    public void Draw(Graphics iG)
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
