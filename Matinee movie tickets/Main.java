#include<iostream>
using namespace std;
int main()
{
  int age;
  float time;
  cin>>age;
  cin>>time;
  //Type your code here.
  if(age<14)
  {
    if((int)time == 13)
      cout<<"$2.00";
    else
      cout<<"$4.00";
  }
  else
  {
    if((int)time == 13)
      cout<<"$5.00";
    else
      cout<<"$8.00";
  }
  return 0;
}