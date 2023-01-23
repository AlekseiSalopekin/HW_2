public class H2 {

static String s1 =  "Hello world!";
static String s2 = "Hello world!";

    public static void main(String[] args) {

//        Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).

        contains(s1, s2);
        contains(s1, new StringBuilder(s2).reverse().toString());

        StringBuilder sb = new StringBuilder();

//        Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().

        sb.append("3+56=59 ");
        sb.append("3-56=-59 ");
        sb.append("3*56=168 ");
        System.out.println(sb);

//        Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

        System.out.println(sb.indexOf("="));
        sb.deleteCharAt(4);
        sb.insert(4," равно ");

        System.out.println(sb);


    }
    //        Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
    public static void contains (String s1, String s2){
        System.out.println(s1.contains(s2));
    }

}
