package codecheck;


public class App {

    private static String IDIOT = "idiot";
    private static String STUPID = "stupid";
    private static String DUMB = "dumb";
    private static String SMART = "smart";
    private static String INVALID = "invailed";

    public static void main(String[] args) {
        for (int i = 0, l = args.length; i < l; i++) {
            //String output = String.format("argv[%s]: %s", i, args[i]);
            String output = answer(args[i]);
            System.out.println(output);
        }

    }

    public static String answer(String A) {
         if (isNumber(A) && isZenkaku(A)) {
             int AA = Integer.parseInt(A);
             if (AA >= 0 && AA <= 1000) {
                 if (idiot(AA) && stupid(AA)) {
                     return DUMB;
                 } else if (stupid(AA)) {
                     return STUPID;
                 } else if (idiot(AA))  {
                     return IDIOT;
                 } else {
                     return SMART;
                 }
             }
        }
        return INVALID;
    }

    public static boolean idiot(int AA) {
        boolean answer = false;
        if ((AA%3 == 0)) {
            answer = true;
        }
        return answer;
    }

    public static boolean stupid(int AA) {
        boolean answer = false;
        if ((Integer.toString(AA).contains("3"))) {
            answer = true;
        }
        return answer;
    }

    public static boolean isNumber(String num) {
        try {
            Integer.parseInt(num);
            return true;
            } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isZenkaku(String A){
        if(A == null){
          return false;
        }
        return true;
    }
}
