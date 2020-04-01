public class Kassa implements IKassa {

    private double totaalPrijs;
    private int aantalProducten;

    public Kassa() {
        totaalPrijs = 0;
        aantalProducten = 0;
    }

    @Override
    public void voegProductToe(double prijs) {
        totaalPrijs += prijs;
        aantalProducten++;
    }

    @Override
    public double berekenTotaal() {
        if(totaalPrijs >= 100.0 && aantalProducten >= 3)
            return totaalPrijs * 0.9;

        return totaalPrijs;
    }

    @Override
    public int vraagAantalProductenOp() {
        return aantalProducten;
    }

    @Override
    public void maakLeeg() {
        totaalPrijs = 0.0;
        aantalProducten = 0;
    }

}
