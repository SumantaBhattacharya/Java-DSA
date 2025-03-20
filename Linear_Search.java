public class Linear_Search {
    // linear search handled with strings
    public static void main(String [] args){
    
        String Quote = "Everybody is a Genius. But If You Judge a Fish by Its Ability to Climb a Tree, It Will Live Its Whole Life Believing that It is Stupid";
        String searchTerm = "Genius";

        boolean bool = linearSearch(Quote, searchTerm);

        if (bool == true) {
            System.out.println("Yes, Genius exists in String");
        }else{
            System.out.println("No, Genius not exists in String");
        }

    }

    public static boolean linearSearch(String str, String searchTerm){

        // firstly, we need to convert both string(Quote, searhTerm ) to lower case to make the search case insensitive

        String lowerCaseQuote = str.toLowerCase();
        String lowerCaseSearchTerm = searchTerm.toLowerCase();

        // we need to minus the searchTerm from the Quote, to find out the limitation of the loop
        int limit = str.length() - searchTerm.length();
        // lowerCaseQuote.length() - lowerCaseSearchTerm.length()

        // check the length first
        if(str.length() < searchTerm.length()){
            return false;
        }

        if (str.length() != 0 && searchTerm.length() != 0) {
            // we could have used the original name it wouldnt make a difference.
            // not i < limit, otherwise, it may miss the last possible substring match.
            for (int i = 0; i <= limit ; i++) {
                
                // lowerCaseQuote.substring(startIndex, endIndex)
                //  i determines where we begin extracting the substring.
                // i + lowerCaseSearchTerm.length() determines the end of the substring

                /*if (lowerCaseQuote.substring(i, i + lowerCaseSearchTerm.length()).equals(lowerCaseSearchTerm)) {
                    return true;
                }*/

                // Extract a substring of the same length as searchTerm
                // if searchTerm.length() is 6 ("Genius"), and i = 10,
                // We should extract "genius" starting from index 10
                // "genius" has 6 characters, so we extract from 10 to 10 + 6 = 16

                /*Check if the extracted substring matches the search term
                '==' compares references (memory addresses) meaning it checks whether both variables point to the same memory location, not actual string content.
                This may return false even if both strings contain the same characters because they may be stored in different memory locations.
                'equals' compares string content meaning it checks whether the actual string content is same.*/
                String substring = lowerCaseQuote.substring(i, i + lowerCaseSearchTerm.length());
                // If we used substring(i, lowerCaseSearchTerm.length()), it would always take from index 0 to the length, which is incorrect.

                // If the substring matches the search term, return true
                // else continue the loop
                if (substring.equals(lowerCaseSearchTerm)) {
                    return true;
                }

            }
        }else{
            return false;
        }

        return false; // No match found

    }

}

/* 
Iteration in Loop
i (Start Index) 	i + 6 (End Index)	Extracted Substring	Matches "genius"?
0	6	            "everyb"	                ❌ No
1	7	            "verybo"	                ❌ No
2	8	            "erybod"	                ❌ No
10	16	            "genius"	                ✅ Yes!
*/