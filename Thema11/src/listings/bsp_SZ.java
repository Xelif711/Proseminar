public class OuterClass{

    private int a;
    //nur für InnerClass sichtbar

    private static int b;
    //für InnerClass sowie StaticInnerClass sichtbar

    private class InnerClass{
    //nur für eine Instanz der OuterClass sichtbar, maximale Kapselung der InnerClass
    }

    public static StaticInnerClass{
    //für alle sichtbar
    }
}
