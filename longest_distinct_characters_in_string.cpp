#include <iostream>
#include <string>
#include<bits/stdc++.h>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--){
	    string str;
	    cin>>str;
	    int max1=1,start=0,end=0,i;
	    int a[26];
	    memset(a,-1,sizeof(a));
	    for(i=0;i<str.length();i++){
	        if(a[str[i]-'a']==-1){
	            a[str[i]-'a']=i;
	            end++;
	        }
	        else{
	            if(a[str[i]-'a']<start){
	            a[str[i]-'a']=i;
	            end++;
	            }
	            else{
	                start=a[str[i]-'a']+1;
	                a[str[i]-'a']=i;
	                end++;
	            }
	        }
	        max1=max(max1,end-start);
	    }
	    cout<<max1<<endl;
	}
	return 0;
}
