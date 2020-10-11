public class MadLibs {
    /*
 This program generates a mad libbed story.
 Author: Arnetta Knight
 Date: 10/10/2020
 */
    public static void main(String[] args){
        String name1 = "Lora Reign";
        String adjective1 = "horrible";
        String adjective2 = "dreadful";
        String adjective3 = "furious";
        String verb1 = "run";
        String noun1 = "people";
        String noun2 = "eggs";
        String noun3 = "radio";
        String noun4 = "cat";
        String noun5 = "shock";
        String noun6 = "death";
        String name2 = "Pamala Pickles";
        int number = 56;
        String place1 = "Cayman Islands";

        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "
                +adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" " +
                "in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s " +
                "very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to the "+place1+" and " +
                "dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world" +
                " where "+noun6+"s ruled the world.";


        System.out.println(story);
    }
}
