package task_second;

public class Apskritimas extends Figura implements Piesimas {
    private double spindulys;

    public Apskritimas(String spalva, int uzpildyta, int spindulys) {
        super(spalva, uzpildyta);
        this.spindulys = spindulys;
    }

    @Override
    protected double apskaiciuotiPlota() {
        return 2 * Math.PI * spindulys;
    }

    @Override
    public void piesti() {
        System.out.println("Piesti apskritima");
    }

    @Override
    protected void printCommonFields() {
        super.printCommonFields();
    }
}
