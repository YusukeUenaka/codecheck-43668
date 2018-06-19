package codecheck;


public class App {

    private static String IDIOT = "idiot";
    private static String STUPID = "stupid";
    private static String DUMB = "dumb";
    private static String SMART = "smart";
    private static String INVALID = "invailed";

    public static void main(String[] args) {
        for (int i = 0, l = args.length; i < l; i++) {
            String output = String.format("argv[%s]: %s", i, args[i]);
            System.out.println(output);
        }
        for (int i = 0, l = args.length; i < l; i++) {
            //String output = String.format("argv[%s]: %s", i, args[i]);
            String output = answer(args[i]);
            System.out.println(output);
        }

    }

    public static String answer(String A) {
        int AA = Integer.parseInt(A);
        if ((AA%3 == 0) && (AA >= 0) && (AA<=1000)) {
            return IDIOT;
        } else if (AA <= 1000) {
            return SMART;
        } else {
            return INVALID;
        }
    }
}
