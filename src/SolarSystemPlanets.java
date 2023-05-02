public enum SolarSystemPlanets {


        MERCURY(1, 0, 0, 2439.7, null, null),
        VENUS(2, 57910000, 108200000, 6051.8, null, null),
        EARTH(3, 149600000, 149600000, 6371.0, null, null),
        MARS(4, 227940000, 227940000, 3389.5, null, null),
        JUPITER(5, 778330000, 778330000, 69911.0, null, null),
        SATURN(6, 1427000000, 1429400000, 58232.0, null, null),
        URANUS(7, 2871000000L, 2870990000L, 25362.0, null, null),
        NEPTUNE(8, 4498000000L, 4498250000L, 24622.0, null, null);

        private final int orderFromSun;
        private final long distanceFromPrevPlanet;
        private final long distanceFromSun;
        private final double radius;
        private SolarSystemPlanets prevPlanet;
        private SolarSystemPlanets nextPlanet;

        static {
            MERCURY.nextPlanet = VENUS;
            VENUS.prevPlanet = MERCURY;
            VENUS.nextPlanet = EARTH;
            EARTH.prevPlanet = VENUS;
            EARTH.nextPlanet = MARS;
            MARS.prevPlanet = EARTH;
            MARS.nextPlanet = JUPITER;
            JUPITER.prevPlanet = MARS;
            JUPITER.nextPlanet = SATURN;
            SATURN.prevPlanet = JUPITER;
            SATURN.nextPlanet = URANUS;
            URANUS.prevPlanet = SATURN;
            URANUS.nextPlanet = NEPTUNE;
            NEPTUNE.prevPlanet = URANUS;
        }

        public SolarSystemPlanets getNextPlanet() {
            return nextPlanet;
        }

        SolarSystemPlanets(int orderFromSun, long distanceFromPrevPlanet, long distanceFromSun, double radius, SolarSystemPlanets prevPlanet, SolarSystemPlanets nextPlanet) {
            this.orderFromSun = orderFromSun;
            this.distanceFromPrevPlanet = distanceFromPrevPlanet;
            this.distanceFromSun = distanceFromSun;
            this.radius = radius;
        }

        public int getOrderFromSun() {
            return orderFromSun;
        }

        public long getDistanceFromPrevPlanet() {
            return distanceFromPrevPlanet;
        }

        public long getDistanceFromSun() {
            return distanceFromSun;
        }

        public double getRadius() {
            return radius;

        }

        public SolarSystemPlanets getPrevPlanet() {
            return prevPlanet;
        }
    }
