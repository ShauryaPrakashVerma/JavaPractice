//Program to understand implementation of String Builder class

class ArrayToString{
    public static void main(String[] args) {
        String[] arr= new String[] {"My ","name ","is ","Shaurya"," Prakash ","Verma."};
        StringBuilder sb= new StringBuilder();
        for(String str:arr){
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}