package F2P;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.container.impl.Inventory;
import org.dreambot.api.methods.container.impl.bank.Bank;
import org.dreambot.api.methods.container.impl.equipment.Equipment;
import org.dreambot.api.methods.depositbox.DepositBox;
import org.dreambot.api.methods.interactive.GameObjects;
import org.dreambot.api.methods.interactive.Players;
import org.dreambot.api.methods.map.Area;
import org.dreambot.api.methods.map.Tile;
import org.dreambot.api.methods.quest.Quests;
import org.dreambot.api.methods.settings.PlayerSettings;
import org.dreambot.api.methods.skills.Skill;
import org.dreambot.api.methods.skills.Skills;
import org.dreambot.api.methods.walking.impl.Walking;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.utilities.Logger;

import java.awt.*;
/*
   V0id3dLif3 aka f4i13rr0r aka A name they will lie and say they are, with a bs given name of Ronald James Alliy.
   Texas Go Big or Go Home, Everything is bigger in Texas
   From Michigan 15, Born Fl, 1989 aries birthstone.
   1 File, Smooth, looks like it doesn't, yet bet its super player like "A bot designed to mimic my gameplay".
   While loops will be true, until center then becomes False on the way back up. ON & OFF Structure.
   Random!!!!!!!!!
   Times need to be fixed!
   This is F2P full map bot.
   Project file you don't know what to do with this.
   Other files still got Proof.

   Believe it |! "or not" !| "not or" Ture Robotic code.

   I WANT TO UPLOAD EXISTENCE TO BE THE FREE THAT IT SHOULD BE.
 */
@ScriptManifest(category = Category.MISC, name = "411in0n3", author = "f4i13rr0r", version = 1)
public class F2P extends AbstractScript {

    @Override
    public void onStart() {
        Logger.log("Hello Please standby, Starting the bot you will every again!");
    }

