package task_first;

public abstract class Leidinys {
    protected String id;
    protected String pavadinimas;
    protected int isleidimoMetai;

    public Leidinys(String id, String pavadinimas, int isleidimoMetai) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.isleidimoMetai = isleidimoMetai;
    }

    protected abstract void info();
}
