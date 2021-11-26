package game;
import config.*;
import java.util.Timer;
import java.util.TimerTask;

//Bewegung des Spielers
public class Player {
Timer move;
    public Player(){
        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask(){

            @Override public void run(){

                //wenn pfeiltaste nach links gedrückt ist moveleft gleich war und der spieler bewegt sich um 2 nach oben
                if(Var.moveleft==true){

                //Spieler bewegt sich solange nach links bis er an eine Grenze stöhst in dem Fall 20
                    if(Var.x >=20){
                        Var.x = Var.x-2;// alternativ Var.x -=2;
                      }
                }

                //wenn pfeiltaste nach rechts gedrückt ist moveright gleich war und der spieler bewegt sich um 2 nach rechts
                else if(Var.moveright==true){

                //Spieler bewegt sich solange nach rechts bis er an eine Grenze stöhst in dem Fall höhe-200
                    if(Var.x<=Var.screenwidth -170){
                        Var.x= Var.x+2; //alternativ Var.y +=2;
                      }
                }
            }


        },0,6 );

    }
}
