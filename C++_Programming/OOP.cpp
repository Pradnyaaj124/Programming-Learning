#include<iostream>
using namespace std;

class Arithmetic
{
  public:
    int no1;
    int no2;
    
    Arithmetic()
    {
        no1 = 0;
        no2 = 0;
    }
    Arithmetic(int i , int j)
    {
        no1 = i;
        no2 = j;
    }
};

int main()
{
    Arithmetic aboj1;
    Arithmetic aboj2(10 , 11);

    cout<<aboj1.no1<<"\n";
    cout<<aboj1.no2<<"\n";

    cout<<aboj2.no1<<"\n";
    cout<<aboj2.no2<<"\n";

    return 0;
}