public class HandyLaden{
    public static void main(String[] args){
        SamsongLadevorgang lv = new SamsongLadevorgang();
        Ladegeraet l = lv.new Adapter();
        lv.setLadegeraet(l);
        lv.aufladen();
    }
}
public class SamsongLadevorgang{
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
        LadegeraetEiPhone lp = new LadegeraetEiPhone();
        public void laden(){
            lp.eiPhoneLaden();
        }
    }
}
interface Ladegeraet{
    public void laden();
}
class LadegeraetEiPhone{
    public void eiPhoneLaden(){
    }
}
