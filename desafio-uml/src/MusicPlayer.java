public class MusicPlayer {

    private String currentSong;
    private int volume;

    public MusicPlayer() {
        this.currentSong = "None";
        this.volume = 50; // Volume padrão fica em 50

    }

    public void playSong(String song) {
        this.currentSong = song;
        System.out.println("Playing: " + song + "at volume " + volume);

    }

    public void stopSong() {
        System.out.println("Stopping: " + currentSong);
        this.currentSong = "None";
    }

    public void nextSong() {
        System.out.println("Skipping to next song from: " + currentSong);
        this.currentSong = "Next Song"; //
    }

}
