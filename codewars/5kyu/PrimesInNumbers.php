// URL: https://www.codewars.com/kata/54d512e62a5e54c96200019e/php

function primeFactors($n) {
    $prime_numbers_counts = [];

    $first_prime_number = 2;
    while ($n !== 1) {
        $i = $first_prime_number;
        while ($i < 0xFFFFFF) {
            if ($n % $i === 0) {
                if (!isset($prime_numbers_counts[$i])) {
                    $prime_numbers_counts[$i] = 0;
                }

                $prime_numbers_counts[$i]++;
                $n /= $i;
                break;
            }

            $i++;
        }
    }

    $result = '';
    foreach ($prime_numbers_counts as $prime_number => $count) {
        $result .= '(';

        if ($count === 1) {
            $result .= $prime_number;
        } else {
            $result .= $prime_number . '**' . $count;
        }

        $result .= ')';
    }

    return $result;
}
