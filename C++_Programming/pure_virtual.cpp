#include<iostream>
using namespace std;

class base
{
    public:
        int i ,j;

        int addition( int no1, int no2)
        {
            return no1 + no2;
        }

        virtual int subtraction(int no1 , int no2) = 0;


};

class derived : public base
{
    public:
        int x;

        

};
int main(){

    base bobj;      // error
    derived dobj;  // error

    return 0;
}