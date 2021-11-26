package config;
import javax.swing.*;

//eine globale datei für alle Variabeln
public class Var { 
    
    //Variable für gui
    public static JFrame jf1;
    public static int screenwidth=800, screenheight=600;

    //Variable für Spieler 1,2 und ball
    public static int x=screenwidth/2 -100, y=450;
    public static int ballx= screenwidth/2-10, bally=screenheight/2-10;
    public static int balldirx =1, balldiry = -1;

    //Variablen für Bewegung
    public static boolean  moveleft= false, moveright= false;

    //Variabblen für Punkte
    public static int points= 0;
    public static int bestscore=0;




    

}
