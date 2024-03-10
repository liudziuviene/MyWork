public enum Command {
    A("Patikrinti saskaitos likuti"),
    B("Prisijungti prie korteles"),
    C("Issiimti pinigu"),
    D("Ideti pinigu"),
    E("Atsijungti"),

    X("Atgal");


    private String description;

    Command(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
