/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import java.util.ArrayList;

/**
 *
 * @author shahz
 */
public class CollisionDetector implements Levend {

      ArrayList al=new ArrayList();
      Vogel v;
      Achtergrond a;
      HelloTVXlet hoofdprog;
      
    public CollisionDetector(Vogel vg, Achtergrond ag,   HelloTVXlet hoofdprog)
    {
        v=vg;
        a=ag;
        this.hoofdprog=hoofdprog;
    }
    public void leef() {
     //   System.out.println(".");
       for (int i=0;i<al.size();i++)
       {
           Paal p=((Paal)al.get(i));
           if (p.getBounds().intersects(v.getBounds()))
           {
               hoofdprog.stopSpel();
               for(int l=0; l<100; l++){
                   System.out.println("COLLISION!!!" + l);
               }
               
           }

           
       }
              if (v.y>576){
                   hoofdprog.stopSpel();
                   }
              if (v.y<0){
                   v.y = 288;
               }
    }
    
    public void add(Paal l)
    {
        al.add(l);
    }


}
