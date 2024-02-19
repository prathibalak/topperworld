import javax.swing.*;

public class game {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()*100 + 1);
        int userAns = 0;
        int count = 1;
        while (userAns != computerNumber) {
            String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 to 100","guessing game",3 );
            userAns = Integer.parseInt(response);

            JOptionPane.showMessageDialog(null,""+determineGuess(userAns,computerNumber,count));
            count++;
            
        }
    }

    public static String determineGuess(int userAns, int computerNumber, int count){
        if(userAns <= 0 || userAns > 100){
            return "Your guess is invalid";
        }
        else if (userAns == computerNumber) {
            return "Correct!\n Total Guesses:" + count;
        }
        else if (userAns > computerNumber) {
            return "Your guess is too high, try again.\nTry Number:" + count;
        }
        else if (userAns < computerNumber) {
            return "Your guess is too low, try again.\nTry Number:" + count;
        }
        else{
            return "Your guess is incorrect\n Try Number:" + count;
        }
    }

    
}
