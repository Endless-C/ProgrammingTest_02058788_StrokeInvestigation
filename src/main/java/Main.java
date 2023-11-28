import java.time.LocalDate;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Daphne Von Oram", 62, "https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg", "https://martinh.netfirms.com/BIOE60010/mri1.jpg", 2, LocalDate.of(2023, 9, 14), 130, 70, LocalDate.of(2023, 9, 15), "ST");
        Patient patient2 = new Patient("Sebastian Compton", 31, " https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg", "https://martinh.netfirms.com/BIOE60010/mri2.jpg", 4, LocalDate.of(2023, 11, 23), 150, 80, LocalDate.of(2023, 11, 20), "VST");

        System.out.println("Patient:" + patient1.getName() + ": MRI:" + patient1.getfieldStrength() + " Tesla," + patient1.getdatemri() + "; BP:" + patient1.getMeasureType() + "," + patient1.getdatebp());
        System.out.println("Patient:" + patient2.getName() + ": MRI:" + patient2.getfieldStrength() + " Tesla," + patient2.getdatemri() + "; BP:" + patient2.getMeasureType() + "," + patient2.getdatebp());

        JFrame frame = new JFrame("Patient Records");
        frame.setSize(500,400);
        frame.setVisible(true);
        JPanel displayPanel = new JPanel();
    }
}