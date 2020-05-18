#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float m;
  int L,D;
  cin>>m>>L>>D;
  if((m*L) < D)
    cout<<"Cannot reach";
  else
    cout<<"Can reach";
}