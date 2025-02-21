public class WebBrowser {

    private String currentPage;
    private boolean isConnected;

    public WebBrowser() {

        this.currentPage = "about:blank";
        this.isConnected = true; // Como padrão a gente assume que está conectado

    }

    public void openURL(String url) {
        if (isConnected) {

            this.currentPage = url;
            System.out.println("Opening: " + url);
        } else {
            System.out.println("No internet connection!");
        }
    }

    public void zoomIn() {
        System.out.println("Zooming in on: " + currentPage);
    }

    public void zoomOut() {
        System.out.println("Zooming out on: " + currentPage);
    }

}
