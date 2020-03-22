import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fourth extends JFrame implements ActionListener{

    //tworzenie zegarka

    JLabel label = new JLabel("Czas: ");
    JLabel time = new JLabel(pobierzCzas());
    JPanel panel = new JPanel();


    public Fourth(){
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


        panel.add(label);
        panel.add(time);
        ActionListener stoper = new WhatTimeIsIt();
        Timer timer = new Timer(1000, stoper);
        timer.start();
        this.getContentPane().add(panel);

    }

    private class WhatTimeIsIt implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            time.setText(pobierzCzas());

        }
    }
    static int i = 1;

    public String pobierzCzas(){
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        String h= "" + gregorianCalendar.get(Calendar.HOUR_OF_DAY); //// musimy ustawić stringa więc żeby oszukać program po znaku równości dajemy cudzysłów a następnie plus i zmienną typu gregorianCallendar, która jet intem
        String m= "" + gregorianCalendar.get(Calendar.MINUTE);  //// musimy ustawić stringa więc żeby oszukać program po znaku równości dajemy cudzysłów a następnie plus i zmienną typu gregorianCallendar, która jet intem
        String s= "" + gregorianCalendar.get(Calendar.SECOND);  //// musimy ustawić stringa więc żeby oszukać program po znaku równości dajemy cudzysłów a następnie plus i zmienną typu gregorianCallendar, która jet intem

        if(Integer.parseInt(h) < 10)
            h= "0" + h;
        if(Integer.parseInt(m) < 10)
            m= "0" + m;
        if(Integer.parseInt(s) < 10)
            s= "0" + s;

        return "" + h + ":" + m + ":" + s;

    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    public static void main(String[] args) {

        Fourth fourth = new Fourth();
    }
}
