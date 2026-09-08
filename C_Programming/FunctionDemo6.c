#include<stdio.h>

int addition(int no1 , int no2)
{
    int result = 0;
    result = no1 + no2; // business logic
    
    return result;
}

int main()
{
    int value1 = 0, value2 = 0, ans = 0;

    printf("Enter first number : \n");
    scanf("%d", &value1);

    printf("Enter Second number : \n");
    scanf("%d", &value2);

    ans = addition(value1 , value2);
    printf("Addition is : %d\n", ans);

    
    return 0;
}