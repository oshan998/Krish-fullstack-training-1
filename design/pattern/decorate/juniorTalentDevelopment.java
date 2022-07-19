package design.pattern.decorate;

public class juniorTalentDevelopment extends talentDevelopment {

    public juniorTalentDevelopment(player talent) {
        super(talent);
    }

    public void play(){
        talent.play();
        setPlay(talent);
    }

    private void setPlay(Player talent){
        System.out.println("player is talented");
    }
}
