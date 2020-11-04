public class LiczbyPierwsze {
    private int[] tab;

    public LiczbyPierwsze(int n) throws Exception {
       if (n < 2)  throw new Exception("Niepoprawny zakres.");
        this.tab = new int[n];
        dodajLiczbe(n);
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

    public int liczba(int m) throws Exception {
        if (m > tab.length) {
            throw new Exception(m + " - liczba spoza zakresu");
        }
        return tab[m];
    }
}
