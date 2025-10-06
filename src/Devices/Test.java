package Devices;

public class Test {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.makeCall("102020202");
        smartphone.endCall();
        smartphone.playMusic();
        smartphone.stopMusic();
        smartphone.takePhoto();
        smartphone.recordVideo();
    }

}
