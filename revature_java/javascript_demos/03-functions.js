// you can create a function using the function keyword
function add(a, b) {
    return a + b;
}

// or you can create a function using ES6 arrow notation 
let arrowAdd = (a,b) => {
    return a + b;
}

let result = add(5, 10);
console.log(`result = ${result}
arrowAdd(5,10) = ${arrowAdd(5,10)}`);

let b = add;
console.log(`
b = ${b}

b(10,10) = ${b(10,10)}`);

// you can invoke a function with as many or as few parameters are you want
console.log(add());
console.log(add(5,2,2,1));