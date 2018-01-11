class Outer{
    int a;
    //regulaer benutzbar in MyLocalClass, falls doSomething instanzgebunden
    static int f;
    //immer benutzbar in MyLocalClass
    void doSomething(){
        final int b;
        //wird von Java akzeptiert, da b final ist
        int c;
        //wird akzeptiert, da c effektiv final ist (wird nirgends veraendert)
        int d;
        //wird nicht akzeptiert, da d potenziell veraendert werden kann
        class MyLocalClass{ //darf nicht "Outer" heissen, keine Modifier, darf erben
            int e;
            //kann ganz normal ueber die Instanz aufgerufen werden
            void setExternalD(int n){
                //falls diese Methode entfernt wird, ist die Deklaration von d legitim
                d = n;
            }
            void setExternalA(int n){
                //Methode wird akzeptiert, da eine Variable ausserhalb der Methode gesetzt wird
                a = n;
            }
        }
        MyLocalClass local = new MyLocalClass();
    }
}
