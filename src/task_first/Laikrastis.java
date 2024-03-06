package task_first;

public class Laikrastis extends Leidinys {
    protected int isleidimoDaznisIMen;

    public Laikrastis(String id, String pavadinimas, int isleidimoMetai, int isleidimoDaznisIMen) {
        super(id, pavadinimas, isleidimoMetai);
        this.isleidimoDaznisIMen = isleidimoDaznisIMen;
    }

    @Override
    protected void info() {
        System.out.println("Laikrascio ID: " + this.id + ", pavadinimas: " + this.pavadinimas + ", isleidimo metai: " + this.isleidimoMetai + ", isleidimo daznis per menesi: " + this.isleidimoDaznisIMen);
    }
}
