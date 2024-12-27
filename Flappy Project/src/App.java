import javax.swing.*;



public class App {
    public static void main(String[] args) throws Exception {
        
        int boardWidth = 360;
       int boardHeight = 640;

       JFrame frame = new JFrame("Flappy Bird"); // title of our window (game)
      // frame.setVisible(true);
       frame.setSize(boardWidth, boardHeight);
       frame.setLocationRelativeTo(null); // set the heading name of the app in the centre
       frame.setResizable(false);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // app window closes when exit is pressed

         FlappyBird flappyBird = new FlappyBird(); // calling the new frame 
         frame.add(flappyBird); // adding the new method to our frame 
         frame.pack();
         flappyBird.requestFocus();
         frame.setVisible(true);// so that the title  frame is speerate from the dimensions (blue part)
         


    }
}



