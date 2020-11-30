from typing import List
import random


def generate_10_numbers_from_0_until_100() -> List[int]:
    List = random.sample(range(0,100), k=10)
    return List

def print_list(numbers: List[int]) -> List[int]:
    for i in numbers:
        print(i)

def sort_in_ascending_order(numbers: List[int]) -> List[int]:
    b = sorted(numbers)
    return b

def remove_content_which_number_is_under_50(numbers: List[int]) -> List[int]:
    c = [i for i in numbers if not i < 50]
    return c

if __name__ == '__main__':
    a = generate_10_numbers_from_0_until_100()
    print_list(a)
    print(sort_in_ascending_order(a))
    print(remove_content_which_number_is_under_50(sort_in_ascending_order(a)))
