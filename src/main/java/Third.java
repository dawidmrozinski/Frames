import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Third extends JFrame implements ActionListener {


    public Third(){

        this.setVisible(true);
        initComponents();
        this.setDefaultCloseOperation(3);

        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setSize(screenWidth/2, screenHeight/2);
        int frameWidth = this.getSize().width;
        int frameHeight = this.getSize().height;
        this.setLocation((screenWidth - frameWidth)/2, (screenHeight - frameHeight)/2);


    }

    public void initComponents(){
        kolorCzerwony = new JButton("Czerwony");
        kolorNiebieski = new JButton("Niebeiski");
        defaultColor = new JButton("Domyślny");
        kolorCzarny = new JButton("Czarny"); // kolor ustawiany za pomocą klasy Third któa implementuje interface Actionlistener
        kolorCzarny.addActionListener(this);// kolor ustawiany za pomocą klasy Third któa implementuje interface Actionlistener
        kolorCzerwony.addActionListener(new Colorshearing(Color.RED));
        kolorNiebieski.addActionListener(new Colorshearing(Color.blue));
        defaultColor.addActionListener(new Colorshearing(null));

        this.getContentPane().add(panel);
        panel.add(kolorCzerwony);
        panel.add(kolorNiebieski);
        panel.add(defaultColor);
        panel.add(kolorCzarny);

        createButtons("Zielony", Color.GREEN);//tworzymy przycisk za pomocą funkcji, któą sami napisaliśmy

    }

    JPanel panel = new JPanel();
    JButton kolorCzerwony; //<-- to jest komponent, a komponenty są źródłami zdarzeń
    JButton kolorNiebieski;
    JButton defaultColor;
    JButton kolorCzarny;
    //Każde źródło może być nasłuchiwane przez "słuchacze". Słuchacze są to obiekty, które muszą implementować jakiś interface
    //który ma dane zdażenie.

    public void createButtons(String name, final Color color){
        JButton przycisk = new JButton(name);
        panel.add(przycisk);
        przycisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                panel.setBackground(color);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

       if (actionEvent.getSource() == kolorCzarny)
           panel.setBackground(Color.black);
    }

    private class Colorshearing implements ActionListener{ //tworzymy nową klasę, któa implementuje interface ActionListener
        //następnie implementujemy w niej wszystkie metody abstrakcyjne tego interface
        Color color;

        public Colorshearing(Color c){
            this.color = c;

        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            panel.setBackground(color);
        }
    }

    public static void main(String[] args) {
        Third third = new Third();


    }

}
