#include <iostream>
using namespace std;

class Base
{
    public:
        int i , j;
    void fun(){
        cout<<"Inside fun of Base";
    }
};

#pragma pack(1)
class Derived : public Base
{
    public:
        int x;
    void fun(){
        cout<<"Inside fun of Derived";
    }
};


int main() {

    cout<<sizeof(Base)<<"\n";
    cout<<sizeof(Derived)<<"\n";

    Base * bp = new Derived();
    bp -> fun();
   
    return 0;
}