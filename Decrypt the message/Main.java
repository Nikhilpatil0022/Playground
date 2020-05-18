#include <iostream>
using namespace std;
int main()
{
  int x,y,sum=0;
  cin>>x>>y;
  int z = x+y;
  for(int i=1;i<z;i++)
  {
    if(z%i==0)
     sum+=i;
  }
  if(sum==z)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}