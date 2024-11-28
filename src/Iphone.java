public class Iphone extends Phone{
    private boolean faceID;
    private boolean biometrika;

    public Iphone(String processor, String accumulator, boolean faceID, boolean biometrika) {
        super(processor, accumulator);
        this.faceID = faceID;
        this.biometrika = biometrika;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                super.toString() +
                "faceID='" + faceID + '\'' +
                ", biometrika='" + biometrika + '\'' +
                '}';
    }
}
