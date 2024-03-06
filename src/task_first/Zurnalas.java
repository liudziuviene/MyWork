package task_first;

public class Zurnalas extends Leidinys {
    private String leidykla;
    private int tirazas;

    public Zurnalas(String id, String pavadinimas, int isleidimoMetai, String leidykla, int tirazas) {
        super(id, pavadinimas, isleidimoMetai);
        this.leidykla = leidykla;
        this.tirazas = tirazas;
    }

    @Override
    protected void info() {
        System.out.println("Zurnalo ID: " + this.id + ", pavadinimas: " + this.pavadinimas + ", leidykla: " + this.leidykla + ", tirazas: " + this.tirazas + ", isleidimo metai: " + this.isleidimoMetai);
    }
}
