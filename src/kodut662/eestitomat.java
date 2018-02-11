package kodut662;

public class eestitomat extends tomat{
    protected int S2ilivus;

    public eestitomat(double kaal, int kypsustase, String sort, double baashind){
        this.Kaal = kaal;
        this.Kypsustase = kypsustase;
        this.Sort = sort;
        this.Baashind = baashind;
    }

    /*Säilivuse leiab lahutades maha 10st küpsustaseme (10palli süsteemi järgi, 10 - kõige pikemini säiliv, 1 - säilivusaeg läbi) */
    public int arvutaS2ilivus(){
        S2ilivus = 10 - Kypsustase;
        return S2ilivus;
    }

    /* Hinna leidmiseks tuleb korrutada kokku baashind ning säilivus, juhul kui kaal on suurem kui 0.2 siis tuleb hinnale 5% juurde lisada */
    public double arvutaHind() {
        double hind = Baashind * S2ilivus;
        if (Kaal > 0.2){
            hind = hind * 0.05;
        }
        return hind;
    }
}
