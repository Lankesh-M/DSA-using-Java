# def smallest_subarray_with_k_distinct(nums, k):
#     a,b=0,k
#     while (b<len(nums)):
#         new=nums[a:b+1]
#         if len(set(new))==k:
#             return a,b
#         else:
#             a+=1
#             b+=1
#     else:
#         return -1


# def main():
#     test_cases = [
#         [2],
#         [1, 2, 1]
#     ]
#     test_k_values = [1, 3]
#     expected_results = [
#         [0, 0], [-1]
#     ]
#     num_test_cases = len(test_cases)
#     num_passed = 0
#     for i in range(num_test_cases):
#         print("Test case", i + 1, ": ", end="")
#         if smallest_subarray_with_k_distinct(test_cases[i], test_k_values[i]) == expected_results[i]:
#             print("Passed")
#             num_passed += 1
#         else:
#             print("Failed")
#     if num_passed == num_test_cases:
#         print("All test cases passed! Problem solved.")
#     else:
#         print("Number of test cases passed:", num_passed, "/", num_test_cases)


# if __name__ == "__main__":
#     main()

def knapsack(weights, values, capacity):
    n = len(weights)
    dp = [[0] * (capacity + 1) for _ in range(n + 1)]

    for i in range(1, n + 1):
        for j in range(1, capacity + 1):
            if weights[i - 1] <= j:
                dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - weights[i - 1]] + values[i - 1])
            else:
                dp[i][j] = dp[i - 1][j]
                
                print(f"F({i},{j}) = {dp[i][j]}" + f"  {weights[i-1]} . {j}")

    return dp[n][capacity]

weights = [1, 2, 2]
values = [18, 16, 6]
capacity = 4

max_value = knapsack(weights, values, capacity)
print("Maximum value that can be obtained:", max_value)