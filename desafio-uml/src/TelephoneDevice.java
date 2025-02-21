public class TelephoneDevice {
    private String phoneNumber;
    private boolean callActive;

    public TelephoneDevice() {

        this.phoneNumber = "";
        this.callActive = false;
    }

    public void makeCall(String number) {

        this.phoneNumber = number;
        this.callActive = true;
        System.out.println("Calling: " + number);

    }

    public void endCall () {
        if (callActive) {
            System.out.println("Call ended with: " + phoneNumber);
            this.callActive = false;
        } else {
            System.out.println("No active call");
        }
    }

    public void checkVoicemail() {
        System.out.println("Cheging voicemail for: " + phoneNumber);
    }
}
