//Take two strings, concatenate them, and convert the result to upper case.

class ConcatConvert{
    public static void main(String[] args) {
        String s1="Shaurya ";
        String s2="Prakash ";
        String s3= "Verma ";
        String fullName=s1+s2+s3;
        String fullName1=s1.concat("").concat(s2).concat(" ").concat(s3);
        System.out.println(s1.concat(s2)); //another method to concat strings
        System.out.println(fullName1);
        System.out.printf("%s\n",fullName);
        System.out.println(s1.toUpperCase()); //this actually returns a new string
        System.out.printf("%S",fullName); // this does not return a string
        // System.out.printf("%10s",fullName);
    }
}