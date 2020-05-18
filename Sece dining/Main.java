#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string A;
  cin>>A;
  int N;
  cin>>N;
  if(A[0]=='f')
  {
    if(N==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else
  {
    if(N==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
}