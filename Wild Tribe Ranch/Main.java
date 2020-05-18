#include<iostream>
using namespace std;
int main()
{
 int maxW,flW;
  cin>>maxW>>flW;
  if(flW < maxW)
  {
    cout<<"Yes, you can enter.";
  }
  else if(flW==maxW)
  {
    cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else
  {
    cout<<"Sorry, you can't enter";
  }
}