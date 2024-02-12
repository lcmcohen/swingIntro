import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Application to keep track of a books 'likes'
 *
 */
public class BookApp {

    JFrame mainFrame = new JFrame();

 String bookName;
    public static void main(String[] args) {
        System.out.println("TRACE: main is starting");

        BookApp bookApp = new BookApp();

        bookApp.getBookName();

        bookApp.buildGui();


        System.out.println("TRACE: main is ending");
        bookApp.getInfo();
    }


    /**
     * Build and connect the gui elements of our application.
     */
    private void buildGui() {


        // design the main "window"
        mainFrame.setSize(800,300);
        mainFrame.setTitle("Book Review for: " + bookName);
        mainFrame.getContentPane().setBackground(new Color(95, 200, 20));

        // create and add a label
        JLabel labInstruction = new JLabel("hello, tell us if you like the book '" + bookName + "'");
        mainFrame.add(labInstruction);

        // button for user to click if they like the book
        JButton btnLike = new MJCButton("Like");
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





    /**
     * Get some info from user
     * @return Map of info
     */
    private Map getInfo() {

        JTextField xField = new JTextField(5);
        JTextField yField = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("something:"));
        myPanel.add(xField);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("Another thing:"));
        myPanel.add(yField);

        int result = JOptionPane.showConfirmDialog(mainFrame, myPanel,
                "Please Enter Stuff", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("x value: " + xField.getText());
            System.out.println("y value: " + yField.getText());

            //TODO add stuff to map
        }



        return null; //TODO map
    }
}
