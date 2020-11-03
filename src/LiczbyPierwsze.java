public class LiczbyPierwsze {
    private int[] tab;

    public LiczbyPierwsze(int n) {
        this.tab = new int[n];
    }

    public void wypiszTabliceLiczbPierwszych() {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public void dodajLiczbe(int n) {
        int index = 0;
        for (int i = 2; i < n; i++) {
            if (czyJestLiczbaPierwsza(i)) {
                tab[index] = i;
                index++;
            }
        }
    }

    public boolean czyJestLiczbaPierwsza(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
