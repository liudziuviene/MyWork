package task_second;

public class Staciakampis extends Figura implements Piesimas {
    protected double ilgis;
    protected double plotis;

    public Staciakampis(String spalva, int uzpildyta, double ilgis, double plotis) {
        super(spalva, uzpildyta);
        this.ilgis = ilgis;
        this.plotis = plotis;
    }

    @Override
    protected double apskaiciuotiPlota() {
        return ilgis * plotis;
    }

    @Override
    public void piesti() {
        System.out.println("Piesti staciakampi");
    }

    @Override
    protected void printCommonFields() {
        super.printCommonFields();
    }
}
