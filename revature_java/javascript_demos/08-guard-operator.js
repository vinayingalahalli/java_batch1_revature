
function testGuardOperator(a, b) {
    let resultGuard = a && b; // guard operator
    let resultDefault = a || b;
    console.log(`a: ${a} and    b: ${b}
    a && b = ${resultGuard}
    a || b = ${resultDefault}`)
}

testGuardOperator(5, 10);
testGuardOperator('John', 'Stone');
testGuardOperator(0, 'hello');
testGuardOperator(-1, 0);
testGuardOperator(null, undefined);


