public class Animal {
    protected String nume;
    protected String culoare;
    protected boolean vegetarian;
    private int nrPicioare;
    private String undeTraieste[] ={"apa","aer","uscat"};


    public Animal() {
        nume = "unknown";
        culoare = "unknown";
        vegetarian = false;
    }

    public Animal(String nume) {
        this.nume = nume;
    }

    public Animal(String nume, String culoare, boolean vegetarian) {
        this.nume = nume;
        this.culoare = culoare;
        this.vegetarian = vegetarian;
    }

    public Animal(int nrPicioare, String[] undeTraieste) {
        this.nrPicioare = nrPicioare;
        this.undeTraieste = undeTraieste;
    }

    public int getNrPicioare() {
        return nrPicioare;
    }

    public void setNrPicioare(int nrPicioare) {
        this.nrPicioare = nrPicioare;
    }

    public String[] getUndeTraieste() {
        return undeTraieste;
    }

    public void setUndeTraieste(String[] undeTraieste) {
        this.undeTraieste = undeTraieste;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void picioare(){

        if (nrPicioare == 0){
            System.out.println(nume+" nu are picioare");
        }
        else if (nrPicioare == 2){
            System.out.println(nume+" are 2 picioare");
        }
        else if (nrPicioare == 4){
            System.out.println(nume+" are 4 picioare");
        }
        else System.out.println(nume+" are alt numar de picioare");
    }
    public void mananca(){
        System.out.println(nume + " mananca");
    }

    public void doarme(){
        System.out.println(nume + " doarme");
    }

    public String method1(){
        return nume + " are culoarea " + culoare;
    }

}
