package Hackaton.animaux.model;

public class Species {
    private final String regime;
    private final String origine;

    public Species(String regime, String origine) {
        this.regime = regime;
        this.origine = origine;
    }

    public String getRegime() { return regime; }
    public String getOrigine() { return origine; }
}
