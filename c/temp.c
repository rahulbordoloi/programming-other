#include<stdio.h>

#define fast ios_base::sync_with_stdio(0);cin.tie(NULL);cout.tie(NULL)
#define f(i,a,b) for(i=a;i<b;i++)
#define fr(i,a,b) for(i=a;i>=b;i--)
#define sp "\t"
#define ll long long int
#define ff first
#define ss second
#define pb push_back
#define mp make_pair
#define mod 1000000007

//using namespace std;

struct abc
{
    int x;
    struct xyz z;
}q;
struct xyz
{
    int y;
}w;

main(/*int argc, char **argv*/)
{
    //int i;
    //cout<<"You have entered "<<argc<<" arguments:"<<"\n"; 
    //f(i,0,argc) 
      //cout<<argv[i]<<"\n";   
    
    //return 0;
    //int a,b;
    scanf("%d%d",&q.x,&q.z.y);
    //q.x=atoi(argv[1]);
    //w.y=atoi(argv[2]);
    printf("ABC = %d \t XYZ = %d",q.x,q.z.y);
}