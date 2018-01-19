public class OuterClass{

    private int a;
    //nur fuer InnerClass sichtbar

    private static int b;
    //fuer InnerClass sowie StaticInnerClass sichtbar

    private class InnerClass{
    //nur fuer eine Instanz der OuterClass sichtbar,
    //maximale Kapselung der InnerClass
    }

    public static StaticInnerClass{
    //fuer alle sichtbar
    }
}
