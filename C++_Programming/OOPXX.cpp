#include<iostream>
using namespace std;

class Arithmetic
{
  public:
    int no1;
    int no2;
    
    Arithmetic()
    {
        this->no1 = 0;
        this->no2 = 0;
    }

    Arithmetic(int i , int j)
    {
        this->no1 = i;
        this->no2 = j;
    }

    // int addition(arithmetic *this)
    int addition()
    {
        int ans = 0;
        ans = this->no1 + this->no2;
        return ans;
    }

    // int subtraction(arithmetic *this)
    int subtraction()
    {
        int ans = 0;
        ans = this->no1 - this->no2;
        return ans;
    }
};

int main()
{
    Arithmetic aboj1(21 , 10);
    int result = 0;

    // result = addition(&aobj1);
    result = aboj1.addition();

    cout<<"Addition is : "<<result<<"\n";

    // result = subtraction(&aobj1);
    result = aboj1.subtraction();

    cout<<"Subtraction is : "<<result<<"\n";

    return 0;
}