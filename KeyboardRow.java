public class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> matches = new ArrayList<String>();

        for(String word : words){
              if(word.toLowerCase().matches("[qwertyuiop]*") || word.toLowerCase().matches("[asdfghjkl]*") || word.toLowerCase().matches("[zxcvbnm]*"))
              {
                  System.out.println("Adding new match: " + word);
                  matches.add(word);
              }
        }

        return matches.toArray(new String[matches.size()]);
    }
}
