let arr = [
    {
        name: 'rice',
        texture: 'grainy'
    },
    5,
    'hello',
    [3,2,8],
    true
];

console.log(arr);
console.log(arr[1]);
console.log(arr[3][0]);
console.log(arr[0].name);

let words = [
    'hello',
    'world',
    'hello',
    'Brenton',
    'Joseph'
]
console.log('');
words.push('guitar'); // add element to end
words.unshift('goodbye'); // add element to start

// one of the enhanced for loops
for(let word of words) {
    console.log(word);
}


