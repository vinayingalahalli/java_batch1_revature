
function iterate(arr, cb) {
    for(let i = 0; i < arr.length; i++) {
        cb(arr[i], i);
    }
}

function myCallback(element, index) {
    console.log(`index: ${index}, element: ${element}`);
}

let arr = [5,2,8,10,15,32];
// iterate(arr, myCallback);

arr.__proto__.myForEach = function(cb) {
    for(let i = 0; i < this.length; i++) {
        cb(this[i], i);
    }
}
// we recreated the for each
arr.myForEach((element,index) => {
    console.log(`index: ${index}, element: ${element}`);
})

arr.forEach((element,index) => {
    console.log(`index: ${index}, element: ${element}`);
})
