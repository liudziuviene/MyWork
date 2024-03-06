package task_second;

public class NamoProjektas implements Piesimas {
    private int statybosMetai;
    private String energingumoKlase;
    private String adresas;

    public NamoProjektas(int statybosMetai, String energingumoKlase, String adresas) {
        this.statybosMetai = statybosMetai;
        this.energingumoKlase = energingumoKlase;
        this.adresas = adresas;
    }

    @Override
    public void piesti() {
        System.out.println("Piesti nama");
    }
}
