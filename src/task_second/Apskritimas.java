package task_second;

public class Apskritimas extends Figura {
    private int spindulys;

    public Apskritimas(String spalva, int uzpildyta, int spindulys) {
        super(spalva, uzpildyta);
        this.spindulys = spindulys;
    }

    @Override
    protected int apskaiciuotiPlota() {
        return 0;
    }

    @Override
    protected void piesti() {

    }
}
