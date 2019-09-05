// ... is the spread operator, it can be used in function
// parameters for variable arguments
function add(...nums) {
    let result = 0;
    for(let num of nums) {
        result += num;
    }
    return result;
}
console.log(add(5,2,3,1,8));

// it can be also used with arrays
let arr = [1,2,3,4];

let arr2 = [...arr, 8,3,9, ...arr];
arr2 = [...arr2, 5];
console.log(arr2);


// it can also be used with objects
let obj = {
    myField: 'hello',
    field2: 'world',
    age: 5
}

let obj2 = {
    ...obj,
    field2: 'will it change?',
    field4: true
}

console.log(obj2);