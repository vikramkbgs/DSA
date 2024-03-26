class Solution {
  public int countPoints(String rings) {
    ArrayList<Integer> red = new ArrayList<>(10);
        ArrayList<Integer> green = new ArrayList<>(10);
        ArrayList<Integer> blue = new ArrayList<>(10);

        // Initializing ArrayLists with zeros
        for (int i = 0; i < 10; i++) {
            red.add(0);
            green.add(0);
            blue.add(0);
        }

        // Setting values based on input rings
        for (int i = 0; i < rings.length() - 1; i = i + 2) {
            char ring = rings.charAt(i);
            int ringNum = Character.getNumericValue(rings.charAt(i + 1)); // Corrected conversion
            if (ring == 'R')
                red.set(ringNum, 1);
            else if (ring == 'G')
                green.set(ringNum, 1);
            else if (ring == 'B')
                blue.set(ringNum, 1);
        }

        // Counting points
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (red.get(i) == 1 && green.get(i) == 1 && blue.get(i) == 1)
                count++;
        }
        return count;
  }
}