class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int l=0, h=mountainArr.length()-1;
        // int c=0;
        while(l<h){
            int mid=(l+h)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1))l=mid+1;
            else h=mid;
            
        }
        int x=found(target,mountainArr,0,l,true);
        if(x!=-1)return x;
        // System.gc();
        return found(target,mountainArr,l,mountainArr.length()-1,false);

    }
    int found(int t,MountainArray mountainArr,int l,int h,boolean flag){
        while(l<=h){
            int mid=(l+h)/2;
            if(mountainArr.get(mid)==t)return mid;
            if(mountainArr.get(mid)>t ){
                if(!flag)l=mid+1;
                else h=mid-1;
                }
            else {
                if(flag)l=mid+1;
                else h=mid-1;
                }
        }
        System.gc();
        return -1;
    }

}