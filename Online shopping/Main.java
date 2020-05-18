#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int Fa,Fd,Fc,Sa,Sd,Sc,Aa,Ad,Ac;
  cin>>Fa>>Fd>>Fc>>Sa>>Sd>>Sc>>Aa>>Ad>>Ac;
  
  Fa = Fa - (Fa*Fd/100) + Fc;
  Sa = Sa - (Sa*Sd/100) + Sc;
  Aa = Aa - (Aa*Ad/100) + Ac;
  cout<<"In Flipkart Rs."<<Fa<<endl;
  cout<<"In Snapdeal Rs."<<Sa<<endl;
  cout<<"In Amazon Rs."<<Aa<<endl;
  
  if(Fa<=Sa && Fa<Aa)
    cout<<"He will prefer Flipkart";
  else if(Sa<Fa && Sa<Aa)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}