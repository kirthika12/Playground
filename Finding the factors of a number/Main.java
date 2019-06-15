#include <stdio.h>
int main() 
{
  int n;
  scanf("%d",&n);
  for(int fact = 1 ; fact <= n ; fact++)
  {
    if(n % fact == 0)
      printf("%d\n",fact);
  }
	//Type your code
	return 0;
}