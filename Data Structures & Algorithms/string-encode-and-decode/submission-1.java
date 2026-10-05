class Solution {

    public String encode(List<String> strs) {
         String val = "";
           for(String str:strs)
           {
            val = val + str.length() + "#" + str;
           }
           return val;
    }

    public List<String> decode(String encoded_string) {
        List<String> result = new ArrayList<>();

        int i = 0;
        while(i<encoded_string.length())
        {
            int separator = encoded_string.indexOf('#',i);
            int length = Integer.parseInt(encoded_string.substring(i,separator));

            int start = separator + 1;
            String str = encoded_string.substring(start,start+length);
          
            result.add(str);
            i = start + length;
        }

        return result;

    }
}