    @Override
    public int onLoop() {

        final Area Dryanor = new Area(
                new Tile(3092, 3240, 0),
                new Tile(3097, 3240, 0),
                new Tile(3097, 3246, 0),
                new Tile(3092, 3246, 0));
        final Area Lumbridge = new Area(
                new Tile(3218, 3216, 0),
                new Tile(3224, 3216, 0),
                new Tile(3224, 3221, 0),
                new Tile(3218, 3221, 0));

            while (!Alk.contains(Players.getLocal())) {
            Logger.log("ON | FireRunes | Mine | Fish | Tanned Hides | Soft Clay | Silk | PieDish | Milk | Lumb River Fish");
            Logger.log("OFF VarE | Combat Giants | Mage | Yew | RuneMine");
                while (!VarE.contains(Players.getLocal())) {
                Logger.log("");
                Logger.log("");
                    while (!VarW.contains(Players.getLocal())) {
                    Logger.log("");
                    Logger.log("");
                        while (!Chef.contains(Players.getLocal())) {
                        Logger.log("");
                        Logger.log("");
                            while (!Edge.contains(Players.getLocal())) {
                            Logger.log("");
                            Logger.log("");
                                while (!Barb.contains(Players.getLocal())) {
                                Logger.log("");
                                Logger.log("");
                                    while (!Fal.contains(Players.getLocal())) {
                                    Logger.log("");
                                    Logger.log("");
                                        while (!Craft.contains(Players.getLocal())) {
                                        Logger.log("");
                                        Logger.log("");
                                            while (!CovD.contains(Players.getLocal())) {
                                            Logger.log("");
                                            Logger.log("");
                                                while (!Rim.contains(Players.getLocal())) {
                                                Logger.log("");
                                                Logger.log("");
                                                    while (!Port.contains(Players.getLocal())) {
                                                    Logger.log("");
                                                    Logger.log("");
                                                        while (!MusePoint.contains(Players.getLocal())) {
                                                        Logger.log("");
                                                        Logger.log("");
                                                            while (!Dryanor.contains(Players.getLocal())) {
                                                            Logger.log("");
                                                            Logger.log("");
                                                                if (Lumbridge.contains(Players.getLocal())) {
                                                                Logger.log("");
                                                                    int lumb = Calculations.random(0, 14);
                                                                    switch (lumb) {
                                                                        case 0:
                                                                            //Wool
                                                                            break;
                                                                        case 1:
                                                                            //WC
                                                                            sleep(345345, 4636);
                                                                            break;
                                                                        case 2:
                                                                            //FM logs
                                                                            //Prep PieDish
                                                                            break;
                                                                        case 3:
                                                                            //FM logs
                                                                            //Pots for Flour
                                                                            break;
                                                                        case 4:
                                                                            //FM logs
                                                                            //Buckets for Milk
                                                                            break;
                                                                        case 5:
                                                                            //FM logs
                                                                            //Jugs for Wine
                                                                            break;
                                                                        case 6:
                                                                            //Eggs
                                                                            break;
                                                                        case 7:
                                                                            //Quests
                                                                            break;
                                                                        case 8:
                                                                            //Tutor Range, Mage, Melee
                                                                            break;
                                                                        case 9:
                                                                            //Adventurer Jon, Claim Extras when levels are present
                                                                            break;
                                                                        case 10:
                                                                            //Feathers
                                                                            //Prayer
                                                                            //Cook
                                                                            break;
                                                                        case 11:
                                                                            //CowHides
                                                                            //Prayer
                                                                            //Cook
                                                                            break;
                                                                        case 12:
                                                                            //NewComer map & Security book
                                                                            break;
                                                                        case 13:
                                                                            //When enough change death stone Angle
                                                                            break;
                                                                        case 14:
                                                                            //Buy 1 and somehow delete this
                                                                            break;
                                                                    }
                                                                } else {
                                                                    if (!MusePoint.contains(Players.getLocal())) {//??????????
                                                                        if (!Chef.contains(Players.getLocal())) {
                                                                            if (Inventory.isFull()) {
                                                                                if (!CovB.contains(Players.getLocal())) {
                                                                                    while (!CovB.contains(Players.getLocal())) {
                                                                                        Walking.walk(CovB.getRandomTile());
                                                                                    }
                                                                                } else {
                                                                                    if (CovB.contains(Players.getLocal())) {
                                                                                        if (Bank.isOpen()) {
                                                                                            Bank.depositAllItems();
                                                                                            //Prep for CraftGuild
                                                                                            sleep(34235, 245346);
                                                                                            if (!onShip.contains(Players.getLocal())) {
                                                                                                while (!onShip.contains(Players.getLocal())) {
                                                                                                    if (!CovD.contains(Players.getLocal())) {
                                                                                                        Walking.walk(CovD.contains(Players.getLocal()));
                                                                                                    } else {
                                                                                                        //Board the Ship
                                                                                                        sleep(43534, 57857);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            Bank.open();
                                                                                            sleep(4352, 65756);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                if (onShip.contains(Players.getLocal())) {
                                                                                    //ManLand
                                                                                    sleep(3452354, 34634);
                                                                                } else {
                                                                                    if (!Craft.contains(Players.getLocal())) {
                                                                                        while (!Craft.contains(Players.getLocal())) {
                                                                                            Walking.walk(Craft.getRandomTile());
                                                                                            sleep(3252, 46745);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            while (!VarW.contains(Players.getLocal())) {
                                                                                Walking.walk(VarW.getRandomTile());
                                                                            }
                                                                        }
                                                                    } else {

                                                                        sleep(3446,546);
                                                                    }
                                                                }
                                                            }
                                                            int draynor = Calculations.random(0, 4);
                                                            int craftG = Skills.getRealLevel(Skill.CRAFTING);
                                                            switch (draynor) {
                                                                case 0:
                                                                    //Make Sure bank is open first
                                                                    if (craftG >=40 && Bank.contains("Brown apron")) {
                                                                        //Prep for CraftGuild
                                                                        //If this case gets called then skip Muse Point
                                                                        sleep(7756,68676);
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    //Melee
                                                                    break;
                                                                case 2:
                                                                    //Mage
                                                                    sleep(53636,647567);
                                                                    break;
                                                                case 3:
                                                                    //Ranged
                                                                    sleep(43634,3463);
                                                                    break;
                                                                case 4:
                                                                    sleep(454362,3463);
                                                                    break;
                                                            }
                                                        }
                                                        while (!MusePointImp.contains(Players.getLocal())) {
                                                            for (int musepoint = 0; musepoint < 1;) {
                                                                Walking.walk(MusePointImp.getRandomTile());
                                                                sleep(1500, 2500);
                                                                if (MusePointImp.contains(Players.getLocal())) {
                                                                    for (int musepointimp = 0; musepointimp < 28; ) {
                                                                        musepoint++;
                                                                        if (Inventory.isFull()) {
                                                                            while (!Port.contains(Players.getLocal())) {
                                                                                if (MusePoint.contains(Players.getLocal())) {
                                                                                    //Pay ship fair to Port
                                                                                    sleep(6000,9000);
                                                                                    musepointimp++;
                                                                                    break;
                                                                                } else {
                                                                                    Walking.walk(MusePoint.getRandomTile());
                                                                                }
                                                                            }
                                                                        } else {
                                                                            // execute combat until inventory is full.

                                                                            musepointimp++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    while (Inventory.isFull()) {
                                                        while (PortDB.contains(Players.getLocal())) {
                                                            //GameObject = GameObjects
                                                            if (DepositBox.isOpen()) {
                                                                DepositBox.depositAllExcept("Pick axe, Axe, Tinder box, ");
                                                                //Des
                                                                sleep(1000,3000);
                                                                break;
                                                            } else {
                                                                DepositBox.open();
                                                                sleep(1000,3000);
                                                            }
                                                        }
                                                        while (!PortDB.contains(Players.getLocal())) {
                                                            Walking.walk(PortDB.getRandomTile());
                                                        }
                                                    }
                                                    int port = Calculations.random(0, 11);
                                                    switch (port) {
                                                        case 0:
                                                            //Yew
                                                            break;
                                                        case 1:
                                                            //Willow
                                                            break;
                                                        case 2:
                                                            //Oak
                                                            break;
                                                        case 3:
                                                            //Beers
                                                            break;
                                                        case 4:
                                                            //Bait
                                                            break;
                                                        case 5:
                                                            //Runes
                                                            break;
                                                        case 6:
                                                            //Jewellery
                                                            break;
                                                        case 7:
                                                            //Rum
                                                            break;
                                                        case 8:
                                                            //BattleAxe
                                                            break;
                                                        case 9:
                                                            //FM Yew
                                                            break;
                                                        case 10:
                                                            //FM Willow
                                                            break;
                                                        case 11:
                                                            //FM Oak
                                                            break;
                                                        case 12:
                                                            //Food Shop
                                                            break;
                                                    }
                                                }
                                                int rim = Calculations.random(0, 6);
                                                int mining = Skills.getRealLevel(Skill.MINING);
                                                int craftG = Skills.getRealLevel(Skill.CRAFTING);
                                                int mapple = Quests.getQuestPoints();
                                                switch (rim) {
                                                    case 0:
                                                        if (mining >= 40) {
                                                            //Mine Gold
                                                            sleep(9000,15000);
                                                        } else {
                                                            break;
                                                        }
                                                    case 1:
                                                        if (mining >= 10) {
                                                            //Mine Iron
                                                            sleep(9000,15000);
                                                        } else {
                                                            break;
                                                        }
                                                    case 2:
                                                        //Mine Clay0
                                                        break;
                                                    case 3:
                                                        //Mine Clay1
                                                        break;
                                                    case 4:
                                                        //Mine Tin
                                                        break;
                                                    case 5:
                                                        //Mine copper
                                                        break;
                                                    case 6:
                                                        //Cov
                                                        if (mapple >= 22) {
                                                            //Mine a Bag Gold, || Random bag?
                                                            //While Walk, to Island
                                                            sleep(100,300);
                                                        } else {
                                                            if (craftG >= 40 && Equipment.contains("Reg of CraftGuild")) {
                                                                //Null Cov, check CraftGuild
                                                                //Gold, Sliver, Clay & Bank Fal
                                                                sleep(333,444);
                                                            } else {
                                                                //Null CraftGuild, Fal
                                                                sleep(555,777);
                                                                break;
                                                            }
                                                        }
                                                }
                                            }
                                            int cov1 = Calculations.random(3,33);
                                            for (int cov0 = 0; cov0 < cov1;) {
                                                if (!CovB.contains(Players.getLocal())) {
                                                    if (Inventory.isFull()) {
                                                        while (!CovB.contains(Players.getLocal())) {
                                                            Walking.walk(CovB.getRandomTile());
                                                        }
                                                    } else {
                                                        while (CovM.contains(Players.getLocal())) {
                                                            //Chop Mapple
                                                            sleep(324,245);
                                                            if (Inventory.isFull()){
                                                                cov0++;
                                                            }
                                                        }

                                                    }
                                                } else {
                                                    while (CovB.contains(Players.getLocal())) {
                                                        if (Bank.isOpen()) {
                                                            Bank.depositAllItems();
                                                            sleep(34235, 245346);
                                                            while (!CovM.contains(Players.getLocal())) {
                                                                Walking.walk(CovM.contains(Players.getLocal()));
                                                            }
                                                        } else {
                                                            Bank.open();
                                                            sleep(4352, 65756);
                                                        }
                                                    }
                                                }

                                            }
                                        }
                                        int craft = Calculations.random(0, 2);
                                        switch (craft) {
                                            case 0:
                                                //Gold
                                                break;
                                            case 1:
                                                //Sliver
                                                break;
                                            case 2:
                                                //Clay
                                                break;
                                        }
                                    }
                                    int fal = Calculations.random(0,5);
                                    switch(fal) {
                                        case 0:
                                            //Wizard Bombs, Beer, ?
                                            break;
                                        case 1:
                                            //MineGuild
                                            break;
                                        case 2:
                                            //Non MineGuild, level 40
                                            break;
                                        case 3:
                                            //Soft Clay
                                            break;
                                        case 4:
                                            // Runes
                                            break;
                                        case 5:
                                            //Mine Clay, Bucket, Fountain @ church, Barb & Craft w/e, PieDishes
                                            break;
                                    }
                                }
                                int barb = Calculations.random(0,4);
                                switch(barb) {
                                    case 0:
                                        //Melee, Range, Mage, Beer
                                        break;
                                    case 1:
                                        //Coal
                                        break;
                                    case 2:
                                        //PieDish
                                        break;
                                    case 3:
                                        //Fish & Cook
                                        break;
                                    case 4:
                                        //Strong Hold
                                        break;
                                    case 5:
                                        //Cook
                                        break;
                                    case 6:
                                        //EdgeB
                                        break;
                                }
                            }
                            int edge = Calculations.random(0,6);
                            switch(edge) {
                                case 0:
                                    //Soft Clay
                                    break;
                                case 1:
                                    //Yew
                                    break;
                                case 2:
                                    //Willow
                                    break;
                                case 3:
                                    //Oak
                                    break;
                                case 4:
                                    //Smelt
                                    break;;
                                case 5:
                                    //Prep ChefGuild
                                    break;;
                                case 6:
                                    //PieDish
                                    break;
                            }
                        }
                        //for get in get out
                    }
                    int varw = Calculations.random(0,4);
                    switch(varw) {
                        case 0:
                            //Smith
                            break;
                        case 1:
                            //Mine, Sliver, Clay, Iron
                            break;
                        case 2:
                            //Soft Clay
                            break;
                        case 3:
                            //Ales
                            break;
                        case 4:
                            //VarE
                            break;
                    }
                }
                int vare = Calculations.random(0,4);
                switch(vare) {
                    case 0:
                        //RuneMine
                        break;
                    case 1:
                        //Melee, Range, Mage, Pray, Giants
                        break;
                    case 2:
                        //Melee, Range, Mage, Pray, Mages
                        break;
                    case 3:
                        //Beer
                        break;
                    case 4:
                        //Yew
                        break;
                }
            }
            int alk = Calculations.random(0,10);
            switch(alk) {
                case 0:
                    //FireRunes
                    break;
                case 1:
                    //Mine
                    break;
                case 2:
                    //Fish
                    break;
                case 3:
                    //Tanned Hides
                    break;
                case 4:
                    //Soft Clay
                    break;
                case 5:
                    //Silk
                    break;
                case 6:
                    //PieDish
                    break;
                case 7:
                    //Milk
                    break;
                case 8:
                    //Lumb River Fish
                    break;
                case 9:
                    //Lumb Walk Bank
                    break;
                case 10:
                    //HomeTeleport
                    break;
            }
        //HomeTeleport
        return Calculations.random(3000,9000);
    }

    @Override
    public void onExit() {
        Logger.log("Donate, comes better equipment, regarding P2P osrs upgraded bot, New School complexity.");
    }

    @Override
    public void onPaint(Graphics Art) {

    }
}
