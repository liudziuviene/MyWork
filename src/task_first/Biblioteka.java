package task_first;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {
    private List<Leidinys> leidinysList = new ArrayList<>();

    protected void pridetiKnyga(Knyga knyga) {
        leidinysList.add(knyga);
    }

    protected void pridetiZurnala(Zurnalas zurnalas) {
        leidinysList.add(zurnalas);
    }

    protected void pridetiLaikrasti(Laikrastis laikrastis) {
        leidinysList.add(laikrastis);
    }

    protected void rodytiInventoriu() {
        for (Leidinys l : leidinysList) {
            l.info();
        }
    }
}
