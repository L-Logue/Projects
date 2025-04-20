public class Towers {
    // solution to the game of Hanoi 
    public int numDiscs; // number of discs
    // Constructor param - number of discs used 
    // Constructor calls a recursive method
    public Towers(int n) {
        this.numDiscs = n;
      
        // Move the number of disc from peg 1 to peg 3 
        // using peg 2 as a temporary storage location.
        //calling recursive method 
        this.moveDiscs(this.numDiscs, 1, 3, 2); 
    }

    //The moveDisc method displays a disc move using a recursive algorithm 
    private void moveDiscs(int num, int fromPeg, 
                           int toPeg, int tempPeg) {
        if (num > 0) {
            // recursive call - makes another whole copy of the method in RAM
            moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
            System.out.println("Move a disk from peg " + 
                   fromPeg + " to peg " + toPeg);
        

            moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
        }
    }
}
