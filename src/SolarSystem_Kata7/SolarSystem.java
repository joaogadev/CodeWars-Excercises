package SolarSystem_Kata7;

public class SolarSystem {

    public char[] annotate(String[] celestialBodies) {
        if (celestialBodies.length < 2) {
            return new char[0];
        }
        char[] result = new char[celestialBodies.length - 1];

        for (int i = 1; i < celestialBodies.length; i++) {
            int body1 = getPositions(celestialBodies[i - 1]);
            int body2 = getPositions(celestialBodies[i]);

            if (body2 > body1) {
                result[i - 1] = '>';
            } else if (body2 < body1) {
                result[i - 1] = '<';
            } else {
                result[i - 1] = '=';
            }
        }
        return result;
    }
    public int getPositions(String body){
        switch (body) {
            case "Asteroid":
                return 0;
            case "Pluto":
                return 1;
            case "Mercury":
                return 2;
            case "Mars":
                return 3;
            case "Venus":
                return 4;
            case "Earth":
                return 5;
            case "Neptune":
                return 6;
            case "Uranus":
                return 7;
            case "Saturn":
                return 8;
            case "Jupiter":
                return 9;
            default:
                return -1; // For non-planetary bodies
        }
    }

    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();
        String[] celestialBodies = {"Mars", "Asteroid", "Venus", "Jupiter", "Asteroid", "Earth", "Pluto"};
        char[] annotations = solarSystem.annotate(celestialBodies);

        for (int i = 0; i < celestialBodies.length - 1; i++) {
            System.out.print(celestialBodies[i] + " " + annotations[i] + " " + celestialBodies[i + 1] + "\n");
        }
    }
}