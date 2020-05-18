#include<iostream>
using namespace std;
int main(){
	int i ,j;
	cin>>i>>j;
  for(int x=i;x<=j;x++)
  {
    int sum = 0;
    for(int y =1;y<x;y++)
    {
      if(x%y==0)
      {
        sum+=y;
      }
    }
    if(sum==x)
      cout<<x<<" ";
  }
      
}