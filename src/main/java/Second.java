import javax.swing.*;
import java.awt.*;
public class Second extends JFrame{

    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    JButton button4 = new JButton("Button 4");
    JButton cancel = new JButton("Cancel");

    public Second(){
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;

    this.setVisible(true);
    this.setSize(screenWidth/2, screenHeight/2);

        int frameWidth = this.getSize().width;
        int frameHeight = this.getSize().height;
    this.setLocation((screenWidth - frameWidth)/2, (screenHeight - frameHeight)/2);
    initComponents();
    this.setDefaultCloseOperation(3);
    }

    public void initComponents(){
        GroupLayout groupLayout = new GroupLayout(getContentPane());

        this.getContentPane().setLayout(groupLayout);

        groupLayout.setAutoCreateGaps(true); //żeby utworzyć odstępy między przyciskami
        groupLayout.setAutoCreateContainerGaps(true); //żeby utworzyć odstęp od górnej linii aplikacji

        groupLayout.setHorizontalGroup( //tworzymy grupę przycsków horyzontalnie (jeden obok drugiego)
                groupLayout.createSequentialGroup()
                .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)//po pierwszym przycisku ustawiamy jakiej minimalnej wielkośći ma być nasz przycisk, po drugim preferowanej, a po trzecim maksymalnej, czyli czy mają się zwijać, czy zostać na swoim miejscu, czy też nie
                .addGroup(groupLayout.createParallelGroup().addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addComponent(button4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))//żeby w sekwencji były przyciski jeden pod drugim
                .addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(cancel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)

        );

        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup().addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addComponent(button4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(0, Short.MAX_VALUE)
                .addComponent(cancel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
    }




    public static void main(String[] args) {

        Second second = new Second();


    }

}
