// == or != will attempt type coercion, always use === or !==

function compare(one, two) {
    console.log(`one = ${one} and is type: ${typeof(one)}
    two = ${two} and is type: ${typeof(two)}
    one == two returns: ${one == two}
    one === two returns: ${one === two}
    `);
}

compare(0, '0');
compare(1, '1');
compare(null, undefined);
compare('true', true);
compare({}, {});
compare({}, []);
compare(NaN, NaN);
compare(NaN, undefined);