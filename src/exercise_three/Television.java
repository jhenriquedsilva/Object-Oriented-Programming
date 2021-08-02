package exercise_three;

public class Television {

    private int currentVolume = 50;
    private int currentChannel = 5;
    public final Remote remote = new Remote();

    // Remote is an inner class
    public class Remote {
        // Aumenta volume
        public void turnVolumeUp() {
            if (currentVolume < 100) {
                System.out.println("Turning the volume up");
                currentVolume += 1;
            } else {
                System.out.println("Sorry! Maximum volume already!");
            }
        }

        // Abaixa volume
        public void turnVolumeDown() {
            if (currentVolume > 0) {
                System.out.println("Turning the volume down");
                currentVolume -= 1;
            } else {
                System.out.println("Sorry! Minimum volume already");
            }
        }

        // Aumenta canal
        public void turnUpChannel() {
            System.out.println("Turning up the channel");
            currentChannel += 1;
        }

        // Diminui canal
        public void turnDownChannel() {
            System.out.println("Turning down the channel");
            currentChannel -= 1;
        }

        // Troca para um canal
        public void turnToChannel(int newChannel) {
            System.out.println("Turning to a new channel");
            currentChannel= newChannel;
        }

        // Consulta o canal selecionado
        public void showCurrentChannel() {
            System.out.println("Searching for current channel...");
            System.out.printf("Channel number is %d.%n", currentChannel);
        }

        // Consulta o volume
        public void showCurrentVolume() {
            System.out.println("Searching for current volume...");
            System.out.printf("Current volume is %d.%n", currentVolume);
        }
    }

}
