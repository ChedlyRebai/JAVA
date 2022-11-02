package tp5.tp5_0.ex1;

public class Motdico {

    public static int num = 0;
    private String mot;
    private String definitions;

    public Motdico(String mot, String definitions) {
        this.mot = mot;
        this.definitions = definitions;
    }

    public String getMot() {
        return this.mot;
    }

    public String getDefinitions() {
        return this.definitions;
    }

    public void setDefinitions(String s) {
        this.definitions = s;
    }

    public void setMot(String s) {
        this.mot = s;
    }

    public void tostring() {
        System.out.println("mot:" + this.mot + "\n definitions:" + this.definitions);
    }

    public boolean synonyme(Motdico m) {
        return this.definitions.equals(m.getDefinitions());
    }

}
