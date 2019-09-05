// JS is loosely typed, meaning variables themselves don't have a type
// that they much be but the data stored within does a have a type

function typeCheck(val) {
    console.log(`The value: ${val} is of type: ${typeof(val)}`);
}

typeCheck(5);
typeCheck(1.2);
typeCheck(true);
typeCheck([]); // array
typeCheck({}); // object
typeCheck('single quote');
typeCheck("double quote");
typeCheck(`template literal`);
typeCheck(undefined);
typeCheck(null);
typeCheck(NaN);
typeCheck(typeCheck);
