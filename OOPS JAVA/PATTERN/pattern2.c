#include<stdio.h>
int main()
{
    int i,j;
    for(i=1;i<=2;i++)
    {
    for(j=1;j<=3;j++)
    {
        if(i+j<=3)
        {
            printf(" ");
        }
        else
        {
            printf("*");
        }
    }
        printf("\n");

        
    }  

    for(i=3;i<=1;i--)
    {
        for(j=1;j<=3;j++)
        {
            if(i+j<=3)
            {
                printf(" ");
            }
            else
            {
                printf("*");
            }
        }            printf("\n");

    }
}
