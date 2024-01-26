#include<stdio.h>
int main(){
    int n,s,i,j;
    printf("enter number of rowws:");
    scanf("%d",&n);
   for(int i=1;i<=n;i++)
      {
         for(int j=1;j<=i;j++)
         {
           printf("*");
         }
         printf("\n");
}
 for(int i=n-1;i>=1;i--)
    {
        for(int j=1;j<=i;j++)
        {
            printf("*");
        }
        printf("\n");
    }
}