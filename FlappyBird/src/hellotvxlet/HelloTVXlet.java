package hellotvxlet;

// dit is commentaar
// en dit ook



import java.awt.Color;
import java.awt.Font;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Timer;
import javax.tv.xlet.*;
import org.bluray.ui.event.HRcEvent;
import org.dvb.event.EventManager;
import org.dvb.event.UserEvent;
import org.dvb.event.UserEventListener;
import org.dvb.event.UserEventRepository;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;
import org.havi.ui.HStaticText;


public class HelloTVXlet implements Xlet, UserEventListener {
          Vogel vg;
 
            GameOver go=new GameOver("gameover.png");
     HScene scene=HSceneFactory.getInstance().getDefaultHScene();

         public HStaticText score;
    public HStaticText prevScore;
    public HStaticText highScore;
      Timer t;
         TimerBron tb;
         
    public void initXlet(XletContext context) {
        startSpel();
    }
    
    
    public void startSpel() {
   t=new Timer();
          tb=new TimerBron();
          vg=new Vogel("spaceship1.png");
     t.scheduleAtFixedRate(tb, 0, 10);
     Achtergrond ag=new Achtergrond("achtergrond.jpg");

    this.score = new HStaticText("score:0",500,20,100,50);
  /*  File file = new File("Arial.ttf");
	FileInputStream fis=null;
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, fis);
               this.score.setFont(font);
        } catch (Exception ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
 */
    //this.score.setBounds(100,99, 200, 50);
    this.score.setForeground(Color.WHITE);
    
scene.add(score);
scene.popToFront(score);
     tb.registreer(vg);
    //      tb.registreer(paal2);
  //   tb.registreer(paal);
     tb.registreer(go);
     

     scene.add(ag);

          scene.add(vg);
          scene.popToFront(vg);
               //scene.popToFront(go);
            // scene.add(paal2);
              //      scene.add(paal);
       //   scene.popToFront(paal);
         //           scene.popToFront(paal2);
     scene.validate();
     scene.setVisible(true);
     CollisionDetector cd=new CollisionDetector(vg, ag,this);
     tb.registreer(cd);
//     cd.add(paal);
  //        cd.add(paal2);
         // cd.add(vg);
               tb.registreer(ag);
          PaalGenerator pg=new PaalGenerator(scene,tb,cd, score);
          tb.registreer(pg);
          
     UserEventRepository rep=new UserEventRepository("naam");
     rep.addAllArrowKeys();
     EventManager.getInstance().addUserEventListener(this, rep);
    }

    public void startXlet() {
    
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }
    public void stopSpel()
    {
        scene.add(go);
        scene.popToFront(go);
        scene.repaint();
        tb.disabled=true;
    }
    
       public void restartSpel()
    {
        scene.removeAll();
        scene.repaint();
        tb.disabled=false;
        t.cancel();
        startSpel();
    }


    public void userEventReceived(UserEvent arg0) {
       if (arg0.getCode()==HRcEvent.VK_UP)
       {
          vg.vlieg=20;  // vlieg tot y-50
       }
       if(tb.disabled == true){
           if (arg0.getCode()==HRcEvent.VK_DOWN)
       {
          restartSpel();
       }
       }
       
    }
}
