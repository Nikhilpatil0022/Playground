#include <iostream>
using namespace std;
struct student
{
    string name;
    int roll;
    float marks;
};
int main() 
{
   //Your code goes here
  struct student s;
  getline(cin,s.name);
  cin>>s.roll;
  cin>>s.marks;
  cout<<endl;
  cout<<"Student Details"<<endl;
  cout<<"Name: "<<s.name<<endl;
  cout<<"Roll: "<<s.roll<<endl;
  cout<<"Marks: "<<s.marks;
}