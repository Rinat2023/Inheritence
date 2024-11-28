//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Iphone iphoneX = new Iphone("Bionic A18", "4000A", true, true);
//        Redmi Redmi13 = new Redmi("Snapdragon 8", "6000A", true, true);
//        System.out.println(iphoneX);
//        System.out.println(Redmi13);

        Singer singer = new Singer("Singer", "MMM");
        singer.singing();
        System.out.println(singer.toString());
        Prgrammer programmer  = new Prgrammer("Programmmer", "MMM");
        programmer.coding();
        System.out.println(programmer.toString());
        Dancer dancer = new Dancer("dancer", "FFF");
        dancer.dancing();
        System.out.println(dancer.toString());

    }
}