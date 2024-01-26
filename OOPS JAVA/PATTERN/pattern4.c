#include<stdio.h>
int main(){
    int i,j,n;
    printf("enter the value of n:");
    scanf("%d",&n);
    for(i=n/2;i<=n;i++)
    {
        for(j=1;j<n-i;j=j+2)
        {
            printf(" ");
        }
        for(j=1;j<=i;j++)
        {
          printf("*"); 
        }
        for(j=1;j<=n-i;j++)
        {
            printf(" ");
        }
         for(j=1;j<=i;j++)
        {
          printf("*"); 
        }
        

    }
}   