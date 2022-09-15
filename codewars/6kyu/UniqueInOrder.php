// https://www.codewars.com/kata/54e6533c92449cc251001667

function uniqueInOrder($iterable){
    if ($iterable === '') return [];

    $target_items = is_array($iterable) ? $iterable : str_split($iterable);

    $unique_items = [];
    foreach ($target_items as $target_item) {
        if (empty($unique_items)) {
            $unique_items[] = $target_item;
            continue;
        }

        $last_item_index = count($unique_items) - 1;

        if ($target_item !== $unique_items[$last_item_index]) {
            $unique_items[] = $target_item;
        }
    }

    return $unique_items;
}

