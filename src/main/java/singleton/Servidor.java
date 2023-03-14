package singleton;

public class Servidor {

        private Servidor() {};
        private static Servidor instance = new Servidor();
        public static Servidor getServidor() {
            return instance;
        }

        private String HostnameServidor;

        public String getHostnameServidor() {
            return HostnameServidor;
        }

        public void setHostnameServidor(String HostnameServidor) {
            this.HostnameServidor = HostnameServidor;
        }
}
