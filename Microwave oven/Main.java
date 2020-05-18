#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float t;
  cin>>n>>t;
  if(n == 1)
  {
    t = t;
    cout<<t;}
  else if(n == 2)
  {
    t = t + t*0.5;
    cout<<t;}
  else if(n == 3)
  {
    t = t*2;
    cout<<t;}
  else if(n>3) 
    cout<<"Number of items is more";
  
}