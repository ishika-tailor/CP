class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        
        int cnt[]= new int[5];
        int i,max_frog=0,frog=0;
        for(i=0;i<croakOfFrogs.length();++i){
            var c=croakOfFrogs.charAt(i);
            var n="crock".indexOf(c);
            cnt[n]=cnt[n]+1;
            
                if(n==0)
                    max_frog=Math.max(max_frog,++frog);
            
                else if(--cnt[n-1]<0)
                    return -1;
                
                else if(n==4)
                    --frog;
                
        }
        return frog==0?max_frog:-1;
        }
    }


Input: croakOfFrogs = "croakcroak"
Output: 1 
Explanation: One frog yelling "croak" twice.