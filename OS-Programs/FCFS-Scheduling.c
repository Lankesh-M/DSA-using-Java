 #include<stdio.h>
 void main(){
 
 int c = 0, i, n, bt[10], at[10], wt[10], ft[10]; 
    int st[10], tat[10]; 
    float awt = 0, atat = 0, rr[10]; 
    printf("Enter the number of process : "); 
    scanf("%d", &n); 
    for (i = 1; i <= n; i++) 
    { 
        printf("Enter the arrival time and burst time for the process %d : ", i); 
        scanf("%d %d", &at[i], &bt[i]); 
    } 
    for (i = 1; i <= n; i++) 
    { 
        st[i] = c; 
        c = c + bt[i]; 
        wt[i] = st[i] - at[i]; 
        ft[i] = st[i] + bt[i]; 
        tat[i] = wt[i] + bt[i]; 
        rr[i] = tat[i] / bt[i]; 
    } 
    for (i = 1; i <= n; i++) 
    { 
        awt = awt + wt[i]; 
        atat = atat + tat[i]; 
    } 
    awt = awt / n; 
    atat = atat / n; 
    printf("\n\t\t CPU SCHEDULING\n\t\t ***************"); 
    printf("\n\t\t FIRST COME FIRST SERVE\n\t\t **********************"); 
    printf("\n--------------------------------------------------------------\n"); 
    printf("proc\t at\t bt\t st\t ft\t wt\t tat\t rr\t\n"); 
    printf("--------------------------------------------------------------"); 
    for (i = 1; i <= n; i++) 
    { 
        printf("\n %d\t %d\t %d\t %d\t %d\t %d\t %d\t %5.2f", i, at[i], bt[i], st[i], ft[i], wt[i], tat[i], rr[i]);
  } 
    printf("\n--------------------------------------------------------------"); 
    printf("\n Average waiting time is %5.2f\n average tat is %5.2f\n\n", awt, atat);
    }