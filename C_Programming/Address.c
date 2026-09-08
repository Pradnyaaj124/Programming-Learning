#include<stdio.h>

int main(){
    int no = 21;


    printf("%d\n", no);             // 21
    printf("%d\n", sizeof(no));     // 4
    printf("%d\n", &no);

    return 0;
}

// gcc Address.c -o Myexe -w   - to remove warning(hide warning)