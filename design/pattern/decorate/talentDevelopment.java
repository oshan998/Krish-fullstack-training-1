package design.pattern.decorate;

public abstract class talentDevelopment implements player{

    protected player talent;

    public talentDevelopment(player talent) {
        this.talent = talent;
    }

    public void play(){
        talent.play();
    }
}
