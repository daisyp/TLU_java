package tund2;

public class Plastiliin {
    protected double massgr;
    public Plastiliin(double mass) {
        massgr=mass;
    }
    public String toString(){
        return "Plastiliinitykk massiga "+massgr+" grammi";
    }
    //mass grammidest kilogrammideks
    public double masskg(){
        return massgr/1000.0;
    }
    public double mass(Massiyhik yhik) {
        if (yhik == Massiyhik.GRAMM) {
            return massgr;
        }
        if (yhik == Massiyhik.KILOGRAMM) {
            return massgr / 1000;
        }
        if (yhik == Massiyhik.NAEL) {
            return massgr / 453;
        }
        if (yhik == Massiyhik.MILLIGRAMM) {
            return massgr * 1000;
        }
        if (yhik == null) {
            throw new RuntimeException("yhik puudub");
        }
        throw new RuntimeException("Tundmatu yhik " + yhik);

    }

    public Plastiliin yhenda(Plastiliin lisatav){
        massgr+=lisatav.massgr;
        lisatav.massgr=0;
        return this;
    }

    public Plastiliin eralda(double grammid){
        if(grammid>massgr){
            throw new RuntimeException("ei jagu piisavalt");
        }
        Plastiliin uus= new Plastiliin(grammid);
        massgr-=grammid;
        return uus;

    }

}
