import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TryAgain extends JFrame {
    TryAgain(){

        JLabel label = new JLabel();
        label.setText("GAME OVER");
        label.setFont(new Font("Arial", Font.BOLD, 35));
        //Add image to frame 
        this.add(label);

        //JButton Try again
        JButton tryAgainbutton = new JButton();
        tryAgainbutton.setText("Play Again");
        tryAgainbutton.setFont(new Font("Arial", Font.BOLD, 25));
      
        //JButton Exit
        JButton exitButton = new JButton();
        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 25));

        tryAgainEventHandler again = new tryAgainEventHandler();
        tryAgainbutton.addActionListener(again);
        
        ExitEventHandler exit = new ExitEventHandler();
        exitButton.addActionListener(exit);

        this.add(tryAgainbutton);
        this.add(exitButton);


        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(250,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        //set background color of frame
        this.getContentPane().setBackground(Color.MAGENTA);
        //lock frame
        this.setResizable(false);
    } 
    private class tryAgainEventHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){

            new GameFrame();
            dispose();
        }
}
private class ExitEventHandler implements ActionListener{
    public void actionPerformed(ActionEvent event){

        dispose();
    }
}
}