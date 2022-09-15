<?php

// https://www.codewars.com/kata/52597aa56021e91c93000cb0/php

function moveZeros(array $items): array
{
    $zero_count = 0;
    foreach ($items as $index => $item) {
        if ($item === 0 || $item === 0.0) {
            $zero_count++;
            unset($items[$index]);
        }
    }

    for ($i = 0; $i < $zero_count; $i++) {
        $items[] = 0;
    }

    return array_values($items);
}

