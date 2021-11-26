package game;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import config.Var;
//Die Ballbewegung
public class Ball {
Timer move;
    public Ball(){
        move= new Timer();
        move.scheduleAtFixedRate(new TimerTask() {

            @Override public void run(){
                
              //Rechne dauerhaft Ballrichtung auf Positionen des Balles
                Var.ballx += Var.balldirx;
                Var.bally += Var.balldiry;
                
                //Unten
                 Random r = new Random();
                if(Var.bally +60 >= Var.screenheight){
                    Var.balldiry= 1;
                    Var.ballx=Var.screenwidth- r.ints(0,800).findFirst().getAsInt();
                    Var.bally=Var.screenheight/2 -300;
                    Var.points=0;
                }
                //Oben
                if(Var.bally <= 0){
                    Var.balldiry= 1;
                }
    
                //Kollisionsprüfung mit dem linken und rechten Rand im falle von Kolision zurücksetzten zum Mittelpunkt und erhöhen der Punkte um 1
                //rechts
                if(Var.ballx +40 >= Var.screenwidth){
                    Var.balldirx=-1;
                }
    
                //links
                if(Var.ballx <= 0){
                    Var.balldirx=1;

                }
            
    
                //Spielerkollision im falle von Kollision Richtungswechsel 
                if(Var.ballx <Var.x +100 && Var.ballx > Var.x && Var.bally <Var.y +25 && Var.bally +20> Var.y){
                    Var.balldiry = -1;
                    Var.points +=1;
                }
                if(Var.points>Var.bestscore){
                    Var.bestscore= Var.points;

                }
            }
            
        }, 0, 4);
    }
}
