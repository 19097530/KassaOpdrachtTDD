import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KassaTest {

    @Test
    void voegProductToe() {
        Kassa kassa = new Kassa();
        assertEquals(0, kassa.berekenTotaal(), 0.01);

        kassa.voegProductToe(10.00);
        assertEquals(10.00, kassa.berekenTotaal(), 0.01);
        assertEquals(1, kassa.vraagAantalProductenOp());

        kassa.voegProductToe(20.00);
        assertEquals(30.00, kassa.berekenTotaal(), 0.01);
        assertEquals(2, kassa.vraagAantalProductenOp());
    }

    @Test
    void berekenTotaalOnder100EuroEnOnder3Producten() {
        Kassa kassa = new Kassa();
        assertEquals(0, kassa.berekenTotaal(), 0.01);

        kassa.voegProductToe(10.00);
        assertEquals(10.00, kassa.berekenTotaal(), 0.01);
    }

    @Test
    void berekenTotaalOnder100EuroEnBoven3Producten() {
        Kassa kassa = new Kassa();
        assertEquals(0, kassa.berekenTotaal(), 0.01);

        kassa.voegProductToe(10.00);
        assertEquals(10.00, kassa.berekenTotaal(), 0.01);

        kassa.voegProductToe(10.00);
        assertEquals(20.00, kassa.berekenTotaal(), 0.01);

        kassa.voegProductToe(10.00);
        assertEquals(30.00, kassa.berekenTotaal(), 0.01);
    }

    @Test
    void berekenTotaalBoven100EuroEnOnder3Producten() {
        Kassa kassa = new Kassa();
        assertEquals(0, kassa.berekenTotaal(), 0.01);

        kassa.voegProductToe(200.00);
        assertEquals(200.00, kassa.berekenTotaal(), 0.01);

        kassa.voegProductToe(200.00);
        assertEquals(400.00, kassa.berekenTotaal(), 0.01);
    }

    @Test
    void berekenTotaalBoven100EuroEnBoven3Producten() {
        Kassa kassa = new Kassa();
        assertEquals(0, kassa.berekenTotaal(), 0.01);

        kassa.voegProductToe(200.00);
        assertEquals(200.00, kassa.berekenTotaal(), 0.01);

        kassa.voegProductToe(200.00);
        assertEquals(400.00, kassa.berekenTotaal(), 0.01);

        kassa.voegProductToe(200.00);
        assertEquals(540.00, kassa.berekenTotaal(), 0.01);
    }

    @Test
    void vraagAantalProductenOp() {
        Kassa kassa = new Kassa();
        assertEquals(0, kassa.vraagAantalProductenOp());

        kassa.voegProductToe(10.00);
        assertEquals(1, kassa.vraagAantalProductenOp());

        kassa.voegProductToe(20.00);
        assertEquals(2, kassa.vraagAantalProductenOp());
    }

    @Test
    void maakLeeg() {
        Kassa kassa = new Kassa();
        assertEquals(0, kassa.vraagAantalProductenOp());

        kassa.voegProductToe(10.00);
        kassa.voegProductToe(20.00);
        assertEquals(2, kassa.vraagAantalProductenOp());

        kassa.maakLeeg();
        assertEquals(0, kassa.vraagAantalProductenOp());
    }

}