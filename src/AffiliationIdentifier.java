/*
Pseudocode:
- Initialize Scanner for input.
- Display choices for party affiliation: Democrat (D), Republican (R), Independent (I).
- Read user's input for party choice.
- Compare input with options for D, R, I using cascaded if-else structure.
- Print corresponding message for each party choice.
- Print 'Other' for any input that does not match D, R, or I.
*/

import java.util.Scanner;

public class AffiliationIdentifier {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.println("Choose party affiliation: [D]emocrat, [R]epublican, [I]ndependent");
        String partyChoice = inputReader.nextLine().toUpperCase();

        String mascotMessage;
        if ("D".equals(partyChoice)) {
            mascotMessage = "You get a Democratic Donkey.";
        } else if ("R".equals(partyChoice)) {
            mascotMessage = "You get a Republican Elephant.";
        } else if ("I".equals(partyChoice)) {
            mascotMessage = "You get an Independent Person.";
        } else {
            mascotMessage = "Other.";
        }

        System.out.println(mascotMessage);
    }
}
