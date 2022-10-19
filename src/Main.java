

public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        TaskDop1();
        TaskDop2();
        TaskDop3();
        TaskDop4();
    }

    public static void Task1() {
        System.out.println("Задание 1");
        /*
    Представим, что мы работаем в небольшой компании. Данные сотрудников хранятся в неструктурированном формате,
    и бухгалтерия попросила написать программу, в которой можно работать с Ф.И.О. сотрудников.
    Напишите четыре строки:
    первая с именем firstName — для хранения имени;
    вторая с именем middleName — для хранения отчества;
    третья с именем lastName — для хранения фамилии;
    четвертая с именем fullName — для хранения Ф.И.О. сотрудника в формате "Фамилия Имя Отчество".
    Выведите в консоль фразу: “ФИО сотрудника — ….”
    В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
         */
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void Task2() {
        System.out.println("Задание 2");
        /*
    Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны Ф.И.О. сотрудников,
    полностью написанные заглавными буквами (верхним регистром).
    Напишите программу, которая изменит написание Ф. И. О. сотрудника с “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
    В качестве строки с исходными данными используйте строку fullName.
    Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
         */
        String fullName = "Ivanov Ivan Ivanovich";
        String employee = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + employee);
    }

    public static void Task3() {
        System.out.println("Задание 3");
        /*
        Система, в которой мы работаем, не принимает символ “ё”.
        Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
        В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
        Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
         */
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }

    public static void TaskDop1() {
        System.out.println();
        System.out.println("Задание повышенной сложности №1");
        /*
    К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм,
    разбивающий одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
    В качестве исходных данных используйте:
    Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
    строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
    переменная firstName — для хранения имени;
    переменная middleName — для хранения отчества;
    переменная lastName — для хранения фамилии.
    Решите задание с помощью метода substring().
    Результат программы выведите в формате:
    “Имя сотрудника — …”
    “Фамилия сотрудника — …”
    “Отчество сотрудника — ...”
         */
        String fullName = "Ivanov Ivan Ivanovich";
        int end = fullName.length();
        String lastName = fullName.substring(0, fullName.indexOf(" "));
        String firstName = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(lastName));
        String middleName = fullName.substring(fullName.lastIndexOf(" "), end);
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);

    }

    public static void TaskDop2() {
        System.out.println();
        System.out.println("Задание повышенной сложности №2");
        /*
    Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
    Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О.
    в правильный формат.
    В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“,
    которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
    Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв — …”
         */
        String fullname = "ivanov ivan ivanovich";
        char[] c = fullname.toCharArray();
        for (int i = 0; i < fullname.length(); i++) {
            if (i == 0 || i == 7 || i == 12) {
                c[i] = Character.toUpperCase(c[i]);
            }
            System.out.print(c[i]);
        }
        System.out.println();
    }

    public static void TaskDop3() {
        System.out.println();
        System.out.println("Задание повышенной сложности №3");
        /*
    Имеется две строки.
    Первая: "135"
    Вторая: "246"
    Соберите из двух строк одну, содержащую данные "123456".
    Использовать сортировку нельзя.
    Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
    Выведите результат в консоль в формате: “Данные строки — ….”
         */
        String first = "135";
        String second = "246";
        StringBuilder sb1 = new StringBuilder();
        int str = Math.min(first.length(), second.length());
        sb1.append("Данные строки — ");
        for (int i = 0; i < str; i++) {
            sb1
                    .append(first.charAt(i))
                    .append(second.charAt(i));
        }
        System.out.println(sb1);
    }

    public static void TaskDop4() {
        System.out.println();
        System.out.println("Задание повышенной сложности №4");
        /*
        Дана строка из букв английского алфавита "aabccddefgghiijjkk".
        Нужно найти и напечатать буквы, которые дублируются в строке.
        Обратите внимание, что строка отсортирована, т. е. дубли идут друг за другом.
        В итоге в консоль должен быть выведен результат программы: "acdgijk"
         */
        String engWords = "aabccddefgghiijjkk";
        char[] charArray = engWords.toCharArray();
        for (int i = 0; i < engWords.length(); i++) {
            for (int j = i + 1; j < engWords.length(); j++) {
                if (charArray[i] == charArray[j]) {
                    System.out.print(charArray[j]);
                }
            }
        }
    }
}