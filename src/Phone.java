public class Phone {
    private String processor;
    private String accumulator;

    public Phone(String processor, String accumulator) {
        this.processor = processor;
        this.accumulator = accumulator;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "processor='" + processor + '\'' +
                ", accumulator='" + accumulator + '\'' +
                '}';
    }
}
