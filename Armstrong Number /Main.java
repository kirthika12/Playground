#include <stdio.h>
int main() {
  int n,sum=0,temp,rem,dig=0;
  scanf("%d",&n);
  temp=n;
  while(temp!=0)
  {
    dig++;
    temp=temp/10;
  }
  temp=n;
  while(temp!=0)
  {
    rem=temp%10;
    sum=sum+pow(rem,dig);
    temp=temp/10;
  }
  if(n==sum)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	//Type your code
	return 0;
}