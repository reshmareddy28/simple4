#include<stdio.h>
int main()
{
int s,m,s1=0,s2=0,sum;
scanf("%d",&s);
for(m=1;m<=s;m++)
{
if((m%2)!=0)
{
s1=s1+(m*m*m);
}
else
{
s2=s2+(m*m);
}
}
sum=s1+s2;
printf(sum);
return 0;
}
