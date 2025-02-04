import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale; // to avoid formatting issues due to Locale != US formatting

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
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a", Locale.US); // locale for AM/PM is UK (lower case) and had to be changed to pass tests
      return "You have an appointment on " + appointmentDate.format(formatter) + ".";
    }

    public LocalDate getAnniversaryDate() {
      return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }

    // Checked default Locale to debug issues with formatting of AM / PM in line 22-23 
    // public static void main(String[] args) {
    //   System.out.println("Default Locale: " + Locale.getDefault());
    // }

}
