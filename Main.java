
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class Main{
    /**
     * @param args
     * @return 
     */

    public static void main(String[]args) {
        
        TypeOneKey.oneLetter("\n\nOden: Welcome to your trial!\nI am Oden... AND... \nYou are...?");

        do {} while (eventOne());
        
        TypeOneKey.oneLetter("\n\nOden: You are very unamusing child\nGregor: I was not trying to be amusing Mr. Oden, sir.\nOden: You will pay for your insolence!\nSend him to the dungeons!");
        
        do {} while(continueEvent());

        TypeOneKey.oneLetter("\n\nA group of guards wearing golden armor grab you by your arms and begin dragging you to a door \ndifferent from the door you entered from. \n\nGregor: Where are you taking me? What are you going to do to me! \n WHAT HAVE I DONE WRONG! \n\nGuard: Shut your mouth peasant, you have no right to speak before Oden! \n*A guard shoves a piece of cloth in your mouth* \nGuard: That ought to shut you up! *You gag from the taste of the bloodied rag* \n\nThe Guards throw you into the open doorway and slam the door behind you. You are in a deep dark room. What is your move?");
        
        do {} while (eventTwo());
        
        do {} while(eventThree());
    }

    private static final Scanner scanner = new Scanner(System.in);
    //public boolean isAlive() {
        //return PlayerClass.healthPoints > 0;
    //}

    private static boolean eventOne() {
        while (true) {
        TypeOneKey.oneLetter("\n\nAnswer Oden's question? No(1) or Yes(2)");

            switch (scanner.nextLine()) {
                case "1":
                    TypeOneKey.oneLetter("\n\nYou dare not answer Oden!!!\nAnswer my question child!!");
                    return true;

                case "2": 
                TypeOneKey.oneLetter("Gregor: I am " + WarriorClass.name + ". " + "\n" + WarriorClass.description + "My health points are, " + WarriorClass.healthPointsMax + "." + " My damage is between " + WarriorClass.damageMin + " and " + WarriorClass.damageMax + ".");
                    return false;
                default:
                   TypeOneKey.oneLetter("\nInvalid answer");
            }
        }
    }
    private static boolean continueEvent() {
        while (true) {
            TypeOneKey.oneLetter("\n\nContinue? No(1) or Yes(2)");
 
            switch (scanner.nextLine()) {

                case "1":
                TypeOneKey.oneLetter("\nTry again...");
                    return true;
                case "2":
                TypeOneKey.oneLetter(WarriorClass.name + ": Wait!");
                    return false;
                default:
                TypeOneKey.oneLetter("\nInvalid answer");
            }
        }
    }
    private static boolean eventTwo() {
        while (true) {
            TypeOneKey.oneLetter("\nAttempt to open the door (1) \nMove into the darkness (2) \nSurvey your surroundings (3)");
            
            switch (scanner.nextLine()) {
                case "1":
                    TypeOneKey.oneLetter("\nYou slam your body against the door attempt to pull it open, but before you can grab the handle \nyou hear a heavy slam on the other side of the door. You attempt to open the door by tearing at the handle this is to no avail. \nThe door is sealed shut. " +
                    "You hear a rustling in the darkness behind you.");
                    return false;

                case "2":
                    TypeOneKey.oneLetter("You step forward and hear a slam against the door behind you! You turn around to see the door sealed shut. \n You hear a rustling in the darkness in front of you.");
                    return false;

                case "3":
                    TypeOneKey.oneLetter("You stand still and hear a slam against the door behind you! You turn around to see the door sealed shut. \n You hear a rustling in the darkness in front of you.");
                    return false;

                default:
                    TypeOneKey.oneLetter("Please press 1, 2, or 3!");
                    break;
            }
        }
    }
    private static boolean eventThree() {
        while (true){
            TypeOneKey.oneLetter("\nSearch your immediate surroundings(1) \nSearch for the source of the rustling(2) \nRun away from the sound(3)");

            switch(scanner.nextLine()) {
                case "1":
                    TypeOneKey.oneLetter("You see a shield laying on the ground 5 feet from your position in the direction of the rustling. \nWhat is your move? \nGrab the shield(1) \nIgnore the shield and inspect the noise(2)");
                        while (true) {
                            switch(scanner.nextLine()) {
                            case "1": 
                                TypeOneKey.oneLetter("You grab the shield and as you regain your bearings you see a dark shadow moving quickly in your direction. \nYou ready the shield and brace for impact with this undefined figure. \nThe figure comes closer, you can make out that it has a human form. \nWhat do you do? \nCall out to the figure(1) Rush in and attack the figure(2)");
                                    
                                    while (true) {
                                        
                                        switch(scanner.nextLine()) {    
                                        
                                            case "1": 
                                                TypeOneKey.oneLetter(WarriorClass.name + ": WHO'S THERE? The figure steps into your view, they are frail and look distraught. \nYou notice the figure is an man. \nThe man rushes towards you and you can see a dagger in his right hand. \nUnknown Man: I'm going to enjoy the taste of your flesh on my tongue!");
                                                while (true)
                                                return false;
                                            
                                            case "2":
                                                TypeOneKey.oneLetter("You rush forward. \nAs you approach the figure you notices the figure is a frail man brandishing a dagger in his right hand. \nYou bash into the figure slamming your shield against the mans chest. The man falls to the ground. \nUnknown Man: Your blood will mix well with my own!");
                                                return false;
                                            default: 
                                                TypeOneKey.oneLetter("Pick 1 or 2");
                                                return true;}
                                    }

                            case "2":
                                TypeOneKey.oneLetter("You step towards the noise, as you get closer you notice the figure is a frail man. \nThe man rushes towards you brandishing a dagger. You stumble back and fall to the ground.");
                            }   
                    }
            }
        }
    }
}
