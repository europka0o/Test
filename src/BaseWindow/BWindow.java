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
        int w = super.getWidth();
        super.setSize(iH, w);
    }

    /// Задать ширину окна
    public void SetWidth(int iW)
    {
        int h = super.getHeight();
        super.setSize(h, iW);
    }

    /// Задать высоту и ширину окна
    public void SetSize(int iH, int iW)
    {
        super.setSize(iH, iW);
    }

    /// Получить высоту окна
    public int GetHeight()
    {
        return super.getHeight();
    }

    /// Получить ширину окна
    public int GetWidth()
    {
        return super.getHeight();
    }
}
