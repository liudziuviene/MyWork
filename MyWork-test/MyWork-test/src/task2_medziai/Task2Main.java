package task2_medziai;

import task2_medziai.rusys.*;
import task2_medziai.tipai.Spygliuotis;

import java.util.List;

public class Task2Main {
    public static void main(String[] args) {

        ivairusMiskas(List.of(new Azuolas(), new Kadagys(), new Berzas(), new Pusis()));
        System.out.println();
        spygliuociuMiskas(List.of(new Pusis(), new Egle(), new Kadagys()));
        System.out.println();
        berzuMiskas(List.of(new Berzas(), new Berzas()));
    }

    private static <T extends Medis> void ivairusMiskas(List<T> miskas) {
        System.out.println("Ivairus miskas: ");
        for (T medis : miskas) {
            System.out.println(medis.turi());
        }
    }

    private static <T extends Spygliuotis> void spygliuociuMiskas(List<T> spygliuociuMiskas) {
        System.out.println("Spygliuociu miskas: ");
        for (T spygliuotis : spygliuociuMiskas) {
            System.out.println(spygliuotis.turi());
        }
    }

    private static <T extends Berzas> void berzuMiskas(List<T> berzuMiskas) {
        System.out.println("Berzu miskas");
        for (T berzas : berzuMiskas) {
            System.out.println(berzas.turi());
        }
    }
}
