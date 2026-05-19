public class array3 {
    public static void main(String[] args) {
        String[] arr = {"this", "one", "doing", "hello"};
        String s = "";

        //print all string whch end with ing starts with th
        for(int i = 0; i < arr.length; i++){
            if(arr[i].startsWith("th") && arr[i].endsWith("ing")){
                System.out.println(arr[i]);
            }
            
        //contains AND
         for(int i = 0; i < arr.length; i++){
            if(arr[i].contains("and")){
                System.out.println(arr[i]);
            }
        }

        //print first 4 character
          for(int i = 0; i < arr.length; i++){
            if(arr[i].contains("and")){
                System.out.println(arr[i].charAt(0));
                System.out.println(arr[i].substring(0,4));
            }
        }

        //capitalise  
        // Character.toUpperCase();

        

    }
}
