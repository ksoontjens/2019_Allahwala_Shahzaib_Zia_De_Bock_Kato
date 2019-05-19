/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;

/**
 *
 * @author shahz
 */
public class GameOver  extends Sprite {
    public GameOver (String filename) 
    {
        super(filename);
    }
 public void leef() {
 //   System.out.println("go");
  //    x=x-1;

   //   x--; //=3;
      this.repaint();

    }


}
