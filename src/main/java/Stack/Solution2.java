package Stack;

class Solution2 {
    public static void main(String[] args) throws Exception {
        String s="()";
        //String s="()[]{}";
        //String s="(]";
        //String s="([])";
        System.out.print(isValid(s));
    }

    public static boolean isValid(String s) throws Exception {
        int count1=0;
        int count2=0;
        int count3=0;

        if(s.length()<1 || s.length()>Math.pow(10,4)) {
            throw new Exception("Bad string length.");
        }

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '[':
                    count1++;
                    break;
                case ']':
                    count1--;
                    break;
                case '(':
                    count2++;
                    break;
                case ')':
                    count2--;
                    break;
                case '{':
                    count3++;
                    break;
                case '}':
                    count3--;
                    break;
                default:
                    throw new Exception("Bad symbol in the string.");
            }
            if(count1<0 || count2<0 || count3<0)
                return false;
        }
        return true;
    }
}
