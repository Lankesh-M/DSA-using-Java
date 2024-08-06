# # def generate_palindromic_numbers(n):
# #     palindromes = [3, 7]
# #     while len(palindromes) < n:
# #         for i in range(3, 8, 4):
# #             for j in range(10):
# #                 palindrome = int(str(i) + str(j) + str(i))
# #                 palindromes.append(palindrome)
# #     return palindromes[:n]

# # def nth_palindrome(n):
# #     palindromes = generate_palindromic_numbers(n)
# #     return palindromes[n - 1]

# # # Test for n from 1 to 20
# # for n in range(1, 21):
# #     print(f"The {n}th term in the palindrome series is: {nth_palindrome(n)}")
# def nth_palindrome(n):
#     if n == 1:
#         return 3
#     elif n == 2:
#         return 7
    
#     count = 2  # Already handled the first two palindromes (3, 7)
#     num = 33   # Starting with the next palindrome
    
#     while True:
#         num_str = str(num)
#         if all(digit in '37' for digit in num_str):
#             count += 1
#             if count == n:
#                 return num
#         num += 4  # Increment by 4 to get to the next potential palindrome

# # Test for n from 1 to 20
# for n in range(1, 21):
#     print(f"The {n}th term in the palindrome series is: {nth_palindrome(n)}")
def is_palindrome(num):
    # Convert number to string and check if it's equal to its reverse
    return str(num) == str(num)[::-1]

def nth_palindrome(n):
    if n == 1:
        return 3
    elif n == 2:
        return 7
    
    count = 2  # Already handled the first two palindromes (3, 7)
    num = 33   # Starting with the next palindrome
    
    while True:
        if is_palindrome(num) and all(digit in '37' for digit in str(num)):
            count += 1
            if count == n:
                return num
        num += 4  # Increment by 4 to get to the next potential palindrome

# Test for n from 1 to 20
for n in range(1, 21):
    print(f"The {n}th term in the palindrome series is: {nth_palindrome(n)}")
