package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
        /* INSERT YOUR CODE HERE */

       // System.out.println ( model );

     System.out.print("  ");
        for (int i = 0; i < model.getWidth(); i++){
            System.out.print(i);
        }
        System.out.print("\n\n");
        int c = 0;
        while(c < model.getWidth()){
            System.out.print(c + " ");
            
            for (int i=0; i < model.getWidth(); i++){
                System.out.print(model.getMark(i, c));
            }
            c++;
            System.out.print("\n");
        }
    }


    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        /* INSERT YOUR CODE HERE */
        if(model.isXTurn == true){
            System.out.println("Player 1 (X) Move:") ;
        }else if (model.isXTurn == false){
            System.out.println("Player 2 (O) Move:") ;
        }

        //System.out.println("Enter the row and column numbers, separated by a space:");
        
    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */
        System.out.println("The character inputed is not a valid row or Column");

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}