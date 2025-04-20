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

    // The moveDiscs method displays a disc move using a recursive algorithm 
    private void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg) {
        if (num == 1) {
            System.out.println("Move disk 1 from peg " + fromPeg + " to peg " + toPeg);
        } else {
            moveDiscs(num - 1, fromPeg, tempPeg, toPeg); // Step 1
            System.out.println("Move disk " + num + " from peg " + fromPeg + " to peg " + toPeg); // Step 2
            moveDiscs(num - 1, tempPeg, toPeg, fromPeg); // Step 3
        }
    }
}
