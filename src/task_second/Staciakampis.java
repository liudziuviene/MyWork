package task_second;

public class Staciakampis extends Figura {
    protected double ilgis;
    protected double plotis;

    public Staciakampis(String spalva, int uzpildyta, double ilgis, double plotis) {
        super(spalva, uzpildyta);
        this.ilgis = ilgis;
        this.plotis = plotis;
    }

    @Override
    protected int apskaiciuotiPlota() {
        return 0;
    }

    @Override
    protected void piesti() {

    }
}
