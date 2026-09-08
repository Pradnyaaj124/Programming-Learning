#include<stdio.h>

int main(){

    int arr[] = {10,20,30,40};

    printf("%d\n", arr[2]);
    printf("%d\n", *(arr + 2));
    printf("%d\n", *(2 + arr));
    printf("%d\n", 2[arr]);;

    return 0;
}