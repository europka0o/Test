/// Своя базовая реализация строки
class __string
{

    private char[] _data; /// Массив символов, без размера, так как строка динамическая
    private int _size; /// Размер, он же длина + 1 строки

    /// Конструктор по умолчанию
    __string()
    {
        _size = 1;
        _data = new char[] {'\0'};
    }

    /// Конструктор с параметрами
    __string(String str)
    {
        /// Учитываем нулевой терминатор, поэтому +1
        _size = str.length() + 1;
        _data = str.toCharArray();
    }
    __string(char[] str)
    {
        this.Set(str);
    }

    /// Задать новое значение строки
    void Set(String str)
    {
        _data = str.toCharArray();
        _size = str.length() + 1;
    }

    void Set(char[] str)
    {
        /// Узнаем длину строки, вообще здесь может возникнуть бессконечный цикл, если нет терменатора,
        /// по хорошему, нужно как-то отлавливать такие случаи
        int i = 0;
        while (true)
        {
            if (str[i] == 0x0)
                break;

            ++i;
        }

        _data = str;
        _size = i;
    }

    /// Получить размер строки
    int GetSize()
    {
        return _size;
    }

    /// Напечатать строку в консоль
    public void Print()
    {
        var str = new String(_data);
        System.out.println(str);
    }
}

public class Main {
    public static void main(String[] args)
    {
        __string str = new __string();
        str.Set("Hello World!");

        str.Print();
    }
}