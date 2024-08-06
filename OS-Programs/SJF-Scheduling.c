#include <stdlib.h>
#include<stdio.h>
void main() 
{ 
    int i, n, p[10], st[10], at[10], bt[10], ft[10], wt[10], tt[10]; 
    int nextst, count, minsrt, minpos; 
    static int iscompleted[10]; 
    float rr[10], awt = 0, att = 0; 
    printf("\n\t SHORTEST JOB FIRST\n\t ******************"); 
    printf("\nEnter the no. of process to be executed : "); 
    scanf("%d", &n); 
    printf("\nEnter the process,arrival time and burst time\n"); 
    for (i = 0; i < n; i++) 
        scanf("%d %d %d", &p[i], &at[i], &bt[i]); 
    nextst = 0; 
    for (count = 0; count < n; count++){ 
        minsrt = 100; 
        minpos = 0; 
        for (i = 0; i < n; i++){ 
            if (at[i] <= nextst && iscompleted[i] == 0) 
            { 
                if (minsrt > bt[i]) 
                { 
                    minsrt = bt[i]; 
                    minpos = i; 
                } 
            } 
        } 
        i = minpos; 
        st[i] = nextst; 
        ft[i] = st[i] + bt[i]; 
        wt[i] = st[i] - at[i]; 
        tt[i] = wt[i] + bt[i]; 
        rr[i] = tt[i] / bt[i]; 
        iscompleted[i] = 1; 
        nextst = ft[i]; 
    } 
    printf("\n---------------------------------------"); 
    printf("\nPRO AT bT ST FT WT TT RR \n"); 
    printf("---------------------------------------\n"); 
    for (i = 0; i < n; i++){ 
        printf("%3d %2d %2d", p[i], at[i], bt[i]); 
        printf(" %3d %2d %2d %2d %4.2f\n", st[i], ft[i], wt[i], tt[i], rr[i]);     } 
    printf("---------------------------------------"); 
    for (i = 0; i < n; i++){ 
        awt = awt + wt[i]; 
        att = att + tt[i]; 
    } 
    awt = awt / n; 
    att = att / n; 
    printf("\nAverage waiting time is %5.2f", awt); 
    printf("\nAverage turn around time is %5.2f\n", att); 
} 