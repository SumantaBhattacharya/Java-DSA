public class LinearS {
    public static void main(String[] args) {
       
        String Name = "Sumanta";
        // item to search
        char searchItem = 'm';// char should use single quotes ('m')

        boolean found = linearSearch(Name, searchItem);
        boolean found2 = linearSearch2(Name, searchItem);
        System.out.println(found2);

        if (!found) { 
            System.out.println("Element not found");
        } else {
            System.out.println("Element found");
        }

    }

    public static boolean linearSearch(String name, char searchItem ) {

        // in array it's .length but in string its .length() inernally its using the array too(it has calling over here)
        if(name.length() == 0){
            return false;
        }

        // name.length() != 0 then 
        for (int i = 0; i < name.length(); i++) {// A char does not have a .length property because it’s not a string or array—it's a single character.
            
            if (name.charAt(i) == searchItem) {
                return true;
            }else{
                continue;
            }

        }

        return false;

    }

    public static boolean linearSearch2(String name, char searchItem ) {

        // in array it's .length but in string its .length() inernally its using the array too(it has calling over here)
        if(name.length() == 0){
            return false;
        }

        // name.length() != 0 then 
        for (char element : name.toCharArray()) {// Can only iterate over an array or an instance of java.lang.Iterable 
            if (element == searchItem) {
                return true;
            }
        }

        return false;

    }

}


