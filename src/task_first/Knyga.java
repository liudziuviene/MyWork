package task_first;

public class Knyga extends Leidinys {
    private String autorius;

    public Knyga(String id, String pavadinimas, int isleidimoMetai, String autorius) {
        super(id, pavadinimas, isleidimoMetai);
        this.autorius = autorius;
    }

    @Override
    protected void info() {
        System.out.println("Knygos ID: " + this.id + ", pavadinimas: " + this.pavadinimas + ", autorius: " + this.autorius + ", isleidimo metai: " + this.isleidimoMetai);
    }
}
