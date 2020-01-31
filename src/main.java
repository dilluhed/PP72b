public class main {
    public static void main(String[] args)
    {
        Basketball stephcurr = new Basketball("Basketball", "Basketball", 2, 5, false);
        TrackAndField mofarah = new TrackAndField("Track", "track spikes", 8, "1600m", false, 16);

        System.out.println(stephcurr.toString());
        stephcurr.shoot();
        System.out.println(stephcurr.play());

        System.out.println("************************************************");

        System.out.println(mofarah.toString());
        mofarah.onYourMarks();
        System.out.println(mofarah.play());

        System.out.println("Nathan Dilla");
    }
}
