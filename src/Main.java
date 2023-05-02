public class Main {
    public static void main(String[] args) {
        SolarSystemPlanets earth = SolarSystemPlanets.EARTH;
        System.out.println("Earth has radius of " + earth.getRadius() + " km.");
        System.out.println("It is located " + earth.getOrderFromSun() + " from the sun.");
        System.out.println("Its next planet is " + earth.getNextPlanet() + ".");
    }
}