public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void learn (){
        System.out.println("learning");
    }

    public void walk (){
        System.out.println("walking");
    }

    public void eat (){
        System.out.println("eating");;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
