// URL: https://www.codewars.com/kata/59df2f8f08c6cec835000012

function meeting($s) {
    $s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";

    $first_and_last_names = [];
    // Analyze
    foreach (explode(";", $s) as $full_name) {
        $names = explode(":", $full_name);

        $first_name = strtoupper($names[0]);
        $last_name = strtoupper($names[1]);

        if (!isset($last_names[$last_name])) {
            $last_names[$last_name] = [];
        }

        $first_and_last_names[$last_name][] = $first_name;
    }

    // sort
    ksort($first_and_last_names, SORT_STRING);
    foreach ($first_and_last_names as $first_name => $last_names) {
        sort($last_names);
        $first_and_last_names[$first_name] = $last_names;
    }

    // build
    $result = "";
    foreach ($first_and_last_names as $first_name => $last_names) {
        foreach ($last_names as $last_name) {
            $result .= "(" . $first_name . ", " . $last_name . ")";
        }
    }

    return $result;
}

