// Java program to get a specific character
// from a given String at a specific index

class CharacterGet{

    // Driver code
    public static void main(String[] args)
    {

        // Get the String
        String str = "GeeksForGeeks";

        // Get the index
        int index = 5;

        // Get the specific character
        char ch = str.charAt(index);

        System.out.println("Character from " + str
                           + " at index " + index
                           + " is " + ch);
    }
}