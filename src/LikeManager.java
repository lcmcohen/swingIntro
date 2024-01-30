import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Manage all aspects of liking a book
 */
public class LikeManager implements ActionListener {
    JLabel lblLike;
    boolean isLiked = false;
    public LikeManager(JFrame mainFrame) {
        //Construct items neded for liking a book
        ImageIcon likeIcon = new ImageIcon("C:\\Users\\student\\myprojs\\DS2_swing\\likeey.png", "LIKEEY");
        this.lblLike = new JLabel("LABEL", likeIcon, SwingConstants.CENTER );
       // this.lblLike.setSize();
        this.lblLike.setVisible(isLiked);
        mainFrame.add(this.lblLike);
    }

    /**
     * Invoked when an action occurs.
     * Toggle 'like' state, display Likeey image of current state is liked.
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("LIKE button clicked");
        isLiked = !isLiked;
        Object obj = e.getSource();
        JButton srcButton = (JButton) obj;
        srcButton.setText(isLiked ? "UnLike" : "Like");
        lblLike.setVisible(isLiked);
    }
}
