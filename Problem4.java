import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a noun: ");
        String noun = x.nextLine();
        System.out.println("Enter a verb: ");
        String verb = x.nextLine();
        System.out.println("Enter an adjective: ");
        String adjective = x.nextLine();
        System.out.println("Enter an adverb: ");
        String adverb = x.nextLine();
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }
}
