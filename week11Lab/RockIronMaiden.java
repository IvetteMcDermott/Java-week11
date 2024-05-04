package week11Lab;

public class RockIronMaiden extends RockBands {
    // prints vars
    String reset = "\u001B[0m";
    String red = "\u001B[31m";
    String green = "\u001B[32m";
    String yellow = "\u001B[33m";

    // vars
    String bandName;
    String musicStyle;
    String origin;
    Boolean pet = true;
    String phrase;

    // rock style
    @Override
    public void MusicSubGenre(String musicSubGenre) {
        musicSubGenre = "Heavy Mental";
        super.MusicSubGenre(musicSubGenre);
    }

    @Override
    public void BandName(String bandName) {
        bandName = "Iron Maiden";
        super.BandName(bandName);
    }

    @Override
    public void Foundation(int foundation) {
        foundation = 1975;
        super.Foundation(foundation);
    }

    // members
    @Override
    public void Members(String drummer,
            String guitar,
            String bassist,
            String singer) {
        bassist = "Steve Harris";
        drummer = "Ron Matthews";
        guitar = "Terry Rance, Dave Sulivan";
        singer = "Paul Mario Day";
        super.Members(drummer,
                guitar,
                bassist,
                singer);
    }

    // pet particularity of this band
    public void HaveAPet() {
        if (pet) {
            System.out.println("Yes! They have a pet! His name is Eddie! and no, he wants not another ... hat!\n");
        } else {
            System.out.println("Nope, no Eddie here!\n");
        }

    }

}
