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
          Paal paal=new Paal("spaceship1.png");
            GameOver go=new GameOver("gameover.png");

    public void initXlet(XletContext context) {
     TimerBron tb=new TimerBron();
     
     Timer t=new Timer();
     t.scheduleAtFixedRate(tb, 0, 10);
     Achtergrond ag=new Achtergrond("achtergrond.jpg");
     tb.registreer(ag);

     tb.registreer(vg);
     tb.registreer(paal);
     tb.registreer(go);
     
     HScene scene=HSceneFactory.getInstance().getDefaultHScene();
     scene.add(ag);
     scene.add(go);
          scene.add(vg);
          scene.popToFront(vg);
               scene.popToFront(go);
                    scene.add(paal);
          scene.popToFront(paal);
     scene.validate();
     scene.setVisible(true);
     CollisionDetector cd=new CollisionDetector(vg);
     cd.add(paal);
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

    public void userEventReceived(UserEvent arg0) {
       if (arg0.getCode()==HRcEvent.VK_UP)
       {
          vg.y-=50;
       }
    }
}
