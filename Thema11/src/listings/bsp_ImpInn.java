//Listing 2.1: Generelle Implementierung

class OuterClass{

    int b;
    //wird vom b der RandomClass verdeckt

    class InnerClass extends RandomClass{
    //kann auch private oder protected sein,
    //darf nicht OuterClass heissen, darf erben

        static int a;
        //a wuerde hier einen Fehler hervorrufen,
        //da die Variable statisch ist

        int b;
        //b ist erlaubt, verdeckt b der OuterClass/RandomClass
    }

    static class StaticInnerClass{

        //beide Variablen sind erlaubt
        static int c;
        int d;
    }
}

public class RandomClass{
    int b;
    //wird vom b der InnerClass verdeckt
}
