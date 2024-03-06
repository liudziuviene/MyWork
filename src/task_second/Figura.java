package task_second;

public abstract class Figura {
    protected String spalva;
    protected int uzpildyta;

    public Figura(String spalva, int uzpildyta) {
        this.spalva = spalva;
        this.uzpildyta = uzpildyta;
    }

    protected abstract int apskaiciuotiPlota();

    protected abstract void piesti();
}
