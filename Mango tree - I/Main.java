#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,N;
  cin>>r>>c>>N;
  if((N>=1 && N<=c)||(N%c<=1))
    cout<<"Yes";
  else
    cout<<"No";
}