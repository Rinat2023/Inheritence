public class Prgrammer extends Person{
    private String companyName;

    public Prgrammer(String name, String companyName) {
        super(name);
        this.companyName = companyName;
    }

    public void coding (){
        System.out.println("coding");
    }

    @Override
    public String toString() {
        return "Prgrammer{" +
                super.toString() + '\'' +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
