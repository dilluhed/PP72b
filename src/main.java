public class main {
    public static void main(String[] args)
    {
        Basketball stephcurr = new Basketball("Basketball", "Basketball");
        TrackAndField mofarah = new TrackAndField("800m", "track spikes");

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
