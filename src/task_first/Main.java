package task_first;

public class Main {
    public static void main(String[] args) {
        Biblioteka biblioteka = new Biblioteka();
        biblioteka.pridetiKnyga(new Knyga("A1", "Bembis", 2020, "Antanas"));
        biblioteka.pridetiZurnala(new Zurnalas("B1", "Mokslas", 2017, "Lankos", 100));
        biblioteka.pridetiLaikrasti(new Laikrastis("C1", "Valscius", 2010, 5));
        biblioteka.rodytiInventoriu();
    }
}
