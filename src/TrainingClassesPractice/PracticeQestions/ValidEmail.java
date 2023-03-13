package TrainingClassesPractice.PracticeQestions;

public class ValidEmail {
    public static void main(String[] args) {
        String email = "abhi.shkbhi@gmailcom";
        boolean dot = false;
        boolean atTheRate = false;

        try {
            if (email.charAt(0) == '.' || email.charAt(email.length() - 1) == '.') {
                throw new Exception("Invalid");
            }

            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    atTheRate = true;
                    dot = false;
                }
                if (email.charAt(i) == '.') {
                    dot = true;
                }
            }
            if (atTheRate && !dot) {
                throw new Exception("Invalid");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (atTheRate && dot) {
            System.out.println("Valid");
        }
    }
}
