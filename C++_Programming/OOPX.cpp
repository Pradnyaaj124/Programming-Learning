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

    int addition()
    {
        int ans = 0;
        ans = no1 + no2;
        return ans;
    }
};

int main()
{
    Arithmetic aboj1(10 , 11);
    int result = 0;

    result = aboj1.addition();

    cout<<"Addition is :"<<result<<"\n";

    return 0;
}