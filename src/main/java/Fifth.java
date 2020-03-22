import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fifth extends JFrame {

    //tworzenie przełącznika

    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JLabel etykieta = new JLabel("Coś");
    JRadioButton małyprzełącznik = new JRadioButton("Mały");//tworzymy przełącznik i możemy wybrać czy ma być zaznaczony(true)
    // czy też odznaczony (false). Domyślnie ustawiony na false.
    JRadioButton średniprzełącznik = new JRadioButton("Średni");
    ButtonGroup groupSize = new ButtonGroup();
    ButtonGroup groupColor = new ButtonGroup();
    ButtonGroup groupFont = new ButtonGroup();

    public Fifth(){
        initComponents();
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setSize(screenWidth/2, screenHeight/2);
        int frameLocationWidth = this.getSize().width;
        int frameLocationHeight = this.getSize().height;
        this.setLocation((screenWidth - frameLocationWidth)/2, (screenHeight - frameLocationHeight)/2);

    }

    public void initComponents(){

        this.getContentPane().add(panel, BorderLayout.NORTH);
        this.getContentPane().add(panel2, BorderLayout.CENTER);
        this.getContentPane().add(panel3, BorderLayout.SOUTH);
        this.getContentPane().add(panel4, BorderLayout.WEST);


        buildPrzełącznikSize("Mały", 10);
        buildPrzełącznikSize("Średni", 30);
        buildPrzełącznikSize("Duży", 100);

        buildPrzełącznikColor("Czerwony", Color.RED);
        buildPrzełącznikColor("Zielony", Color.GREEN);
        buildPrzełącznikColor("Niebieski", Color.blue);
        buildPrzełącznikColor("Czarny", Color.black);

        buildPrzełącznikFontName("Monospaced", "Monospaced");
        buildPrzełącznikFontName("Default", "null");
        buildPrzełącznikFontName("Dialog", "Dialog");
        buildPrzełącznikFontName("Dialog Input", "DialogInput");
        buildPrzełącznikFontName("San Serif", "SanSerif");
        buildPrzełącznikFontName("Serif", "Serif");

        panel2.add(etykieta);

    }


    public void buildPrzełącznikSize(String nazwa, final int rozmiar){

        JRadioButton jRadioButton = new JRadioButton(nazwa);
        jRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                etykieta.setFont(new Font("null", Font.BOLD, rozmiar));
            }
        });
        groupSize.add(jRadioButton);
        panel.add(jRadioButton);

    }

    public void buildPrzełącznikColor(String nazwa, final Color color){

        JRadioButton jRadioButton = new JRadioButton(nazwa);
        jRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                etykieta.setForeground(color);
            }
        });
        groupColor.add(jRadioButton);
        panel3.add(jRadioButton);

    }

    public void buildPrzełącznikFontName(String nazwa, final String fontName){

        JRadioButton jRadioButton = new JRadioButton(nazwa);
        jRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                etykieta.setFont(new Font(fontName, 0, 10 ));
            }
        });
        groupFont.add(jRadioButton);
        panel4.add(jRadioButton);

    }

    public static void main(String[] args) {
        Fifth fifth = new Fifth();
    }


}
