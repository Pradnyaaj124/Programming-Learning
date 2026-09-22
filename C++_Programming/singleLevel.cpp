#include<iostream>
using namespace std;

class Base
{
    public:
        int i , j;

        Base()
        {
            cout<<"Inside Base Constructor\n";
        }

        ~Base()
        {
            cout<<"Inside Base Destructor\n";
        }

        void fun()
        {
            cout<<"Inside Base fun\n";
        }

        void gun()
        {
            cout<<"Inside Base gun\n";
        }


};

class Derived : public Base{
    public:
        int x,y;

        Derived()
        {
            cout<<"Inside Derived Construcor\n";
        }

        ~Derived()
        {
            cout<<"Inside Derived Destrucor\n";
        }

        void sun()
        {
            cout<<"Inside Derived sun\n";
        }

        
};

int main(){

    cout<<sizeof(Base)<<"\n";
    cout<<sizeof(Derived)<<"\n";

    return 0;
}