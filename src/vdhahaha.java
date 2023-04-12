public class vdhahaha {
    public static void main(String[] args) {
        String msg = "codegym";
        for (int x = 4; x < msg.length() + 1; x++) {
            if (msg.length() == 3) {
                for (int i = 2; i < 7; i++) {
                    System.out.println(i);
                }
            } else {
                for (int i = msg.length(); i > (msg.length() - 3); i--) {
                    System.out.println(i);
                }
            }
        }
    }
}

