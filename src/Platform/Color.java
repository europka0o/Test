package Platform;

// Класс для хранения значения цвета
public class Color {

    private char _red;
    private char _green;
    private char _blue;
    private char _alpha;

    public Color() {
    }

    public Color(char iRed, char iGreen, char iBlue, char iAlpha) {
        _red = iRed;
        _green = iGreen;
        _blue = iBlue;
        _alpha = iAlpha;
    }

    public char GetRed() {
        return _red;
    }

    public void SetRed(char iRed) {
        _red = iRed;
    }

    public char GetGreen() {
        return _green;
    }

    public void SetGreen(char iGreen) {
        _green = iGreen;
    }

    public char GetBlue() {
        return _blue;
    }

    public void SetBlue(char iBlue) {
        _blue = iBlue;
    }

    public char GetAlpha() {
        return _alpha;
    }

    public void SetAlpha(char iAlpha) {
        _alpha = iAlpha;
    }
}