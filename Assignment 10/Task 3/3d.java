/*
d) 
Once the test cases are created and implemented using JUnit, they will fail since the implementation of the method convertAlphaNumeric() is unknown.
To make the test cases pass, you would need to implement the method convertAlphaNumeric() to satisfy the requirements and constraints of the problem as described above.

Here's a possible implementation:
*/
public static String convertAlphaNumeric(String input) {
    // Keep track of unique characters found in the input
    Set<Character> uniqueChars = new HashSet<>();
    // Keep track of numbers found in the input
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        // If the current character is a letter, add it to the set of unique characters
        if (Character.isLetter(c)) {
            uniqueChars.add(Character.toLowerCase(c));
        }
        // If the current character is a number, add it to the list of numbers
        else if (Character.isDigit(c)) {
            numbers.add(Character.getNumericValue(c));
        }
    }
    // Sort the list of numbers in ascending order
    Collections.sort(numbers);
    // Convert the set of unique characters to a char array
    char[] charArray = new char[uniqueChars.size()];
    int i = 0;
    for (char c : uniqueChars) {
        charArray[i] = c;
        i++;
    }
    // Sort the char array
    Arrays.sort(charArray);
    // Build the output string by concatenating the numbers, then the letters
    StringBuilder output = new StringBuilder();
    for (int number : numbers) {
        output.append(number);
    }
    for (char c : charArray) {
        output.append(c);
    }
    return output.toString();
}
