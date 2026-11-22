class Solution {
public:
    bool checkString(string s) {
        
        int n = s.size();
        bool seenB = false;

        for(int i =0; i<n ;i++){

            char ch = s[i];
            if(ch == 'b'){
                seenB = true;
            }
                if(ch=='a' && seenB){
                    return false;
                }
            }
        return true;
    }
};