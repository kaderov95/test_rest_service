import java.awt.event.*;
import javax.swing.*;


public class MouseCaptureDemo extends JFrame implements MouseMotionListener {
    public JLabel mouseHoverStatus;

    public static void main(String[] args) {
        new MouseCaptureDemo();
    }

    MouseCaptureDemo() {
        setSize(500, 500);
        setTitle("Frame displaying Coordinates of Mouse Motion");

        mouseHoverStatus = new JLabel("No Mouse Hover Detected", JLabel.CENTER);
        add(mouseHoverStatus);
        addMouseMoutionListener(this);
        setVisible(true);
    }

    private void addMouseMoutionListener(MouseCaptureDemo mouseCaptureDemo) {
    }


    public void mouseMoved(MouseEvent e) {
        mouseHoverStatus.setText("Mouse Cursor Coordinates => X:" + e.getX() + " | Y:" + e.getY());
    }

    public void mouseDragged(MouseEvent e) {

    }
}

