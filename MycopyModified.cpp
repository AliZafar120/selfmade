#include <cstdio>
#include <cstring>

using namespace std;

void *coping(char *dest,char *src,int n)
{
    while(n--)
    {
        *dest++=*src++;
    }
    *dest='\0';
}

int main()
{
    char num1[101],num2[101],temp[101];
    int len1,len2,i,carry,a=0,b=0;
    scanf("%s",num1);
    if(num1[0]=='0')return 0;

    while(scanf("%s",&num2)==1 && num2[0]!='0')
    {
        len1=strlen(num1);
        len2=strlen(num2);
        carry=0;
        memset(temp,0,101);

        for(i=100;i>=0;i--)
        {
            //printf("%c %c \n",num1[len1-1],num2[len2-1]);
            if(--len1>=0) a=(int)num1[len1]-'0';
            if(--len2>=0) b=(int)num2[len2]-'0';
            temp[i]='0'+(a+b+carry)%10;
            carry=(a+b+carry)/10;
            a=0;
            b=0;
            if(len1<=0 && len2 <=0 && carry==0) break;
        }
        len1=0;
        len2=0;

        coping(num1,temp+i,100-i+1);


    }

    printf("%s\n",num1);

    return 0;

}
