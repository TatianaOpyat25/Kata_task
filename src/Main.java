import java.util.Scanner;

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
        System.out.println(sb);
        return "end";
    }
}