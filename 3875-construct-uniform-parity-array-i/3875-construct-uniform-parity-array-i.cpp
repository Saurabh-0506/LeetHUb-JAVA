class Solution {
public:
    bool uniformArray(vector<int>& nums1) {

        bool even = false;
        bool odd = false;
        for( int num : nums1)
        {
            if(num%2==0) 
            even = true;
            else
            odd = true;
        }
            return even || odd;
    
        
    }
};