// https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/php

function persistence(int $num): int {
    $count = 0;
    while (!is_one_digit_num($num)) {
        $num = array_product(str_split($num));
        $count++;
    }

    return $count;
}

function is_one_digit_num(int $num): bool {
    return strlen($num) === 1;
}

