import java.util.Scanner;
import java.util.Random;


public class TicTacToe {

    private static int playeronepoints = 0;
    private static int playertwopoints = 0;

    private static String a = " ", b = " ", c = " ", d = " ", e = " ", f = " ", g = " ", h = " ", i = " ";

    public static void main(String args[]) {

        System.out.println("Noughts and Crosses in Java\nBy hohoho");
        Setup();
    }

    private static void Setup(){

        a = " "; b = " "; c = " "; d = " "; e = " "; f = " "; g = " "; h = " "; i = " ";
        Menu();
    }


    private static void Menu(){
        System.out.println("\nSchreibe 'start' um zu beginnen");
        System.out.println("Schreibe 'punkte' um den aktuellen Punktestand abzurufen");
        System.out.println("Schreibe 'neu' um ein neues Spiel zu starten");
        System.out.println("Schreibe 'exit' um das Spiel zu beenden");

        Scanner Menu2 = new Scanner(System.in); // Eingabe
        String menuinput2 = Menu2.next();

        if(menuinput2.equals("start")){ // Spielstart
            Spiel();
        }

        else if(menuinput2.equals("punkte")){ // Punkteanzeige
            System.out.println("\nSpieler 1: " + playeronepoints);
            System.out.println("Spieler 2: " + playertwopoints);

            Menu();
        }

        else if(menuinput2.equals("neu")){ // neues Spiel
            playeronepoints = playertwopoints = 0;
            Setup();
        }

        else if(menuinput2.equals("exit")){ // Spiel beenden

            System.out.println("\nSpiel beendet");
            System.out.println("\nSpieler 1: " + playeronepoints);
            System.out.println("Spieler 2: " + playertwopoints);

            // Ermittlung des Gewinners
            if (playeronepoints > playertwopoints) {
                System.out.println("Gratuliere, Du hast das Spiel gewonnen"); }
            else if (playertwopoints > playeronepoints){
                System.out.println("Du hast leider verloren"); }
            else{
                System.out.println("Unentschieden"); }

            Ende();
        }

        else{
            System.out.println("Error --- Error --- Error");
            Menu();
        }
    }


