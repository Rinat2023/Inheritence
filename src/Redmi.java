public class Redmi extends Phone{
    private boolean gameRejim;
    private boolean fingerScanner;

    public Redmi(String processor, String accumulator, boolean gameRejim, boolean fingerScanner) {
        super(processor, accumulator);
        this.gameRejim = gameRejim;
        this.fingerScanner = fingerScanner;
    }

    @Override
    public String toString() {
        return "Redmi{" +
                super.toString() +
                "gameRejim='" + gameRejim + '\'' +
                ", fingerScanner='" + fingerScanner + '\'' +
                '}';
    }
}
