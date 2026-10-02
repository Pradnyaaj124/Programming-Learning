#include<iostream>
using namespace std;

#pragma pack(1)
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

#pragma pack(1)
class derived : public base
{
    public:
        int x;

        int subtraction(int no1 , int no2)
        {
            return no1 - no2;
        }

        int multiplication(int no1 , int no2)
        {
            return no1 * no2;
        }
        

};
int main(){

    derived dobj;

    cout<<"size of base class is : "<<sizeof(base)<<"\n";

    cout<<"size of derived class is : "<<sizeof(derived)<<"\n";

    int ret = 0;
    ret = dobj.addition(11,10);
    cout<<"addition is : "<< ret <<"\n";

    ret = dobj.subtraction(11,10);
    cout<<"subtraction is : "<< ret <<"\n";

    ret = dobj.multiplication(11,10);
    cout<<"multiplication is : "<< ret <<"\n";


    return 0;
}