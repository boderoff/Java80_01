package lesson8;

public class Player implements Playable, Recordable{

    @Override
    public void play() {
        System.out.println("Playback started");
    }

    @Override
    public void record() {
        System.out.println("Recording started");
    }
}
