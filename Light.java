//compute the distance light travels using long variables
public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        //approximate speed of light in miles per second and lightspeed = 186,000

        lightspeed = 186000;

        days = 2000; //specify the number of days here
        seconds = days * 24 * 60 * 60; //convert to seconds
        distance = lightspeed * seconds; //compute distance

        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles. ");

    }
}
