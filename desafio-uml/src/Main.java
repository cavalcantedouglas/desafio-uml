//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        iPhone myPhone = new iPhone ("iPhone");

        myPhone.turnON();

        myPhone.getBrowser().openURL("https://www.google.com");
        myPhone.getBrowser().zoomIn();

        myPhone.getPhone().makeCall("11 1234-5678");
        myPhone.getPhone().checkVoicemail();
        myPhone.getPhone().endCall();

        // Test MusicPlayer
        myPhone.getMusic().playSong("Sweet Home Alabama");
        myPhone.getMusic().nextSong();
        myPhone.getMusic().stopSong();

        // Test turning off
        myPhone.turnOFF();

    }
}