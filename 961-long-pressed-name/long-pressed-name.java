class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int a = name.length();
        int b = typed.length();

        if(a>b)
        return false;

        int idx=0;
        char end ='0', ch ='0';
        for(char c:typed.toCharArray()){
            if(idx<a)
            ch = name.charAt(idx);
            else idx--;

            if(c==ch){
                end = ch;
                idx++;
        }else if(end!= c) return false;
    }
    return idx == a;
}
}