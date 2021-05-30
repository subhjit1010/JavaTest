package magic;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class SimulateMouseMoveAndKeyPress {

    public static void main(String[] args) {

        try {

            // Create frame with specific title

            Frame frame = new Frame("Example Frame");

            // Create a component to add to the frame; in this case a text area with sample text

            Component textArea = new TextArea();

            // Add the components to the frame; by default, the frame has a border layout

            frame.add(textArea, BorderLayout.CENTER);

            // Show the frame

            int width = 300;

            int height = 300;

            frame.setSize(width, height);

            frame.setVisible(true);

            // These coordinates are screen coordinates

            int xCoord = 50;

            int yCoord = 100;

            // Move the cursor

            Robot robot = new Robot();

            robot.mouseMove(xCoord, yCoord);

            // Simulate a mouse click

            robot.mousePress(InputEvent.BUTTON1_MASK);

            robot.mouseRelease(InputEvent.BUTTON1_MASK);

            // Simulate a key press

            robot.keyPress(KeyEvent.VK_H);

            robot.keyRelease(KeyEvent.VK_H);

            robot.keyPress(KeyEvent.VK_E);

            robot.keyRelease(KeyEvent.VK_E);

            robot.keyPress(KeyEvent.VK_L);

            robot.keyRelease(KeyEvent.VK_L);

            robot.keyPress(KeyEvent.VK_L);

            robot.keyRelease(KeyEvent.VK_L);

            robot.keyPress(KeyEvent.VK_O);

            robot.keyRelease(KeyEvent.VK_O);

        } catch (AWTException e) {

            System.out.println("Low level input control is not allowed " + e.getMessage());
        }

    }
}
