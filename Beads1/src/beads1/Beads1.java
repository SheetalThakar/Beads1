
package beads1;

/**
 *A Class to model Bead Objects
 * @author mehta
 */
public class Beads1 {

    private String color;
    private char letter;

    //constructor - initialization - method
    public Beads1()
    {
        color="pink";
        letter='a';
    }
    public Beads1(String givenColor,char givenLetter)
    {
        color=givenColor;
        letter=givenLetter;
    }
    
    //Refractor/Encapsulate Fields/tick all
     /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param @givencolor the color to set
     */
    public void setColor(String givencolor) {
        color = givencolor;
    }

    /**
     * @return the letter
     */
    public char getLetter() {
        return letter;
    }

    /**
     * @param @givenletter the letter to set
     */
    public void setLetter(char givenletter) {
        letter = givenletter;
    }
   
    
}
