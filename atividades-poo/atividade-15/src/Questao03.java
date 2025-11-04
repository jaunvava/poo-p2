public class Questao03 {
        public static final int IND = 1;
        public final String name;
        public final String email;
        private static int totalUsers = 0;

        // Campos e métodos:
        private final int id;

        public Questao03(String name, String email) {
            totalUsers++;
            this.id = totalUsers;
            this.name = name;
            this.email = email;
        }

        public int getId() {
            return id;
        }

        public static int getTotalUsers() {
            return totalUsers;
        }

        public static boolean isValidEmail(String email) {
            if (email == null) return false;
            int at = email.indexOf('@');
            int dot = email.lastIndexOf('.');
            return at > 0 && dot > at + 1 && dot < email.length() - 1;
        }
    }