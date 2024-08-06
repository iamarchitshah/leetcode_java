class Java_sum_multiples {
    public int sumOfMultiples(int n) {
        int i=3,j=5,k=7;
        int cnt=0;
        for(int l=1;l<=n;l++){
            if(l%i==0 || l%j==0 || l%k==0){
               cnt = cnt + l; 
            }
        }
        return cnt;
        
    }
}