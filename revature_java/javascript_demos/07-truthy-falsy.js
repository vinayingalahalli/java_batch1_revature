
function testTruthyFalsy(val) {
    console.log(`val = ${val} with type: ${typeof(val)} 
    and val evaluates to ${!!val} in a boolean context`);
}

testTruthyFalsy(undefined);
testTruthyFalsy(NaN);
testTruthyFalsy(null);
testTruthyFalsy(0);
testTruthyFalsy('');
testTruthyFalsy(false);
testTruthyFalsy(500);
testTruthyFalsy(-30);
testTruthyFalsy('true');
testTruthyFalsy(true);
testTruthyFalsy(testTruthyFalsy);
testTruthyFalsy([]); // empty array
