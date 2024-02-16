import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;
import javafx.scene.media.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.sound;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.w3c.dom.UserDataHandler;

import javax.sound.sampled.*;
import java.io.File;


import java.net.URL;

import javax.print.attribute.standard.Media;

public class Main {
    /**
     * @param args
     * @param string TODO
     * @param strings TODO
     * @return 
     * @throws IOException 
     * @throws UnsupportedAudioFileException 
     * @throws LineUnavailableException 
     */

    public static void main(String[]args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {

        boolean OdenIntroEvent = true;
        if (OdenIntroEvent = true) {
            Clip soundOdenBackground = AudioSystem.getClip();
            soundOdenBackground.open(AudioSystem.getAudioInputStream(new File("D:\\JAVAGameDevelopment\\Learning\\Audio\\OdenBackground.wav")));
            soundOdenBackground.start();
        }

        Clip soundOdenIntro = AudioSystem.getClip();
        soundOdenIntro.open(AudioSystem.getAudioInputStream(new File("D:\\JAVAGameDevelopment\\Learning\\Audio\\OdenIntro.wav")));
        soundOdenIntro.start();

        TypeOneKey.oneLetter("\n\nOden: Welcome to your trial!\nI am Oden... AND... \nYou are...?");

        do {} while (eventOne());
                
        do {} while(continueEvent());
        Clip soundWait = AudioSystem.getClip();
        soundWait.open(AudioSystem.getAudioInputStream(new File("D:\\JAVAGameDevelopment\\Learning\\Audio\\Wait.wav")));
        soundWait.start();

        TypeOneKey.oneLetter("\n\nA group of guards wearing golden armor grab you by your arms and begin dragging you to a door \ndifferent from the door you entered from. \n\nGregor: Where are you taking me? What are you going to do to me! \n WHAT HAVE I DONE WRONG! \n\nGuard: Shut your mouth peasant, you have no right to speak before Oden! \n*A guard shoves a piece of cloth in your mouth* \nGuard: That ought to shut you up! *You gag from the taste of the bloodied rag*");
        
        Clip sound = AudioSystem.getClip();
        sound.open(AudioSystem.getAudioInputStream(new File("D:\\JAVAGameDevelopment\\Learning\\Audio\\WoodenDoorCreaks.wav")));
        sound.start();

        TypeOneKey.oneLetter("\n\nThe Guards throw you into the open doorway and slam the door behind you. You are in a deep dark room. What is your move?");
        
        Clip soundTwo = AudioSystem.getClip();
        soundTwo.open(AudioSystem.getAudioInputStream(new File("D:\\JAVAGameDevelopment\\Learning\\Audio\\WoodHeavySlam.wav")));
        soundTwo.start(); 
        OdenIntroEvent = false;

        boolean Dungeon = true;       
            if (Dungeon = true) {
            Clip soundDungeonBackground = AudioSystem.getClip();
            soundDungeonBackground.open(AudioSystem.getAudioInputStream(new File("D:\\JAVAGameDevelopment\\Learning\\Audio\\DungeonBackground.wav")));
            soundDungeonBackground.start();
            }
        do {} while(eventTwo());
        Clip soundRustlingDungeonOne = AudioSystem.getClip();
        soundRustlingDungeonOne.open(AudioSystem.getAudioInputStream(new File("D:\\JAVAGameDevelopment\\Learning\\Audio\\RustlingDungeonOne.wav")));
        soundRustlingDungeonOne.start();

        do {} while(eventThree());

        Dungeon = false;
    }


    private static final Scanner scanner = new Scanner(System.in);
    //public boolean isAlive() {
        //return PlayerClass.healthPoints > 0;
    //}

    private static boolean eventOne() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        while (true) {
        TypeOneKey.oneLetter("\n\nAnswer Oden's question? No(1) or Yes(2)");

            switch (scanner.nextLine()) {
                case "1":
                    Clip soundOdenIntroAfterNo = AudioSystem.getClip();
                    soundOdenIntroAfterNo.open(AudioSystem.getAudioInputStream(new File("D:\\JAVAGameDevelopment\\Learning\\Audio\\OdenIntroAfterNo.wav")));
                    soundOdenIntroAfterNo.start();

                    TypeOneKey.oneLetter("\n\nYou dare not answer Oden!!!\nAnswer my question child!!");
                    return true;

                case "2": 
                    Clip soundGregorEventOneC1 = AudioSystem.getClip();
                    soundGregorEventOneC1.open(AudioSystem.getAudioInputStream(new File("D:\\JAVAGameDevelopment\\Learning\\Audio\\GregorEventOneC1.wav")));
                    soundGregorEventOneC1.start();

                    TypeOneKey.oneLetter("Gregor: I am " + PlayerClass.Warrior.warriorName + ". " + "\n" + PlayerClass.Warrior.warriorDescription + "My health points are, " + PlayerClass.Warrior.warriorHealthPointsMax + "." + " My damage is between " + PlayerClass.Warrior.warriorDamageMin + " and " + PlayerClass.Warrior.warriorDamageMax + ".");
                    
                    Clip soundOdenAndGregorEventOne = AudioSystem.getClip();
                    soundOdenAndGregorEventOne.open(AudioSystem.getAudioInputStream(new File("D:\\JAVAGameDevelopment\\Learning\\Audio\\OdenAndGregorEventOne.wav")));
                    soundOdenAndGregorEventOne.start();

                    TypeOneKey.oneLetter("\n\nOden: You are very unamusing child\nGregor: I was not trying to be amusing Mr. Oden, sir.\nOden: You will pay for your insolence!\nSend him to the dungeons!");
                    return false;
                default:
                   TypeOneKey.oneLetter("\nInvalid answer");
            }
        }
    }
    private static boolean continueEvent() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        while (true) {
            TypeOneKey.oneLetter("\n\nContinue? No(1) or Yes(2)");
 
            switch (scanner.nextLine()) {

                case "1":
                Clip soundTryAgain = AudioSystem.getClip();
                soundTryAgain.open(AudioSystem.getAudioInputStream(new File("D:\\JAVAGameDevelopment\\Learning\\Audio\\TryAgain.wav")));
                soundTryAgain.start();
                TypeOneKey.oneLetter("\nTry again...");
                    return true;
                case "2":
                TypeOneKey.oneLetter(PlayerClass.Warrior.warriorName + ": Wait!");
                    return false;
                default:
                TypeOneKey.oneLetter("\nInvalid answer");
            }
        }
    }
    private static boolean eventTwo() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        while (true) {
            TypeOneKey.oneLetter("\nAttempt to open the door (1) \nMove into the darkness (2) \nSurvey your surroundings (3)");
            
            switch (scanner.nextLine()) {
                case "1":
                    Clip soundGregorAttemptEscapeOne = AudioSystem.getClip();
                    soundGregorAttemptEscapeOne.open(AudioSystem.getAudioInputStream(new File("D:\\JAVAGameDevelopment\\Learning\\Audio\\GregorAttemptEscapeOne.wav")));
                    soundGregorAttemptEscapeOne.start();
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
                                return false;
                                    
                                case "2":
                                TypeOneKey.oneLetter("You step towards the noise, as you get closer you notice the figure is a frail man. \nThe man rushes towards you brandishing a dagger. You stumble back and fall to the ground.");
                                return false;

                                default:
                                TypeOneKey.oneLetter("Choose 1, 2, or 3!");
                                break;
                            }
                return false;
                }
                case "2": 
                    TypeOneKey.oneLetter("You step forward towards the rustling, you can just barely make out the figure of a human.\nThe figure begins to speak.\nFigure: I see you there, there is no hiding from me...\nI can see clearly in the dark and I will soon see your entrails!\nThe man darts towards you!\nWhat is your move attack(1) Attempt to run(2)?");
                        while (true) {
                            switch(scanner.nextLine()) {
                            case "1": 
                                TypeOneKey.oneLetter("TBD");
                            return false;
                            case "2":
                                TypeOneKey.oneLetter("The man stabs you in the back as you attempt to flee.");
                            default:
                            TypeOneKey.oneLetter("Type 1 or 2!!");
                            break;
                            }
                        }
                case "3":
                        TypeOneKey.oneLetter("Man: You can't get away from me boy! I will taste your blood on my tongue!");
                return false;
                default:
                        TypeOneKey.oneLetter("Type 1, 2, or 3!");
                break; 
                }
            }
        }
    }

 
    /*while (true) {
                                        
        switch(scanner.nextLine()) {    
        
            case "1": 
                TypeOneKey.oneLetter(WarriorClass.name + ": WHO'S THERE? The figure steps into your view, they are frail and look distraught. \nYou notice the figure is an man. \nThe man rushes towards you and you can see a dagger in his right hand. \nUnknown Man: I'm going to enjoy the taste of your flesh on my tongue!");
                while (false)
                return true;
            
            case "2":
                TypeOneKey.oneLetter("You rush forward. \nAs you approach the figure you notices the figure is a frail man brandishing a dagger in his right hand. \nYou bash into the figure slamming your shield against the mans chest. The man falls to the ground. \nUnknown Man: Your blood will mix well with my own!");
                return true;
            default: 
                TypeOneKey.oneLetter("Pick 1 or 2");
                return false;}*/

