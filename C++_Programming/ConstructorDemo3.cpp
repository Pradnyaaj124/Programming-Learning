#include<iostream>
using namespace std;

class PPA{
    public:
        int no1;
        int no2;

        //Default constructor
        PPA()
        {
            cout<<"Inside Default constructor\n";
        }

        //Parameterized Constructor
        PPA(int a, int b)
        {
            cout<<"Inside Parameterized constructor\n";
        }

        //Copy constructor
        PPA(PPA &obj)
        {
            cout<<"Inside Copy constructor\n";
        }

        
        ~PPA(){
            cout<<"Inside Destructor\n";
        }

};

int main(){

    PPA pobj1;          //default
    PPA pobj2(11,21);   //parameterized
    PPA pobj3(pobj1);   //copy

    return 0;
}