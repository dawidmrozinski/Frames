import javax.swing.*;
import java.awt.*;
public class Main extends JFrame {

    public Main(){
     /**   JFrame frame = new JFrame();
       * frame.setTitle("Ramka"); //nazywa ramkę
      * frame.setSize(700,700);//ustawianie wymiarów ramki za pomocą szerokości i wysokości
       * frame.setLocation(300,20);
       * //frame.setBounds(300,20, 700,700); ustawia wysokość, szerokość i położenie ramki
       * frame.setResizable(false);//blokowanie zmiany rozmiaru i przesuwania ramki
       * frame.setBackground(Color.BLUE);
      *  frame.setIconImage(Toolkit.getDefaultToolkit().getImage("obrazek.jpg"));
      *  frame.setVisible(true); //trzeba uczynić ramkę widzialną
      * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// stała, która powoduje, że możemy wyłączyc ramkę bez zatrzymywania procesu
       * //zamiast JFrame.EXIT_ON_CLOSE możemy użyć WindowsConstants.EXIT_ON_CLOSE

      */
     int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;// pobieranie szerokości ekranu na którym wyświatla się
        //program
     int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;//pobieranie wysokści ekranu na którym wyświatla się
        //program
     this.setSize(screenWidth/2, screenHeight/2); //ustawiamy rozmiar ramki na podstawie rozdzielczości ekranu
     //this.setLocation(screenWidth/4, screenHeight/4);
        int frameWidth = this.getSize().width;
        int frameHeight = this.getSize().height;
        this.setLocation((screenWidth - frameWidth)/2, (screenHeight - frameHeight)/2);
        //ustawiamy lokalizację ramki na podstawie rozmiaru ekranu i ramki
     this.setTitle("Ramka");
     this.setIconImage(Toolkit.getDefaultToolkit().getImage("obrazek.jpg"));
     this.setBackground(Color.green);
        initComponets();
       // this.pack();
     this.setVisible(true);
     this.setDefaultCloseOperation(3);


      }

      public void initComponets(){ //metoda w której inicjalizujemy komponenty czyli np. przyciski

      /*  center = new JButton("1"); //tworzymy nowy obiekt typu przycisk, odwołując się do naszej zmiennej JButton center
        up  = new JButton("2");
        down  = new JButton("3");
        right  = new JButton("4");
        left  = new JButton("5");
        Container container = this.getContentPane(); //żeby pojawiło się w naszej ramce to trzeba pobrać szybkę z klasy Container, tworząc obiekt tyu tej klasy
        *//*container.add(center, BorderLayout.CENTER);//następnie dodajemy przycisk i za pomocą BorderLayout ustawiamy miejsce, w którym ma znajdować się przycisk
        container.add(up, BorderLayout.NORTH);
        container.add(down, BorderLayout.SOUTH);
        container.add(right, BorderLayout.WEST);
        container.add(left, BorderLayout.EAST);*//*
       //ustawianie miejsca, w któym ma być nasz przycisk
          center.setLocation(100, 100);
          center.setSize(50,50);
         container.setLayout(null);
         container.add(center);*/
        //  this.getContentPane().add(center = new JButton("1"), BorderLayout.LINE_START); można też tak
          panel1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
          button1.setSize(30, 30);
          panel1.add(button1);
          button2.setSize(30, 30);
          panel1.add(button2);
          button3.setSize(30, 30);
          panel1.add(button3);
          button4.setSize(30, 30);
          panel1.add(button4);

          this.getContentPane().add(panel1, BorderLayout.PAGE_START);

      }
    //  JButton center;//tworzymy w ten sposób obekt typu przycisk
    /*JButton up;
    JButton down;
    JButton left;
    JButton right;*/
    JPanel panel1= new JPanel(new FlowLayout(FlowLayout.LEADING));
    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    JButton button4 = new JButton("Button 4");



    public static void main(String[] args) {

      Main main = new Main();

    }

}
