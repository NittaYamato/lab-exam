package passphrase;

public class PassphraseEncoder {

    public static String encode(String str){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
                sb.append(c);
            }
            else {
                c = Character.toUpperCase(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String decode(String str){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
                sb.append(c);
            }
            else {
                c = Character.toLowerCase(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
