
interface Camera {
    void takePhoto();
}

interface Music {
    void playMusic();
}

class Smartphone implements Camera, Music {

    public void takePhoto() {
        System.out.println("Smartphone is taking a photo");
    }

    public void playMusic() {
        System.out.println("Smartphone is playing music");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        Smartphone s = new Smartphone();

        Camera c = s;
        Music m = s;

        c.takePhoto();
        m.playMusic();
    }
}
