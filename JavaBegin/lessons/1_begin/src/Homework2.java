// import java.util.regex.Pattern;

public class Homework2 {
    public static void main(String[] args) {
        // Написать метод который приводит строку к нормальному виду
        // строка на вход:
        // Добрый день Как дела Все хорошо
        // выход:
        // Добрый день. Как дела. Все хорошо.

        System.out.println(stringNormal("Добрый     день     Как   дела    Все     хорошо"));
    }

    // проверок строки нужно больше - находить ".,!?" и др.
    static String stringNormal(String str) {
        str = str.replaceAll("\s+", " "); // убираем лишние пробелы
        str = str.replaceAll("(?![А-яЁё]*\s*[а-яё])", ".");
        return str;
    }
}