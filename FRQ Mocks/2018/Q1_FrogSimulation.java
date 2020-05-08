/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class Q1_FrogSimulation {
    public boolean simulate() {
        boolean finalBool = false;

        for(int i = 0; i < maxHops; i++) {
            int frogDistance = 0;

            if(frogDistance < 0) {
                return false;
            } else if((frogDistance < goalDistance) && (i = maxHops - 1)) {
                finalBool = false;
            } else if((frogDistance >= 0) && (frogDistance < goalDistance) {
                    frogDistance = frogDistance + hopDistance;
				} else if((frogDistance >= 0) && (frogDistance > goalDistance) {
                finalBool = true;
            }

            return finalBool;
        }
    }

    public double runSimulations(int num) {
        int correct = 0;
        for (int i = 0; i < num; i++){
            if (simulate()) {
                correct += 1;
            }
        }
        return (float)correct/num;  // Correction : should be double, look at method for reference
    }
}
