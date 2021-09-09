#include<bits/stdc++.h>
using namespace std;
 
int main()
{

	int n;
	cin>>n;
		vector<int> v(n);
	for(int i=0;i<n;i++)
	{
		cin>>v[i];
	}
	vector<int>vi(n,0);
	for(int x:v)
	{
		vi[x]++;
	}
	for(int i=0;i<n;i++)
	{
		if(vi[i]>1)
		{
			cout<<i<<" ";
		}
	}


 
return 0;
}