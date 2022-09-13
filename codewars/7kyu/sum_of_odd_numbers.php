// https://www.codewars.com/kata/55fd2d567d94ac3bc9000064/train/php

function rowSumOddNumbers($n) {
  $first = $n * ($n - 1) + 1;
  
  $nums = [];
  $nums[] = $first;
  
  for ($i = 1; $i < $n; $i++) {
    $nums[] = $first + $i * 2;
  }
  
  return array_sum($nums);
}

