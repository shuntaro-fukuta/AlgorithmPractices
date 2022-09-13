// https://www.codewars.com/kata/514b92a657cdc65150000006/train/php

function solution($number){
  if ($number == 0) return 0;

  $sum = 0;
  for ($i = 1; $i < $number; $i++) {
    $temp = $number - $i;
    
    if ($temp % 3 == 0 || $temp % 5 == 0) {
      $sum += $temp;
    }
  }
  
  return $sum;
}

