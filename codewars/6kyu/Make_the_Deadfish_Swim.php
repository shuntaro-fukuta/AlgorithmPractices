// https://www.codewars.com/kata/51e0007c1f9378fa810002a9/train/php

function parse($data) {
  $commands = str_split($data);

  $value = 0;
  $outputs = [];
  foreach(str_split($data) as $word) {
      if($word == 'i') $value++;
      if($word == 'd') $value--;
      if($word == 's') $value = pow($value, 2);
      if($word == 'o') $outputs[] = $value;
  }

  return $outputs;
}

