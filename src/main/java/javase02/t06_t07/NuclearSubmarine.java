package javase02.t06_t07;

@MyAnno()
@SuppressWarnings({"unused", "WeakerAccess"})
public class NuclearSubmarine {

    private NuclearEngine nuclearEngine = new NuclearEngine();
    private int nuclearFuelLevel;

    public int getNuclearFuelLevel() {
        return nuclearFuelLevel;
    }

    public void setNuclearFuelLevel(int nuclearFuelLevel) {
        this.nuclearFuelLevel = nuclearFuelLevel;
    }

    private class NuclearEngine {
        private boolean start() {
            if (nuclearFuelLevel > 0){
                nuclearFuelLevel--;
                return true;
            }
            return false;
        }
    }

    void takeATrip() {
        System.out.println(nuclearEngine.start() ?
                "Good luck in the journey!" :
                "Not today - out of fuel :(");
    }
}
