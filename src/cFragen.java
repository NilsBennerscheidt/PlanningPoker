public class cFragen {
    private String sFragenText;
    private String sAntwortText;

    public cFragen(String sFragenText) {
        //
        this.sFragenText = sFragenText;
    }

    public String getsFragenText() {
        return sFragenText;
    }

    public void setsFragenText(String sFragenText) {
        this.sFragenText = sFragenText;
    }

    public String getsAntwortText() {
        return sAntwortText;
    }

    public void setsAntwortText(String sAntwortText) {
        this.sAntwortText = sAntwortText;
    }
}
