import javax.swing.JOptionPane;

public class AWESOME {
public static void main(String[] args) {
String one = JOptionPane.showInputDialog("What is something you find awesome?");	
String two = JOptionPane.showInputDialog("What is another thing you find awesome?");
JOptionPane.showMessageDialog(null, "Cool I think that "+ one + two);
}
}
