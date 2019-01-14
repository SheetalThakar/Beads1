/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beads1;

/**
 * A Class to create some bead objects
 * @author mehta
 */
public class BeadTester1 {
    public static void main(String[] args)
    {
        //make yellow w
        // how to create objects
        // Create a model class and use it in some other 
        //class by creating main method
        Beads1 b1=new Beads1("yellow",'w');
        Beads1 b2=new Beads1();
        b2.setColor("red");
        b2.setLetter('s');
        //b2.letter='s';
        System.out.println("hiieee version1 Git Repository update");
        System.out.println("See you!");
        System.out.println("Bye!");
        System.out.println("See you!");
    }
}
