package task_second;

import java.util.ArrayList;
import java.util.List;

public class Main {
    protected static List<Piesimas> piesimasList = new ArrayList<>();
    protected static List<Figura> figuraList = new ArrayList<>();

    public static void main(String[] args) {
        Apskritimas apskritimas = new Apskritimas("raudona", 60, 2);
        Apskritimas apskritimas2 = new Apskritimas("melyna", 30, 3);
        Staciakampis staciakampis = new Staciakampis("juoda", 50, 5.5, 6.5);
        Staciakampis staciakampis2 = new Staciakampis("balta", 25, 10.1, 9.7);
        NamoProjektas namoProjektas = new NamoProjektas(2020, "A+", "Kaunas");
        NamoProjektas namoProjektas2 = new NamoProjektas(2022, "A++", "Klaipeda");

        pridetiFigura(apskritimas);
        pridetiFigura(apskritimas2);
        pridetiFigura(staciakampis);
        pridetiFigura(staciakampis2);

        pridetiPiesimoObj(apskritimas);
        pridetiPiesimoObj(staciakampis);
        pridetiPiesimoObj(namoProjektas);
        pridetiPiesimoObj(namoProjektas2);

        kviestiPiesima();
        bendraInfo();
    }

    protected static void pridetiFigura(Figura figura) {
        figuraList.add(figura);
    }

    protected static void pridetiPiesimoObj(Piesimas piesimas) {
        piesimasList.add(piesimas);
    }

    protected static void kviestiPiesima() {
        for (Piesimas p : piesimasList) {
            p.piesti();
        }
    }

    protected static void bendraInfo() {
        for (Figura f : figuraList) {
            f.printCommonFields();
        }
    }

}
