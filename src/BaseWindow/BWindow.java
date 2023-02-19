package BaseWindow;

import javax.swing.*;

///Базовая реализация окна, в которой и рисуется всё что есть в нашем приложении
public class BWindow extends JFrame
{
    public BWindow()
    {
        super();
        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /// Задать высоту окна
    public void SetHeigh(int iH)
    {
        _heigh = iH;
        super.setSize(_heigh, _width);
    }

    /// Задать ширину окна
    public void SetWidth(int iW)
    {
        _width = iW;
        super.setSize(_heigh, _width);
    }

    /// Задать высоту и ширину окна
    public void SetSize(int iH, int iW)
    {
        _heigh = iH;
        _width = iW;
        super.setSize(_heigh, _width);
    }

    /// Получить высоту окна
    public int GetHeight()
    {
        return _heigh;
    }

    /// Получить ширину окна
    public int GetWidth()
    {
        return _width;
    }

    private int _heigh;  /// Высота окна
    private int _width;  /// Ширина окна
}
