// URL: https://www.codewars.com/kata/56a5d994ac971f1ac500003e

function longestConsec($strarr, $k) {
    if ($k < 0) return '';

    $longest_consecutive_word = '';

    $strarr_count = count($strarr);
    for ($i = 0; $i <= $strarr_count - $k; $i++) {
        $words = array_slice($strarr, $i, $k);
        $concatenated_words = implode('', $words);
        if (strlen($concatenated_words) > strlen($longest_consecutive_word)) {
            $longest_consecutive_word = $concatenated_words;
        }
    }
    return $longest_consecutive_word;
}

