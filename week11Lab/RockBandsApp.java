package week11Lab;

public class RockBandsApp {
    public static void main(String[] args) {
        // prints vars
        String bold = "\u001B[1m";
        String underline = "\u001B[4m";
        String reset = "\u001B[0m";
        String magenta = "\u001B[35m";
        String blue = "\u001B[34m";
        System.out.println(bold + underline + magenta + "\nSome good Rock Bands!" + reset);

        RockBands RK = new RockBands();
        RockIronMaiden IM = new RockIronMaiden();
        RockBlackSabath BS = new RockBlackSabath();
        RockAcDc AD = new RockAcDc();

        // Iron Maiden
        IM.BandName(null);
        RK.MusicGenre();
        IM.MusicSubGenre(null);

        IM.Origin();
        IM.Foundation(0);
        IM.Members(null, null, null, null);
        IM.HaveAPet();

        // Black Sabbath
        BS.BandName(null);
        RK.MusicGenre();
        BS.MusicSubGenre(null);

        BS.Origin();
        BS.Foundation(0);
        BS.Members(null, null, null, null);
        BS.Royalty();

        // AC/DC
        AD.BandName(null);
        RK.MusicGenre();
        AD.MusicSubGenre(null);

        AD.Origin();
        AD.Foundation(0);
        AD.Members(null, null, null, null);
        AD.HighSchoolOutfit();

    }
}
