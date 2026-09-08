#include<stdio.h>

#pragma pack(1)
struct Demo
{
    int i;
    float f;
    double d;
};

int main()
{
    struct Demo dobj;

    dobj.i = 11;
    dobj.f = 3.14f;
    dobj.d = 456.65432;

    printf("%d\n", dobj.i);
    printf("%f\n", dobj.f);
    printf("%lf\n", dobj.d);
    
    return 0;
}
