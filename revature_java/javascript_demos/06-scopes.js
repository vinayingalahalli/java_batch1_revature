// right here let and var are "global" scoped variables,
// really in modern JS they are module scoped variables
let a = 5;
// let a = 10; // can't redeclare variables that have been declared with let or const
var b = 10;
var b = 15;

// function parameters are scoped to the function
function add(one, two) {
    // console.log(`c = ${c}`);
    console.log(`d = ${d}`);
    console.log(`a = ${a}`)
    console.log(`one = ${one}`)
    if(true) {
        let c = 5;
        var d = 'what?';
        h = 'hello'; // don't do this
        console.log(`h = ${h}`);
    }
    console.log(`d = ${d}`);
    // console.log(c);
}
add(5,10);

console.log(`h = ${h}`);
console.log(global)