package Devices;

// Work-around method of achieving multiple Inheritance in Java
public class Smartphone implements Camera,MusicPlayer,Phone {

    @Override
    public void takePhoto() {
        System.out.println("taking photo with smartphone");
    }

    @Override
    public void recordVideo() {
        System.out.println("recording video with smartphone");
    }

    @Override
    public void playMusic() {
        System.out.println("playing music with smartphone");
    }

    @Override
    public void stopMusic() {
        System.out.println("stopping music with smartphone");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("making call with smartphone to " + number);
    }

    @Override
    public void endCall() {
        System.out.println("ending call with smartphone");
    }
}
