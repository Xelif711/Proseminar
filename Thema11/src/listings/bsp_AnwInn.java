public class HandyLaden{
    public static void main(String[] args){
        ALadevorgang lv = new ALadevorgang();

        Ladegeraet l = lv.new Adapter();
        lv.setLadegeraet(l);
        lv.aufladen();
    }
}
public class HandyA{
    private Ladegeraet l;

    public Ladegeraet getLadegeraet(){
        return l;
    }

    public void setLadegeraet(Ladegeraet l){
        this.l = l;
    }

    public void aufladen(){
        l.laden();
        System.out.println("Vollstaendig aufgeladen!");
    }

    class Adapter implements Ladegeraet{
        LadegeraetB lp = new LadegeraetB();
        public void laden(){
            lp.BLaden();
        }
    }
}

interface Ladegeraet{
    public void laden();
}

class LadegeraetB{
    public void BLaden(){

    }
}
