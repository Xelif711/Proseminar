import java.util.Random;

public class Kuchen{
    private Geschmack g;
    public Kuchen(Geschmack g){
        this.g = g;
    }
    void getFeedback(){
        class Mensch{
            Geschmack g;
            public Mensch(){
                Random rand = new Random();
                int r = rand.nextInt(3);
                if(r == 0){
                    this.g = Geschmack.Kuchen;
                }else if(r == 1){
                    this.g = Geschmack.Apfel;
                }else{
                    this.g = Geschmack.Schokoladen;
                }
            }
            void kuchenEssen(Kuchen k){
                if(k.g == g || g == Geschmack.Kuchen){
                    System.out.println("Mhm, dieser Kuchen mit " + k.g.toString() + "geschmack schmeckt aber gut.");
                }else{
                    System.out.println("Ich mag keine Kuchen mit " + k.g.toString() + "geschmack.");
                }
            }
        }
        Mensch m1 = new Mensch();
        Mensch m2 = new Mensch();
        Mensch m3 = new Mensch();
        Mensch m4 = new Mensch();
        m1.kuchenEssen(this);
        m2.kuchenEssen(this);
        m3.kuchenEssen(this);
        m4.kuchenEssen(this);
    }
}
enum Geschmack{
    Kuchen, Apfel, Schokoladen
}
