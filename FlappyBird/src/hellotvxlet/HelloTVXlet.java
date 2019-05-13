package hellotvxlet;

import java.util.Timer;
import javax.tv.xlet.*;
import org.bluray.ui.event.HRcEvent;
import org.dvb.event.EventManager;
import org.dvb.event.UserEvent;
import org.dvb.event.UserEventListener;
import org.dvb.event.UserEventRepository;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;


public class HelloTVXlet implements Xlet, UserEventListener {
          Vogel vg=new Vogel("spaceship1.png");
    //      Paal paal=new Paal("paal.png",true);
    //                Paal paal2=new Paal("paal.png",false);
            GameOver go=new GameOver("gameover.png");
     HScene scene=HSceneFactory.getInstance().getDefaultHScene();
          TimerBron tb=new TimerBron();
     
    public void initXlet(XletContext context) {

     Timer t=new Timer();
     t.scheduleAtFixedRate(tb, 0, 10);
     Achtergrond ag=new Achtergrond("achtergrond.jpg");


     tb.registreer(vg);
    //      tb.registreer(paal2);
  //   tb.registreer(paal);
     tb.registreer(go);
     

     scene.add(ag);
     scene.add(go);
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
          PaalGenerator pg=new PaalGenerator(scene,tb,cd);
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

    public void userEventReceived(UserEvent arg0) {
       if (arg0.getCode()==HRcEvent.VK_UP)
       {
          vg.vlieg=20;  // vlieg tot y-50
       }
    }
}
