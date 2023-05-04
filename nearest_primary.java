// in python 

def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def nearest_prime(num):
    if is_prime(num):
        return num

    lower_num = num - 1
    while not is_prime(lower_num):
        lower_num -= 1

    higher_num = num + 1
    while not is_prime(higher_num):
        higher_num += 1

    if num - lower_num <= higher_num - num:
        return lower_num
    else:
        return higher_num


print(nearest_prime(4))





