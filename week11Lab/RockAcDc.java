package week11Lab;

public class RockAcDc extends RockBands {
    // prints vars
    String reset = "\u001B[0m";
    String red = "\u001B[31m";
    String green = "\u001B[32m";
    String yellow = "\u001B[33m";

    // vars
    String bandName;
    String musicStyle;
    String origin;
    String phrase;
    String singer;
    Boolean outfit = false;

    // rock style
    @Override
    public void MusicSubGenre(String musicSubGenre) {
        musicSubGenre = "Hard Rock";
        super.MusicSubGenre(musicSubGenre);
    }

    @Override
    public void BandName(String bandName) {
        bandName = "AC/DC";
        if (bandName == "AC/DC") {
            outfit = true;
        }
        super.BandName(bandName);
    }

    @Override
    public void Foundation(int foundation) {
        foundation = 1973;
        super.Foundation(foundation);
    }

    // members
    @Override
    public void Members(String drummer,
            String guitar,
            String bassist,
            String singer) {
        bassist = "Larry Van Kriedt";
        drummer = "Colin Burgess";
        guitar = "Angus Young, Malcolm Young";
        singer = "Dave Evans";
        super.Members(drummer,
                guitar,
                bassist,
                singer);
    }

    // Young outfit, particularity of this band
    public void HighSchoolOutfit() {
        if (outfit) {
            System.out.println("Angus Young always young! School boy!\n");
        } else {
            System.out.println("Nope, no they not fun!\n");
        }
    }

}
