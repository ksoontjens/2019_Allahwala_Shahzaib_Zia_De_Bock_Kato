/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import org.havi.ui.HScene;

/**
 *
 * @author shahz
 */
public class PaalGenerator implements Levend {
    int teller=0;
    private HScene scene;
    private TimerBron tb;
    private CollisionDetector cd;
public PaalGenerator(HScene scene, TimerBron tb, CollisionDetector cd)
{
    this.scene=scene;
    this.tb=tb;
    this.cd=cd;
}
    public void leef() {
        teller++;
      if (teller%400==0)
      {   Paal paal=new Paal("paal.png",true);
                    Paal paal2=new Paal("paal.png",false);
                 tb.registreer(paal2);
     tb.registreer(paal);
     scene.add(paal);
     cd.add(paal);
     scene.popToFront(paal);
     
     scene.add(paal2);
     cd.add(paal2);
     scene.popToFront(paal2);
   
      }
    }

}
