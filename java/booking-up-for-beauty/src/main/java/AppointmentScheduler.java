import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
      return LocalDateTime.parse(appointmentDateDescription, formatter);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
      return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
      int hour = appointmentDate.getHour();
      return hour >= 12 && hour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        throw new UnsupportedOperationException("Please implement the AppointmentScheduler.getDescription() method");
    }

    public LocalDate getAnniversaryDate() {
        throw new UnsupportedOperationException("Please implement the AppointmentScheduler.getAnniversaryDate() method");
    }
}
