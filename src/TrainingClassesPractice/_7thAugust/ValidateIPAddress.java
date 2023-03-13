package TrainingClassesPractice._7thAugust;

public class ValidateIPAddress {
    public static void main(String[] args) {
        String s = "222.111.111.111";
        System.out.println(valid(s));
    }

    public static boolean valid(String s) {
        if (s.charAt(0) == '.' || s.charAt(s.length() - 1) == '.') return false;
        String[] arr = s.split("\\.");
        if (arr.length != 4) return false;

        for (int i = 0; i < arr.length; i++) {
            String st = arr[i];
            if (st.matches("[a-zA-z]")) return false;
            if (st.length() == 0 || st.length() > 4) return false;
            if (st.equals("00") || st.equals("000") || st.equals("0000")) return false;
            if (st.length() > 1 && st.charAt(0) == '0') return false;
            int num = Integer.parseInt(st);
            if (num < 0 || num > 255) return false;
        }
        return true;
    }
}
