package design.pattern.decorate;

public class mainclass {

    public static void main(String[] args) {
        player p= new juniorPlayer();

        player p1=new juniorTalentDevelopment(new juniorPlayer());

        player p2= new juniorTalentDevelopment(new jrplayer());

        System.out.println("this is normal player");

        p.play();

        System.out.println("junior player");

        p1.play();
        p2.play();
    }
}
