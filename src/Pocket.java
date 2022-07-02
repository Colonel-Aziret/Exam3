public class Pocket implements Locatable, Soundable {

    public Pocket(String item) {
    }

    Pocket rightPocket = new Pocket("Сheck");
    Pocket leftPocket = new Pocket("Coins");

    @Override
    public void locate() {
        System.out.println(rightPocket + "locate");
    }

    @Override
    public void sound() {
        System.out.println(leftPocket + "sound");
    }
}