package week11Lab;

public class RockBlackSabath extends RockBands {
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
    Boolean royalty = false;

    // constructors

    // computes
    // rock style
    @Override
    public void MusicSubGenre(String musicSubGenre) {
        musicSubGenre = "Heavy Mental";
        super.MusicSubGenre(musicSubGenre);
    }

    @Override
    public void BandName(String bandName) {
        bandName = "Black Sabbath";
        super.BandName(bandName);
    }

    @Override
    public void Foundation(int foundation) {
        foundation = 1968;
        super.Foundation(foundation);
    }

    // members
    @Override
    public void Members(String drummer,
            String guitar,
            String bassist,
            String singer) {
        bassist = "Geezer Butler";
        drummer = "Bill Ward";
        guitar = "Tony Iommi";
        singer = "Ozzy Osbourne";
        if (singer == "Ozzy Osbourne") {
            royalty = true;
        }
        super.Members(drummer,
                guitar,
                bassist,
                singer);
    }

    // Ozzy particularity of this band
    public void Royalty() {
        if (royalty) {
            System.out.println("Yes! They have royalty in them... Ozzy Prince of Darkness!\n");
        } else {
            System.out.println("Nope, no ozzy not here anymore here!\n");
        }
    }
}
