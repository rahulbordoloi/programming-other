#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<sys/types.h>
#include<io.h>
#include<process.h>
#include<fcntl.h>
#include<unistd.h>
int main()
{
    int a;
    int k[2];
    char send[10]="abc";
    char rec[10];
    pipe(k);
    a=fork();
    if(a != 0){
        write(k[1],send,strlen(send)+1);
    }
    else
    {
        read(k[0],rec,10);
    }
    printf("%s \n",rec);
    return(0);
    
}
