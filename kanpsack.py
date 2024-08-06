def knapsack(weights, values, capacity):
    n = len(weights)
    dp = [[0] * (capacity + 1) for _ in range(n + 1)]

    for i in range(1, n + 1):
        for j in range(1, capacity + 1):
            if weights[i - 1] <= j:
                dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - weights[i - 1]] + values[i - 1])
            else:
                dp[i][j] = dp[i - 1][j]
            print(f"F({i},{j}) = {dp[i][j]}")
weights = [1, 2, 2]
values = [18, 16, 6]
capacity = 4

max_value = knapsack(weights, values, capacity)
print("Maximum value that can be obtained:", max_value)
