public class UserBewertung {
    private String sUserName;
    private Integer nBewertung;

    public String getsUserName() {
        return sUserName;
    }

    public void setsUserName(String sUserName) {
        this.sUserName = sUserName;
    }

    public Integer getnBewertung() {
        return nBewertung;
    }

    public void setnBewertung(Integer nBewertung) {
        this.nBewertung = nBewertung;
    }

    public UserBewertung(String sUserName, Integer nBewertung) {
        this.sUserName = sUserName;
        this.nBewertung = nBewertung;
    }
}
