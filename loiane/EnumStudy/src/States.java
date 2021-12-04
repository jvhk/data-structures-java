public enum States {
     
    MG("Minas Gerais"),
    SP("São Paulo"),
    RS("Rio Grande do Sul"),
    SC("Santa Catarina"),
    RJ("Rio de Janeiro");

    private States(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    private final String name;
}

