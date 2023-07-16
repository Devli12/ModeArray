public class Quiz_Mode {
  public static void main(String[] args) {

    int[] array = { 66, 78, 74, 1001, 40, 78, 88, 90, 33 };

    int maxValue = 0; // to hold the mode value
    int maxCount = 0; // the number of times the mode occurs

    for (int i = 0; i < array.length; ++i) {
      int count = 0;
      for (int j = 0; j < array.length; ++j) {
        if (array[j] == array[i])
          ++count; // counter to count the number of times the current number occurs
      }
      if (count > maxCount) { // If the counter is greater than the maxCount, then the current number
        maxCount = count;
        maxValue = array[i];
      }
    }

    System.out.println("Mode: " + maxValue);
  }

}
