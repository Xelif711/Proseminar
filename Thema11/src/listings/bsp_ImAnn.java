public class Main{
    public static void main(String[] args){

        PrintNumbers a = new PrintNumbers(){
            //alle Attribute gelten strenggenommen
            //nur fuer die Methoden der Instanz a

            int y = 20;
            //a.y kann nicht abgerufen werden,
            //jedoch koennen die Methoden y verwenden.

            public void printY(){
                //kann nicht als "a.printY()" aufgerufen werden,
                //muss in eine andere Methode eingebunden werden
                System.out.println(y);
            }

            public void printVariables(){
                //printVariables wird ueberschrieben
                System.out.println(x + " " + y);
                printY();
            }
        };
        //Da printVariables auch innerhalb der Oberklasse existiert,
        //kann sie von der Instanz a aufgerufen werden
        a.printVariables();
        //Ausgabe:"10 20" \n "20"
    }
}
class PrintNumbers{
    //alle Attribute sind in der anonymen Klasse sichtbar

    int x = 10;

    public void printVariables(){
        System.out.println(x);
    }
}
