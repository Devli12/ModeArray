## Mode of an Array - Java Program

This Java program calculates the mode of an array of integers. The mode is the element that appears most frequently in the array.

### How the Program Works

1. An array of integers is defined, containing several numbers.
2. Two variables, `maxValue` and `maxCount`, are initialized to store the mode value and the number of times it occurs, respectively.
3. The program iterates through each element of the array, and for each element, it counts the number of occurrences by comparing it with all other elements in the array.
4. If the count of occurrences for the current element is greater than the current maximum count, the current element becomes the new mode candidate. The `maxValue` and `maxCount` are updated accordingly.
5. The process continues until all elements in the array are checked.
6. At the end of the loop, the program has found the element with the highest frequency, and its value is stored in `maxValue`, representing the mode of the array.
7. Finally, the program prints the mode value to the console.

### How to Use

1. Clone the repository or download the `Quiz_Mode.java` file.
2. Compile the Java program: `javac Quiz_Mode.java`
3. Run the program: `java Quiz_Mode`

### Example

Suppose the array contains the following elements: `{66, 78, 74, 1001, 40, 78, 88, 90, 33}`. After running the program, it will display the mode:

```
Mode: 78
```

This means that the number 78 appears most frequently in the array.

### Note

If there are multiple elements with the same maximum count, the program will only output one of them as the mode. To handle multiple modes, additional logic would be required.

### Enjoy Finding the Mode!

Use this Java program to find the mode of any array of integers. Feel free to modify and expand the code as needed for your specific use cases. Happy coding!
