public class Singer extends Person{
    private String bandName;

    public Singer(String name, String bandName) {
        super(name);
        this.bandName = bandName;
    }

    public void singing(){
        System.out.println("singin");
    }
    public void plaingGuitar(){
        System.out.println("plaing Guitar");
    }

    @Override
    public String toString() {
        return "Singer{" +
                 super.toString() + '\'' +
                "bandName='" + bandName + '\'' +
                '}';
    }
}
