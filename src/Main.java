import java.util.Scanner;

import static java.awt.SystemColor.text;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Введите текст");
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        scanner.close();
        textModifier(inputText);


    }

    public static String textModifier(String input) {
        String st = input.trim();
        String[] array = st.split(" ");

//        for (int i = 0; i < array.length; i++) {
//            if (i == 1)
//                System.out.println(array[i].length());
//
//        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (!array[i].isEmpty()) {
                if (i == 0) {
                    sb.append(array [i]);
                }
                else sb.append(" ").append(array[i]);
            }

        }
//        for (String s : array) {
//            if (!s.isEmpty()) {
//                sb.append(" ").append(s);
//            }
//        }
//        System.out.println(array.length);
//        System.out.println(sb);
        return "end";

        StringBuilder finalText = new StringBuilder();
        int sumOfDigits = 0;
        char[] chars = sb.toString().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '-') {
                if (i > 0 && i < chars.length - 1) {
                    // Меняем местами символы
                    char leftChar = chars[i - 1];
                    char rightChar = chars[i + 1];
                    sb.deleteCharAt(sb.length() - 1); // Удаляем последний добавленный символ
                   sb.append(rightChar).append(leftChar);
                    i++;
                    // Пропускаем следующий символ, так как мы его уже обработали
                }
            } else if (chars[i] == '+') {
               sb.append('!');
            } else if (Character.isDigit(chars[i])) {
                sumOfDigits += Character.getNumericValue(chars[i]);
            } else {
                sb.append(chars[i]);
            }
        }

        // 3. Добавление суммы цифр в конец строки
        if (sumOfDigits > 0) {
           sb.append(" ").append(sumOfDigits);
        }

        // Вывод результата
        System.out.println(sb.toString());
    }

}



