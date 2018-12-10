public class Student {
    private String imea;
    private String familia;
    private int godRojdenia;
    private double sredniayaOtzenka;

    public Student(String imea, String familia, int godRojdenia, double sredniayaOtzenka) {
        this.imea = imea;
        this.familia = familia;
        this.godRojdenia = godRojdenia;
        this.sredniayaOtzenka = sredniayaOtzenka;
    }

    public String getImea() {
        return imea;
    }

    public String getFamilia() {
        return familia;
    }

    public int getGod() {
        return godRojdenia;
    }

    public double getSredniayaOtzenka() {
        return sredniayaOtzenka;
    }

    @Override
    public String toString() {
        return imea + ' ' + familia + "\t\t" + godRojdenia + "\t\t" + sredniayaOtzenka;
    }
}