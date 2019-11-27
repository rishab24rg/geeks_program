#include<iostream>
using namespace std;
long long merge(long long *arr,long long *LArr,long long* RArr,long long m,long long n)
{
    long long i=0,j=0,k=0;
    long long count = 0;
    while(i<m && j<n)
    {
        if(LArr[i]<=RArr[j])
            arr[k++] = LArr[i++];
        else
        {
             arr[k++] = RArr[j++];
             count = count + m - i;
        }
    }
    while(i<m)
         arr[k++] = LArr[i++];
    while(j<n)
         arr[k++] = RArr[j++];
    return count;
}
long long mergeSort(long long *arr,long long start,long long end)
{
    if(start>end)
        return 0;
    if(start==end)
        return 0;
    if(start==end-1)
    {
        if(arr[start]<=arr[end])
            return 0;
        else
            swap(arr[start],arr[end]);
        return 1;
    }

    long long mid = (start+end)/2;
    long long *LArr = new long long[mid+1];
    long long *RArr = new long long[end-mid];
    long long i;
    for(i=start;i<=mid;i++)
        LArr[i] = arr[i];
    for(i=mid+1;i<=end;i++)
        RArr[i-(mid+1)] = arr[i];


    long long count = 0;
    count += mergeSort(LArr,0,mid);
    count += mergeSort(RArr,0,end-mid-1);
    count += merge(arr,LArr,RArr,mid+1,end-mid);

    delete [] LArr;
    delete [] RArr;
    return count;
}

int  main()
{
    long long t,n,*arr;
    cin>>t;
    while(t--)
    {
        cin>>n;
        arr = new long long[n];
        for(long long i=0;i<n;i++)
            cin>>arr[i];
        cout<<mergeSort(arr,0,n-1)<<endl;
    }


}
