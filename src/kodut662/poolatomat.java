package kodut662;

public class poolatomat extends tomat {
    protected int Ymarus;

    public poolatomat(int ymarus, double kaal, int kypsustase, String sort, double baashind) {
        this.Ymarus = ymarus;
        this.Kaal = kaal;
        this.Kypsustase = kypsustase;
        this.Sort = sort;
        this.Baashind = baashind;
    }

    /*Säilivuse leidmiseks sama arvutus kui eesti tomatil, kuid lahendus tuleb jagada 2-ga, kuna tuleb teisest riigist*/
    public double arvutaS2ilivus(){
        int S2ilivus = (10 - Kypsustase)/2;
        return S2ilivus;
    }

    public double arvutaHind(){
        double hind = Baashind * arvutaS2ilivus();
        if (Kaal > 0.2) {
            hind = hind * 0.05;
        }
        return hind;
    }
}
