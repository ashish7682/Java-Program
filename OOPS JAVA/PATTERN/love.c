#include<stdio.h>
int main(){
    int r,c;
    for(r=0;r<=2;r++)

    {
        for(c=0;c<=17;c++)
        {
            if((c>=3-r && c<=6+r)||(c>=12-r && c<=15+r))
            printf("*");
            else{
                printf(" ");
            }
        }
        printf("\n");
    }
    for(r=0;r<=9;r++)
    {
    for(c=1;c<=17;c++)
      {
     if(c>=r+1 && c<=17-r)
     printf("*");
     else
        printf(" ");
       } printf("\n");


    }
}