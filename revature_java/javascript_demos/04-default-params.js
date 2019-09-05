// you can provide defalt values to be used a parameter is not provided
function add(a, b, c = 0, d = 0) {
    return a + b + c + d;
}

console.log(add(1,2));
// if you provide undefined for a parameter it will use default value
console.log(add(1,2,undefined,8));