package Widgets;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/// Класс для отображения однострочного текса на экране
public class StaticText extends IWidget
{
    public StaticText(final String iText)
    {
        super();
        _text = iText;
    }

    public StaticText()
    {
        super();
        _text = new String();
    }

    /// Задать строку
    public void SetText(final String iText)
    {
        _text = new String(iText);
    }

    /// Получить строку
    public String GetText()
    {
        return _text;
    }

    /// Перегружаем метод рисования
    @Override
    public void Draw(Graphics iG)
    {
        if (iG instanceof Graphics2D)
        {
            var drawText = (Graphics2D)iG;
            drawText.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            var pos = GetPosition();
            drawText.drawString(_text, pos.GetX(), pos.GetY());
        }
    }

    private String _text;
}