    private static void Spiel() {




        String Spielfeld = " " + a + " | " + b + " | " + c + " " + "\n---|---|---\n" + " " + d + " | " + e + " | " + f + " " + "\n---|---|---\n" + " " + g + " | " + h + " | " + i + " ";

        System.out.println("\n"+Spielfeld);

        if(a.equals("X") && b.equals("X") && c.equals("X")){playeronepoints++; Ergebnis();}
        if(d.equals("X") && e.equals("X") && f.equals("X")){playeronepoints++; Ergebnis();}
        if(g.equals("X") && h.equals("X") && i.equals("X")){playeronepoints++; Ergebnis();}
        if(a.equals("X") && d.equals("X") && g.equals("X")){playeronepoints++; Ergebnis();}
        if(b.equals("X") && e.equals("X") && h.equals("X")){playeronepoints++; Ergebnis();}
        if(c.equals("X") && f.equals("X") && i.equals("X")){playeronepoints++; Ergebnis();}
        if(a.equals("X") && e.equals("X") && i.equals("X")){playeronepoints++; Ergebnis();}
        if(g.equals("X") && e.equals("X") && c.equals("X")){playeronepoints++; Ergebnis();}

        if(a.equals("O") && b.equals("O") && c.equals("O")){playertwopoints++; Ergebnis();}
        if(d.equals("O") && e.equals("O") && f.equals("O")){playertwopoints++; Ergebnis();}
        if(g.equals("O") && h.equals("O") && i.equals("O")){playertwopoints++; Ergebnis();}
        if(a.equals("O") && d.equals("O") && g.equals("O")){playertwopoints++; Ergebnis();}
        if(b.equals("O") && e.equals("O") && h.equals("O")){playertwopoints++; Ergebnis();}
        if(c.equals("O") && f.equals("O") && i.equals("O")){playertwopoints++; Ergebnis();}
        if(a.equals("O") && e.equals("O") && i.equals("O")){playertwopoints++; Ergebnis();}
        if(g.equals("O") && e.equals("O") && c.equals("O")){playertwopoints++; Ergebnis();}

        if (!a.equals(" ") && !b.equals(" ") && !c.equals(" ") && !d.equals(" ") && !e.equals(" ") && !f.equals(" ") && !g.equals(" ") && !h.equals(" ") && !i.equals(" ")){
            System.out.println(Spielfeld); Ergebnis();}

        System.out.println("\nBitte wähle dein Feld (1-9)");

        Scanner Spiel = new Scanner(System.in); // Eingabe
        int spielinput = Spiel.nextInt();

        if (spielinput == 1 && !a.equals("O")) { a = "X"; }
        if (spielinput == 2 && !b.equals("O")) { b = "X"; }
        if (spielinput == 3 && !c.equals("O")) { c = "X"; }
        if (spielinput == 4 && !d.equals("O")) { d = "X"; }
        if (spielinput == 5 && !e.equals("O")) { e = "X"; }
        if (spielinput == 6 && !f.equals("O")) { f = "X"; }
        if (spielinput == 7 && !g.equals("O")) { g = "X"; }
        if (spielinput == 8 && !h.equals("O")) { h = "X"; }
        if (spielinput == 9 && !i.equals("O")) { i = "X"; }

        Random ran = new Random(); // Errmittlung der Eingabe des "gegners" durch Zufallszahl
        int random = ran.nextInt(1);

        if (random == 0){

             if (a.equals("X") && c.equals("X") && b.equals(" ") || a.equals("O") && c.equals("O") && b.equals(" ")) { b = "O"; Spiel();}
        else if (a.equals("X") && b.equals("X") && c.equals(" ") || a.equals("O") && b.equals("O") && c.equals(" ")) { c = "O"; Spiel();}
        else if (c.equals("X") && b.equals("X") && a.equals(" ") || c.equals("O") && b.equals("O") && a.equals(" ")) { a = "O"; Spiel();}

        else if (d.equals("X") && f.equals("X") && e.equals(" ") || d.equals("O") && f.equals("O") && e.equals(" ")) { e = "O"; Spiel();}
        else if (d.equals("X") && e.equals("X") && f.equals(" ") || d.equals("O") && e.equals("O") && f.equals(" ")) { f = "O"; Spiel();}
        else if (f.equals("X") && e.equals("X") && d.equals(" ") || f.equals("O") && e.equals("O") && d.equals(" ")) { d = "O"; Spiel();}

        else if (g.equals("X") && i.equals("X") && h.equals(" ") || g.equals("O") && i.equals("O") && h.equals(" ")) { h = "O"; Spiel();}
        else if (g.equals("X") && h.equals("X") && i.equals(" ") || g.equals("O") && h.equals("O") && i.equals(" ")) { i = "O"; Spiel();}
        else if (i.equals("X") && h.equals("X") && g.equals(" ") || i.equals("O") && h.equals("O") && g.equals(" ")) { g = "O"; Spiel();}

        else if (a.equals("X") && d.equals("X") && g.equals(" ") || a.equals("O") && d.equals("O") && g.equals(" ")) { g = "O"; Spiel();}
        else if (a.equals("X") && g.equals("X") && d.equals(" ") || a.equals("O") && g.equals("O") && d.equals(" ")) { d = "O"; Spiel();}
        else if (d.equals("X") && g.equals("X") && a.equals(" ") || d.equals("O") && g.equals("O") && a.equals(" ")) { a = "O"; Spiel();}

        else if (b.equals("X") && e.equals("X") && h.equals(" ") || b.equals("O") && e.equals("O") && h.equals(" ")) { h = "O"; Spiel();}
        else if (b.equals("X") && h.equals("X") && e.equals(" ") || b.equals("O") && h.equals("O") && e.equals(" ")) { e = "O"; Spiel();}
        else if (e.equals("X") && h.equals("X") && b.equals(" ") || e.equals("O") && h.equals("O") && b.equals(" ")) { b = "O"; Spiel();}

        else if (c.equals("X") && f.equals("X") && i.equals(" ") || c.equals("O") && f.equals("O") && i.equals(" ")) { i = "O"; Spiel();}
        else if (c.equals("X") && i.equals("X") && f.equals(" ") || c.equals("O") && i.equals("O") && f.equals(" ")) { f = "O"; Spiel();}
        else if (f.equals("X") && i.equals("X") && c.equals(" ") || f.equals("O") && i.equals("O") && c.equals(" ")) { c = "O"; Spiel();}

        else if (a.equals("X") && e.equals("X") && i.equals(" ") || a.equals("O") && e.equals("O") && i.equals(" ")) { i = "O"; Spiel();}
        else if (a.equals("X") && i.equals("X") && e.equals(" ") || a.equals("O") && i.equals("O") && e.equals(" ")) { e = "O"; Spiel();}
        else if (e.equals("X") && i.equals("X") && a.equals(" ") || e.equals("O") && i.equals("O") && a.equals(" ")) { a = "O"; Spiel();}

        else if (c.equals("X") && e.equals("X") && g.equals(" ") || c.equals("O") && e.equals("O") && g.equals(" ")) { g = "O"; Spiel();}
        else if (c.equals("X") && g.equals("X") && e.equals(" ") || c.equals("O") && g.equals("O") && e.equals(" ")) { e = "O"; Spiel();}
        else if (e.equals("X") && g.equals("X") && c.equals(" ") || e.equals("O") && g.equals("O") && c.equals(" ")) { c = "O"; Spiel();}


        else {  if (e.equals(" ")) { e = "O"; Spiel();}

                if (a.equals(" ")) { a = "O"; Spiel();}
                if (b.equals(" ")) { b = "O"; Spiel();}
                if (c.equals(" ")) { c = "O"; Spiel();}
                if (d.equals(" ")) { d = "O"; Spiel();}

                if (f.equals(" ")) { f = "O"; Spiel();}
                if (g.equals(" ")) { g = "O"; Spiel();}
                if (h.equals(" ")) { h = "O"; Spiel();}
                if (i.equals(" ")) { i = "O"; Spiel();}
        }
        }




        Spiel();
    }


    private static void Ergebnis(){
        System.out.println("\n\nSpiel beendet");
        System.out.println("\nSpieler 1: " + playeronepoints);
        System.out.println("Spieler 2: " + playertwopoints + "\n");


        Setup(); //Reset der Punkte

        System.out.println("\n\n--- Neues Spiel ---"); // neues Spiel
        Menu();
    }

    private static void Ende(){
        System.exit(33);
    }

}
