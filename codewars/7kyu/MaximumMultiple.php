// https://www.codewars.com/kata/5aba780a6a176b029800041c/train/php

function maxMultiple($divisor, $bound) {
  $largest = 0;
  for ($i = 0; $i < $bound; $i++) {
    $temp = $bound - $i;
    if ($temp % $divisor == 0) {
      $largest = $temp;
      break;
    }
  }

  return $largest;
}

