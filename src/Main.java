import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Введите текст");
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        scanner.close();
        System.out.println(textModifier(inputText));
    }

    public static String textModifier(String input) {
        String st = input.trim();
        String[] array = st.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (!array[i].isEmpty()) {
                if (i == 0) {
                    sb.append(array[i]);
                } else sb.append(" ").append(array[i]);
            }
        }

        int sumOfDigits = 0;
        char[] chars = sb.toString().toCharArray();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '-') {
                if (i != 0 && i != chars.length - 1) {
                    // Меняем местами символы
                    char leftChar = chars[i - 1];
                    char rightChar = chars[i + 1];
                    sb2.deleteCharAt(sb2.length() - 1); // Удаляем последний добавленный символ
                    sb2.append(rightChar).append(leftChar);
                    i++;
                    // Пропускаем следующий символ, так как мы его уже обработали
                }
            } else {
                sb2.append(chars[i]);
            }
        }
        char[] chars2 = sb2.toString().toCharArray();
        StringBuilder result = new StringBuilder();
        for (char c : chars2) {
            if (c == '+') {
                result.append('!');
            } else if (Character.isDigit(c)) {
                sumOfDigits += Character.getNumericValue(c);
            } else {
                result.append(c);
            }
        }
        // 3. Добавление суммы цифр в конец строки
        // ВОПРОС: Из текста задания не понятно надо ли выводить ноль в конце, если в тексте встречались только ноли. Сейчас реализовано так, что ноль не выводится в любом случае.
        if (sumOfDigits > 0) {
            result.append(" ").append(sumOfDigits);
        }
        return result.toString();
    }
}



