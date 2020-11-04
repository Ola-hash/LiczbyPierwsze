public class Test {
    public static void main(String[] args) {
        LiczbyPierwsze liczbyPierwsze = null;
        for (int i = 0; i < args.length; i++) {
            try {
                int n = Integer.parseInt(args[i]);
                if (i == 0) {
                    liczbyPierwsze = new LiczbyPierwsze(n);
                } else {
                    System.out.println(args[i] + " - " + liczbyPierwsze.liczba(n));
                }
            }catch (NumberFormatException e){
                System.out.println(args[i]+" - to nie jest liczba");
                if (i==0){
                    return;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                if (i==0){
                    return;
                }
            }
        }
    }
}
