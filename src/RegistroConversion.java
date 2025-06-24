import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

    public class RegistroConversion {
        private final String origen;
        private final String destino;
        private final double montoOriginal;
        private final double montoConvertido;
        private final LocalDateTime timestamp;

        public RegistroConversion(String origen, String destino, double montoOriginal, double montoConvertido) {
            this.origen = origen;
            this.destino = destino;
            this.montoOriginal = montoOriginal;
            this.montoConvertido = montoConvertido;
            this.timestamp = LocalDateTime.now();
        }

        @Override
        public String toString() {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            return String.format("[%s] %.2f %s → %.2f %s",
                    timestamp.format(formato), montoOriginal, origen, montoConvertido, destino);
        }
    }

