public class Dancer extends Person{
    private String groupName;

    public Dancer(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public void dancing (){
        System.out.println("dancing");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                super.toString() + '\'' +
                "groupName='" + groupName + '\'' +
                '}';
    }
}
