import java.util.ArrayList;

public class UserStory {
    private String sStory;
    private ArrayList<cFragen> sFragen;
    private ArrayList<UserBewertung> lsUserBewertung;

    public UserStory(String sStory) {
        this.sStory = sStory;
        this.sFragen = new ArrayList<cFragen>();
        this.lsUserBewertung = new ArrayList<UserBewertung>();
    }

    public String getsStory() {
        return sStory;
    }

    public void setsStory(String sStory) {
        this.sStory = sStory;
    }

    public ArrayList<cFragen> getsFragen() {
        return sFragen;
    }

    public void setsFragen(ArrayList<cFragen> sFragen) {
        this.sFragen = sFragen;
    }

    public ArrayList<UserBewertung> getLsUserBewertung() {
        return lsUserBewertung;
    }

    public void setLsUserBewertung(ArrayList<UserBewertung> lsUserBewertung) {
        this.lsUserBewertung = lsUserBewertung;
    }
}