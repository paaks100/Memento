public class PresentationEnd {

    public static void main(String[] args) {
        if (audienceHasQuestions()) {
            System.out.println("Don't be shy, ask away!");
        } else {
            System.out.println("Thanks for your attention.");
            System.out.println("End of presentation. Cue applause. 🎉");
        }
    }

    private static boolean audienceHasQuestions() {
        return false;
    }
}
