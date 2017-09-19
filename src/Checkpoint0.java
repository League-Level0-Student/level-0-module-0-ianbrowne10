import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class Checkpoint0 {
public static void main(String[] args) {
String color =	JOptionPane.showInputDialog("What's your favorite color?");
JOptionPane.showMessageDialog(null, "Cool, " +color+ " Is my favorite color too!");
Robot Joe = new Robot();
if (color.equalsIgnoreCase("blue")); {
Joe.setPenColor("blue");	
}




Joe.hide();
Joe.setPenWidth(10);
Joe.penDown();
Joe.setRandomPenColor();
Joe.setSpeed(10);
Joe.turn(60);
Joe.move(200);
Joe.turn(60);
Joe.move(200);
Joe.turn(-210);
Joe.move(340);
}
}
