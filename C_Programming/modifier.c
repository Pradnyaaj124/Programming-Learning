#include<stdio.h>
int main(){

    int i = 11;
    short int j = 11;
    long int k = 11;

    printf("%d\n", sizeof(i));   //4
    printf("%d\n", sizeof(j));   //2
    printf("%d\n", sizeof(k));   //8

    
    return 0;
}