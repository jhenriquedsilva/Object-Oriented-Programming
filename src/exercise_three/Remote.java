package exercise_three;

public class Remote {

    public int turnVolumeUp(int volume) {
        if (volume < 100) {
            System.out.println("Turning the volume up");
            return volume + 1;
        } else {
            System.out.println("Sorry! Maximum volume already!");
            return volume;
        }
    }

    public int turnVolumeDown(int volume) {
        if (volume > 0) {
            System.out.println("Turning the volume down");
            return volume - 1;
        } else {
            System.out.println("Sorry! Minimum volume already");
            return volume;
        }
    }

    public int turnUpChannel(int currentChannel) {
        return currentChannel + 1;
    }

    public int turnDownChannel(int currentChannel) {
        return currentChannel - 1;
    }

    public int turnToChannel(int newChannel) {
        return newChannel;
    }

    public void showCurrentChannel(int currentChannel) {
        System.out.printf("Channel number is %d.%n", currentChannel);
    }

    public void showCurrentVolume(int currentVolume) {
        System.out.printf("Current volume is %d.%n", currentVolume);
    }
}
