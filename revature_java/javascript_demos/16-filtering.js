let arr = [5,10,8,2,3,25,15, 'hello', null, undefined];

let result = arr.filter((ele) => {
    if(typeof(ele) !== 'number' || Number.isNaN(ele)) {
        return false;
    }
    return ele % 2 === 0;
})

console.log(result);

result = arr.filter(ele => !(ele % 2));
console.log(result);