import java.util.Random;

public class Student{
    private Schwierigkeit vorbereitung;
    public Student(Schwierigkeit v){
        this.vorbereitung = v;
    }
    void klausurenSchreiben(int anzahl){
        class Klausur{
            Schwierigkeit s;
            public Klausur(){
                Random rand = new Random();
                int r = rand.nextInt(3);
                switch(r){
                    case 0: this.s = Schwierigkeit.LEICHT;
                            break;
                    case 1: this.s = Schwierigkeit.MITTEL;
                            break;
                    case 2: this.s = Schwierigkeit.SCHWER;
                            break;
                }
            }
            void klausurSchreiben(){
                if(vorbereitung == Schwierigkeit.SCHWER){
                    System.out.println("Ich habe bestanden, da meine Vorbereitung gut war.");
                }else if(vorbereitung == Schwierigkeit.MITTEL){
                    if(s != Schwierigkeit.SCHWER){
                        System.out.println("Ich habe bestanden, weil die Klausur nicht allzu schwer war.");
                    }else{
                        System.out.println("Die Klausur war viel zu schwer.");
                    }
                }else{
                    if(s == Schwierigkeit.LEICHT){
                        System.out.println("Zum Glueck war die Klausur leicht.");
                    }else{
                        System.out.println("Ich habe mich nicht genug vorbereitet.");
                    }
                }
            }
        }
        for(int i = 0; i < anzahl; i++){
            Klausur klausur = new Klausur();
            klausur.klausurSchreiben();
        }
    }
}
enum Schwierigkeit{
    LEICHT, MITTEL, SCHWER
}
