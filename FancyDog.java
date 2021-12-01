import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FancyDog implements Animal {

    @Override
    public void eat() {
                 
    }

    @Override
    public void makeNoise() {
        JFrame parent = new JFrame();
        JOptionPane.showMessageDialog(parent, "Bark, Bark");        
    }
    
    
}
