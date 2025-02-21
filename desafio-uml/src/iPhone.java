public class iPhone {
    private String deviceName;
    private int batteryLevel;
    private WebBrowser browser;
    private TelephoneDevice phone;
    private MusicPlayer music;

    public iPhone (String deviceName) {
        this.deviceName = deviceName;
        this.batteryLevel = 100; // Bateria cheia
        this.browser = new WebBrowser();
        this.phone = new TelephoneDevice();
        this.music = new MusicPlayer();
    }

    public void turnON() {
        System.out.println(deviceName + "is turning on. Battery: " + batteryLevel + "%");
    }

    public void turnOFF() {
        System.out.println(deviceName + "is turning off.");
    }

    public WebBrowser getBrowser() {
        return browser;
    }

    public TelephoneDevice getPhone(){
        return phone;
    }

    public MusicPlayer getMusic(){
        return music;
    }

}
