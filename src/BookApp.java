import javax.swing.*;
import java.awt.*;

/**
 * Application to keep track of a books 'likes'
 *
 */
public class BookApp {
 String bookName;
    public static void main(String[] args) {
        System.out.println("TRACE: main is starting");

        BookApp bookApp = new BookApp();

        bookApp.getBookName();

        bookApp.buildGui();


        System.out.println("TRACE: main is ending");
    }

    /**
     * Build and connect the gui elements of our application.
     */
    private void buildGui() {
        JFrame mainFrame = new JFrame();

        // design the main "window"
        mainFrame.setSize(800,300);
        mainFrame.setTitle("Book Review for: " + bookName);
        mainFrame.getContentPane().setBackground(new Color(95, 200, 20));

        // create and add a label
        JLabel labInstruction = new JLabel("hello, tell us if you like the book '" + bookName + "'");
        mainFrame.add(labInstruction);

        // button for user to click if they like the book
        JButton btnLike = new JButton("Like");
        btnLike.setSize(60,20);
        mainFrame.add(btnLike, BorderLayout.WEST);

        // say what should happen when user clicks button
        LikeManager lh = new LikeManager(mainFrame);

        // set the LikeManager as the handler for all events related to the like button
        btnLike.addActionListener(lh);

        mainFrame.setVisible(true);
    }

    private void getBookName() {
        bookName = JOptionPane.showInputDialog("What book do you want to review");
    }

}
