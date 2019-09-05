let arr = [1,2,3,5,10,12,15,27,28,30,77,82,100];

let result = arr.map(ele => {
    if(ele % 3 === 0) {
        if(ele % 5 === 0) {
            return 'fizzbuzz'
        }
        return 'fizz';
    } else if(ele % 5 === 0) {
        return 'buzz';
    } else {
        return ele;
    }
});

console.log(arr);
console.log(result);