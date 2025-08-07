public class StringDemo {
    public static void main(String[] Args) {
        String str = "45";
        String str1 = "gowrav";
        String str2 = new String(String.valueOf(str1.length()));
        String str3 = new String("chauhan");
        System.out.println(str + "  " + str1 + "  " + str2 + " " + str3 + " ");

        block2();
    }

    static void block2() {
        String s1 = "gowrav";
        String s2 = new String("kumar");
        String s3 = new String("chauhan");
        String str4 = s1 + s2 + s3;
        System.out.println("Concatenated string is :" + str4);
    }
}
