// Link - https://www.hackerrank.com/challenges/functions-in-c/problem?isFullScreen=true

#include <stdio.h>
/*
Add `int max_of_four(int a, int b, int c, int d)` here.
*/
int max_of_four(int a, int b, int c, int d){
    
    int g1 = a > b ? a : b;
    int g2 = c > d ? c : d;
    return g1 > g2 ? g1 : g2;
}

int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);
    
    return 0;
}
