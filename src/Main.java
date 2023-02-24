import BaseWindow.BWindow;
import Widgets.StaticText;

public class Main
{
    public static void main(String[] args)
    {
        var window = new BWindow();
        window.SetSize(700, 700);

        /// Контейнер со всеми графическими компонентами
        var comp = window.getContentPane();
        var text = new StaticText("Hello World!");
        text.GetPosition().SetXY(10, 20);
        comp.add(text);
    }
}