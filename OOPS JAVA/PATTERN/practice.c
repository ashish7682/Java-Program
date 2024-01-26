#include<stdio.h>
int main(){
    int i,j,n=6,a[6];
    printf("number of element in array:");
    scanf("%d",a[i]);
    for(i=0;i<n/2;i++)
    {
        int t=a[i];
        a[i]=a[n-1-i];
        a[n-i-1]=t;
    }
        for(i=0;i<=6;i++)
        {
            printf("a[%d]:%d\n",a[i]);
        }
}