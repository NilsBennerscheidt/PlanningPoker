import java.util.ArrayList;

public class UserStory {
    private String sStory;
    private ArrayList<String> sQuestions;
    private ArrayList<UserBewertung> lsUserBewertung;

    public UserStory(String sStory) {
        this.sStory = sStory;
        this.sQuestions = new ArrayList<String>();
        this.lsUserBewertung = new ArrayList<UserBewertung>();
    }

    public String getsStory() {
        return sStory;
    }

    public ArrayList<String> getsQuestions() {
        return sQuestions;
    }

    public void fAddQuestion(String sQuestions) {
        this.sQuestions.add(sQuestions);
    }

    public ArrayList<UserBewertung> getLsUserBewertung() {
        return lsUserBewertung;
    }

    public void fAddUserBewertung(UserBewertung p_oUserBewertung) {
        this.lsUserBewertung.add(p_oUserBewertung);
    }
}