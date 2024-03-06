package task_second;

public abstract class Figura {
    protected String spalva;
    protected int uzpildyta;

    public Figura(String spalva, int uzpildyta) {
        this.spalva = spalva;
        this.uzpildyta = uzpildyta;
    }

    protected abstract double apskaiciuotiPlota();

    protected void printCommonFields() {
        System.out.println("Spalva: " + spalva + ", uzpildyta figuros ploto: " + uzpildyta);
    }
}
