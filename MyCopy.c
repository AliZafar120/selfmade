#include <stdio.h>
#include <string.h>

char *copy(char *dest,char *src,int n)
{
    char *ch=dest;
    while(n--)
    {
        *dest++=*src++;
    }
    *dest='\0';

    return ch;

}



int main()
{
    char * astr="asd";
    int n=strlen(astr);
    int i;
    char dest[100];
    dest[3]='f';
    printf("%c",dest[3]);
    copy(dest,astr,n);

    for(i=0;i<4;i++)
    {
        printf("%c",*(dest+i));
    }



}
