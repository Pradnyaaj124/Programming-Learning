#include<iostream>
using namespace std;

int addition(int no1, int no2)
{
    int ans = 0;
    ans = no1 + no2;
    return ans;
}

int main(){
    int val1 = 0, val2 = 0, result = 0;

    cout<<"Enter First number: \n";
    cin>>val1;
    cout<<"Enter Second number: \n";
    cin>>val2;

    result = addition(val1 , val2);

    cout<<"Addition is: "<<result<<"\n";

    return 0;
}